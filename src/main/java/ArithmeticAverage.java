import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArithmeticAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        List<Integer> dividibleByThree = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                dividibleByThree.add(i);
            }
        }

        System.out.println(dividibleByThree.stream().mapToInt(Integer::intValue).sum() / (float) dividibleByThree.size());
    }
}
