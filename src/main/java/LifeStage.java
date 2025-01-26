import java.util.Scanner;

public class LifeStage {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        System.out.println(calculateLifeStage(age));
    }

    private static String calculateLifeStage(int age) {
        if (age <= 12)
            return "Child";
        if (age <= 17)
            return "Teenager";
        if (age <= 59)
            return "Adult";
        return "Senior Citizen";
    }
}
