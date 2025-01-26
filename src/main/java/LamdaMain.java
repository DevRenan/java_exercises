import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LamdaMain {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");
        Consumer<String> consumer = new ConsumidorDeString();


        palavras.forEach(consumer);

        palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
        palavras.forEach(consumer);

        palavras.add("Rust 23");
        Comparator<String> comparator = (x1,x2) -> Integer.compare(x1.length(), x2.length());
        palavras.sort(comparator);
        palavras.forEach(consumer);

    }
}










//        palavras.sort(new Comparator<String>(){
//            @Override
//            public int compare(String s1, String s2) {
//                if(s1.length() < s2.length())
//                    return -1;
//                if(s1.length() > s2.length())
//                    return 1;
//                return 0;
//            }
//        });
//        palavras.sort((s1,s2) -> {
//                if(s1.length() < s2.length())
//                    return -1;
//                if(s1.length() > s2.length())
//                    return 1;
//                return 0;
//        });



