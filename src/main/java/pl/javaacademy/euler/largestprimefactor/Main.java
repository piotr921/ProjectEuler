package pl.javaacademy.euler.largestprimefactor;

import java.util.HashSet;
import java.util.Set;

public class Main {

    private static final long END_NUMBER = 600851475143L;
    private static final long TEST_END_NUMBER = 100L;
    private static Set<Long> sieve = new HashSet<>();

    public static void main(String[] args) {
        // consumes too much memory

/*        List<Long> longs = LongStream.range(2, END_NUMBER / 2)
                .peek(number -> {
                    if (number * number < END_NUMBER / 2 && !sieve.contains(number)) {
                        addAllNumberMultiplicationsToSieve(number);
                    }
                })
                .filter(number -> !sieve.contains(number))
                .boxed().collect(Collectors.toList());
        longs.forEach(System.out::println);
        System.out.println("No of primes: " + longs.size());*/
        long result = 0;
        for (long i = (END_NUMBER / 2) + 1; i > 1; i--) {
            if (isFactor(i, END_NUMBER) && isPrime(i)) {
                result = i;
                break;
            }
        }
        System.out.println("Result: " + result);
    }

    private static void addAllNumberMultiplicationsToSieve(long number) {
        for (long i = number * 2; i <= END_NUMBER / 2; i += number) {
            sieve.add(i);
        }
    }

    public static boolean isPrime(long number) {
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static boolean isFactor(long divider, long number) {
        System.out.println("checking number: " + divider);
        return number % divider == 0;
    }
}
