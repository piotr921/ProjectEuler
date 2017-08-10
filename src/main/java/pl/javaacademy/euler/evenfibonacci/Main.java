package pl.javaacademy.euler.evenfibonacci;

import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        long sum = LongStream.range(1, 4000000)
                .filter(Main::isFibonacci)
                .filter(Main::isEven)
                .sum();
        System.out.println("Sum of Fibonacci numbers: " + sum);
    }

    private static boolean isFibonacci(long number) {
        return number == 1 || number == 2 || Math.sqrt(5 * number * number + 4) % 1 == 0 || Math.sqrt(5 * number * number - 4) % 1 == 0;
    }

    private static boolean isEven(long number) {
        return number % 2 == 0;
    }
}
