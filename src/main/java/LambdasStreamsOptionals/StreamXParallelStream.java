package LambdasStreamsOptionals;

import java.util.List;
import java.util.Random;

public class StreamXParallelStream {
    public static void main(String[] args) {
        List<Long> numbers = new Random().longs(1_000_000_00L, 1, 100000).boxed().toList();

        // Teste com stream() (sequencial)
        long startTime = System.currentTimeMillis();
        long sumSequential = numbers.stream().mapToLong(n -> (long) n * n).sum();
        long endTime = System.currentTimeMillis();
        System.out.println("Strem Sequencial - Tempo: " + (endTime - startTime) + "ms, Soma: "+ sumSequential);

        // Teste com parallelStream() (paralelo)
        startTime = System.currentTimeMillis();
        long sumParallel = numbers.parallelStream().mapToLong(n -> (long) n * n).sum();
        endTime = System.currentTimeMillis();
        System.out.println("Strem Paralela - Tempo: " + (endTime - startTime) + "ms, Soma: "+ sumParallel);
    }
}
