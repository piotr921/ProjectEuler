package pl.javaacademy.euler;

import java.util.Comparator;
import java.util.stream.LongStream;

/*
 * class for temporary calculations, helpers
 */
public class Tmp {

    private static long lastGenerated = 21;

    public static void main(String[] args) {
        LongStream.generate(Tmp::getNumber).limit(20)
                .forEach(System.out::println);
        LongStream.rangeClosed(1,20).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::print);
    }

    private static long getNumber() {
        long next = lastGenerated - 1;
        lastGenerated = next;
        return next;
    }
}
