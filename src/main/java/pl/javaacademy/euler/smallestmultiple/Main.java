package pl.javaacademy.euler.smallestmultiple;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        long smallestMultiple = 232792500L;
        while (true) {
            System.out.println("checking: " + smallestMultiple);
            if (isMultiple(smallestMultiple)) {
                break;
            }
            smallestMultiple++;
        }
        System.out.println("Smallest multiple is: " + smallestMultiple);
    }

    private static boolean isMultiple(long number) {
        return IntStream.range(1, 21)
                .allMatch(divider -> number % divider == 0);
    }
}
