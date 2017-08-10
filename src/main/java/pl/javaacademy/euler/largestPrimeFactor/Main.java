package pl.javaacademy.euler.largestPrimeFactor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {

    private static final long END_NUMBER = 600851475143L;
    private static final long TEST_END_NUMBER = 100L;
    private static Set<Long> sieve = new HashSet<>();

    public static void main(String[] args) {
        List<Long> longs = LongStream.range(2, END_NUMBER)
                .peek(number -> {
                    if (number * number < END_NUMBER) {
                        for(long i = number * 2; i <= END_NUMBER; i += number) {
                            sieve.add(i);
                        }
                    }
                })
                .filter(number -> !sieve.contains(number))
        .boxed().collect(Collectors.toList());
        longs.forEach(System.out::println);
        System.out.println("No of primes: " + longs.size());
    }

    private static boolean isPrime(long number) {

        return false;
    }

    private static boolean isFactor(long divider, long number) {
        System.out.println("checking number: " + divider);
        return number % divider == 0;
    }
}
