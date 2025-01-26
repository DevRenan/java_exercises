

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractorUtil {

    static final long GOLDEN_GATE_DAYS = 4;

    public static Long calculateQtdFinalDays(String processDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        var procesDateConverted = LocalDate.parse(processDate, formatter);
        return Math.max(ChronoUnit.DAYS.between(procesDateConverted, LocalDate.now()), GOLDEN_GATE_DAYS);
    }

    public static boolean isThisWeekInRangeFilter(LocalDate rangeDate, Long qtdDaysGG) {
        var daysDiference = rangeDate.until(LocalDate.now(), ChronoUnit.DAYS);
        return daysDiference < qtdDaysGG;
    }

    public static LocalDate createWeekDiferenceRangeDayWithDates(LocalDate startDate, LocalDate endDate, boolean isGoldenGateRange, Long qtdFinalDays) {

        if (isGoldenGateRange) {
            var daysDifference = Duration.between(startDate.atStartOfDay(),
                    endDate.atStartOfDay()).toDays();
            var daysToSubtract = Math.min(daysDifference, qtdFinalDays);

            var lessDiferenceDate = endDate.minusDays(daysToSubtract);
            var lessOneWeek = LocalDate.now().minusDays(qtdFinalDays);

            return lessDiferenceDate.isAfter(lessOneWeek) ? lessDiferenceDate : lessOneWeek;
        } else {
            return endDate;
        }
    }

    public static LocalDate getDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(date.split(" ")[0], formatter);
    }

    public static String getDateTime(LocalDate localDate, String date){
        String[] s = date.split(" ");
        String[] horario = s[1].split(":");
        LocalDateTime dataHora = LocalDateTime.of(localDate, LocalTime.of(Integer.parseInt(horario[0]), Integer.parseInt(horario[1]), Integer.parseInt(horario[2])));
        return dataHora.toString().replace("T", " ");
    }

    public static String getDocumentsParseString(List<String> documentsNumberList) {
        return documentsNumberList.stream()
                .map(documentNumber -> "'" + documentNumber + "'")
                .collect(Collectors.joining(","));
    }

    public static String getDocumentNumberNormalized(String documentNumber) {
        documentNumber = documentNumber.replaceAll("[^0-9]", "");

        while (documentNumber.length() > 14 && documentNumber.startsWith("0")) {
            documentNumber = documentNumber.substring(1);
        }

        return documentNumber;
    }
}
