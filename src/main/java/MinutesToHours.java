import java.util.Scanner;

public class MinutesToHours {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMinutes = scanner.nextInt();

        var hours = totalMinutes / 60;
        var minutes = totalMinutes % 60;
        System.out.println(hours + " hours and " + minutes+ " minutes");

    }
}
