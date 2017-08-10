package pl.javaacademy.euler.largestPrimeFactor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {

    private static final long END_NUMBER = 600851475143L;
    private static final long TEST_END_NUMBER = 100L;

    public static void main(String[] args) {
        List<Long> primeNumbersToRange = LongStream.range(2, TEST_END_NUMBER)
                .filter(number -> isPrime(number))
                .boxed().collect(Collectors.toList());
    }

    private static boolean isPrime(long number) {

        return false;
    }

    private static boolean isFactor(long divider, long number) {
        System.out.println("checking number: " + divider);
        return number % divider == 0;
    }
}
