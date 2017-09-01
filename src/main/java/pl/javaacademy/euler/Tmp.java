package pl.javaacademy.euler;

import java.util.BitSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/*
 * class for temporary calculations, helpers
 */
public class Tmp {

    private static long lastGenerated = 21;

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
    }
}

/*        LongStream.generate(Tmp::getNumber).limit(20)
                .forEach(System.out::println);
        LongStream.rangeClosed(1,20).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::print);*/

/*        final int limit = 1_000;
        final BitSet sieve = new BitSet(limit+1);
        final IntSummaryStatistics stats = IntStream.rangeClosed(2, limit)
                .filter(x -> !sieve.get(x))
                .peek(x -> {
                    if (x*x < limit)
                        for(int i = x; i <= limit; i+=x)
                            sieve.set(i);
                })
                .summaryStatistics();
        System.out.printf("%d", stats.getCount(), stats.getSum());
    }

    private static long getNumber() {
        long next = lastGenerated - 1;
        lastGenerated = next;
        return next;
    }*/
