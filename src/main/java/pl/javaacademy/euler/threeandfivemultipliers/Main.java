package pl.javaacademy.euler.threeandfivemultipliers;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        long sum = IntStream.range(0, 1000)
                .filter(number -> (isMultiplyOfFive(number) || isMultiplyOfThree(number)))
                .sum();
        System.out.println("Sum is: " + sum);
    }

    private static boolean isMultiplyOfFive(int number) {
        return number % 5 == 0;
    }

    private static boolean isMultiplyOfThree(int number) {
        return number % 3 == 0;
    }
}
