import java.util.Arrays;

import static java.util.Comparator.comparing;

public class MethodReferenceMain {
    public static void main(String[] args) {
        var palavras = Arrays.asList( "Renan", "Manoel", "Madalena", "Gabi" );
        palavras.forEach( palavra -> System.out.println( palavra ) );
        palavras.sort( comparing( String::length ) );
        System.out.println( palavras );


        palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));

//        Comparator<String> comparator = Comparator.comparing(s -> s.length());
//        palavras.sort(comparator);

//        palavras.sort(Comparator.comparing(s -> s.length()));

//        Function<String, Integer> funcao = s -> s.length();
//        Comparator<String> comparator = Comparator.comparing(funcao);
//        palavras.sort(comparator);

        //palavras.sort(Comparator.comparing(String::length));
        palavras.sort(comparing(String::length)); //Usando import estático

        palavras.sort(String.CASE_INSENSITIVE_ORDER);
        palavras.forEach(System.out::println);
    }
}
