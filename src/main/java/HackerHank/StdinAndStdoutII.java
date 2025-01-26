package HackerHank;

import java.util.Scanner;

public class StdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        double myDouble = scanner.nextDouble();
        scanner.nextLine(); // Vai pegar o Enter de cima
        String myString = scanner.nextLine();
        scanner.close();

        System.out.println("String: "+ myString);
        System.out.println("Double: "+ myDouble);
        System.out.println("Int: "+ myInt);
    }
}
