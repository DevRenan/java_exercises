import java.util.Scanner;

public class SquareCubeFourth {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println((int) Math.pow(n, 2));
        System.out.println((int) Math.pow(n, 3));
        System.out.println((int) Math.pow(n, 4));
    }
}
