package LambdasStreamsOptionals.CollectChallenge;

import java.util.*;
import java.util.stream.Collectors;

public class ParalallelCollect {
    public static void main(String[] args) {
        List<String> words = List.of("Java", "is", "fun", "powerful", "and", "It's", "the", "best", "programming", "language", "in","the","world!");

        turnIntoSentence(words);
    }

    private static void turnIntoSentence(List<String> words) {
        String sentence = words.parallelStream().collect(StringBuilder::new, (sb, word) -> sb.append(word).append(" "), StringBuilder::append).toString();
        System.out.println(sentence);
    }
    private static void turnIntoSentenceEnhanced(List<String> words) {
        String sentence = words.parallelStream().collect(Collectors.joining(" "));
        System.out.println(sentence);
    }

    private static void getSortedUniqueWordsEnhanced(List<String> sentences) {
        List<String> orderedUniqueList = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" "))) // Une todas as palavras em um único fluxo
                .collect(Collectors.toCollection(TreeSet<String>::new)) // Remove duplicatas e ordena automaticamente
                .stream().toList(); // Converte para uma lista novamente
        System.out.println(orderedUniqueList);
    }
}
