import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Optional;


public class CsvFormatter {

    private static final Locale LOCALE_BR = Locale.forLanguageTag("pt-BR");

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private static final String CARD_TYPE_VEHICLE = "Veículo";
    private static final String CARD_TYPE_DRIVER = "Motorista";
    private static final String CARD_TYPE_STOCK = "Estoque";
    private static final String CARD_TYPE_OPERATIONAL_BASE = "Base Operacional";

    public static NumberFormat getNumberFormatter(){
        var numberInstance = NumberFormat.getNumberInstance(LOCALE_BR);
        numberInstance.setGroupingUsed(false);
        numberInstance.setRoundingMode(RoundingMode.DOWN);
        return numberInstance;
    }



    public static String formatDate(LocalDateTime date) {
        if( date == null ) {
            return "";
        }
        return date.format(DATE_TIME_FORMATTER);
    }

    public static String formatCardType(String cardType) {

        var safeCardType = Optional.ofNullable(cardType)
                .orElse("0");

        switch (safeCardType) {
            case "1":
                return CARD_TYPE_VEHICLE;
            case "2":
                return CARD_TYPE_DRIVER;
            case "3":
                return CARD_TYPE_STOCK;
            case "4":
                return CARD_TYPE_OPERATIONAL_BASE;
            default:
                return cardType;
        }
    }

    public static String formatNumber(BigDecimal value) {
        if ( value == null ) {
            return "";
        }
        return getNumberFormatter().format(value);
    }

    public static String formatNumber(String value) {
        if ( value == null || value.isEmpty()) {
            return "";
        }
        return getNumberFormatter().format( new BigDecimal(value));
    }

    public static String formatTagField(String fullString, String tagToExtract) {

        String[] arrayString = Optional.ofNullable(fullString)
                .orElse("")
                .trim()
                .split(tagToExtract);
        if( arrayString.length < 2 ) {
            return "";
        }

        return arrayString[1];
    }

}
