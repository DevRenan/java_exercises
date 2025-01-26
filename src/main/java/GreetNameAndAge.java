import java.util.Scanner;

public class GreetNameAndAge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();

        System.out.println("Hello, I am "+name+"! I am "+ age+" years old.");

        sc.close();
    }
}
