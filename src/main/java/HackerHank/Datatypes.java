package HackerHank;
import java.util.*;

public class Datatypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        ArrayList<Deque> deques = new ArrayList<>();

        for (int i = 0; i < testCases; i++) {
            Deque<String> output = new ArrayDeque<>();
            String x = scanner.next();
            try{
                Long.parseLong(x);
                output.push("* long");
                Integer.parseInt(x);
                output.push("* int");
                Short.parseShort(x);
                output.push("* short");
                Byte.parseByte(x);
                output.push("* byte");
            }catch (NumberFormatException e){
                if (output.isEmpty()){
                    Deque<String> resultOverflow = new ArrayDeque<>();
                    resultOverflow.push(x+" can't be fitted anywhere.");
                    deques.add(resultOverflow);
                }
            }finally {
                if (!output.isEmpty())
                    output.push(x+" can be fitted in:");
            }
            deques.add(output);
        }
        deques.forEach( outputs -> outputs.forEach(System.out::println));
    }
}