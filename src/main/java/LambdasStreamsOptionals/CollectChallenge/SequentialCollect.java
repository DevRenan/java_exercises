package LambdasStreamsOptionals.CollectChallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SequentialCollect {
    public static void main(String[] args) {
        List<String> sentences = List.of(
                "Java is great",
                "I love programming in Java",
                "Streams are powerful"
        );
        getSortedUniqueWordsEnhanced(sentences);
    }

    private static void getSortedUniqueWordsV1(List<String> sentences) {
        List<String> orderedUniqueList = sentences.stream()
                .collect(HashSet<String>::new,(hashSet, s) -> hashSet.addAll(Arrays.stream(s.split(" ")).toList()) , HashSet::addAll)
                .stream().sorted().collect(Collectors.toList());
        System.out.println(orderedUniqueList);
    }

    private static void getSortedUniqueWordsEnhanced(List<String> sentences) {
        List<String> orderedUniqueList = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" "))) // Une todas as palavras em um único fluxo
                .collect(Collectors.toCollection(TreeSet<String>::new)) // Remove duplicatas e ordena automaticamente
                .stream().toList(); // Converte para uma lista novamente
        System.out.println(orderedUniqueList);
    }
}
