package HackerHank;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.next();
        int firstInt = scanner.nextInt();
        String secondtString = scanner.next();
        int secondInt = scanner.nextInt();
        String thirdtString = scanner.next();
        int thirdInt = scanner.nextInt();
        scanner.close();
        System.out.println("================================");
        System.out.printf("%-15s  %03d%n",firstString, firstInt);
        System.out.printf("%-15s  %03d%n",secondtString, secondInt);
        System.out.printf("%-15s  %03d%n",thirdtString, thirdInt);
        System.out.printf("================================");
    }
}

//java 100
//cpp 65
//python 50

