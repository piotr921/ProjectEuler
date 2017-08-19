package pl.javaacademy.euler.squaredifference;

import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        long sumOfSquares = LongStream.range(1,101)
                .map(number -> number * number)
                .sum();
        long squareOfSum = LongStream.range(1,101).sum() * LongStream.range(1,101).sum();
        long result = squareOfSum - sumOfSquares;
        System.out.println("Result is: " +  result);
    }
}
