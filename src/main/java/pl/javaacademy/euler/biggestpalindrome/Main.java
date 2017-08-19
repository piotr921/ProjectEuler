package pl.javaacademy.euler.biggestpalindrome;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.LongStream;

public class Main {

    private static List<Long> numbers = new ArrayList<>();

    public static void main(String[] args) {
        initializeNumbers();
        long palindrome = numbers.stream().sorted(Comparator.reverseOrder())
                .filter(number -> isPalindrome(number))
                .findFirst().orElse(0L);
        System.out.println("Biggest palindrome: " + palindrome);
    }

    private static void initializeNumbers() {
        for (long i = 0; i < 999; i++) {
            for (long j = 0; j < 999; j++) {
                numbers.add(i * j);
            }
        }
    }

    private static boolean isPalindrome(Long number) {
        return number.equals(getReverseNumber(number));
    }

    public static Long getReverseNumber(Long number) {
        long result = 0;
        while (number > 0) {
            result = result * 10;
            result = result + number % 10;
            number = number / 10;
        }
        return result;
    }
}
