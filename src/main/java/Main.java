import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.IntStream.range;

public class Main {
    public static void main( String[] args ) {
        var palavras = Arrays.asList( "Renan", "Manoel", "Madalena", "Gabi" );
        palavras.forEach( palavra -> System.out.println( palavra ) );
        palavras.sort( Comparator.comparing( String::length ) );
        System.out.println( palavras );

        List< List<String> > nomesEFrases = new ArrayList<>();
        nomesEFrases.add(List.of("Chaves", "Prefiro morrer que perder a vida"));
        nomesEFrases.add(List.of("João Carvalho", "O capitalismo falhou, falha e falhará em cada uma das sociedades onde ele colocar os seus tentáculos que se baseiam na expropriação e na exploração do homem pelo homem. É isso o que nós combatemos!"));

//        var x = nomesEFrases.stream().flatMap( Collection ::stream).collect( Collectors.toList());
//        System.out.println(x);

        var x = range(0,100).boxed().map(l -> l*2);
        System.out.println(x);
    }
}