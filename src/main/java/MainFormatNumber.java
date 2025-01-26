import java.math.BigDecimal;

public class MainFormatNumber {
    public static void main(String[] args) {
        System.out.println(CsvFormatter.formatNumber(new BigDecimal(23.5)) );
        System.out.println(CsvFormatter.formatNumber(new BigDecimal(100)) );
        System.out.println(CsvFormatter.formatNumber(new BigDecimal(192)) );
        System.out.println(CsvFormatter.formatNumber(new BigDecimal(1.92)) );

    }
}
