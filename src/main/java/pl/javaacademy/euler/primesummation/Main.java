package pl.javaacademy.euler.primesummation;

import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        Long sumOfPrimes = LongStream.range(2, 2000000)
                .filter(number -> isPrime(number))
                .sum();
        System.out.println("Sum of primes is: " + sumOfPrimes);
    }

    private static boolean isPrime(long number) {
        long n = 2;
        boolean isPrime = true;
        while (n <= Math.sqrt(number)) {
            if (number % n == 0) {
                isPrime = false;
                break;
            }
            n++;
        }
        return isPrime;
    }
}
