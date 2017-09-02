package pl.javaacademy.euler.divisibletriangular;

import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        long counter = 1;
        long number;
        while (true) {
            number = getNextTriangularNumber(counter);
            long noOfDividers = calcNoOfDividers(number);
            System.out.println(number + " -> " + noOfDividers);
            if (noOfDividers > 500) {
                break;
            }
            counter++;
        }
        System.out.println("Result: " + number);
    }

    public static long calcNoOfDividers(long number) {
        return LongStream.range(1, number + 1)
                .filter(check -> number % check == 0)
                .count();
    }

    private static long getNextTriangularNumber(long id) {
        return LongStream.range(1, id).sum();
    }
}
