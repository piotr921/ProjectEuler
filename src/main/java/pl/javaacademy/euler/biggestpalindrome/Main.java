package pl.javaacademy.euler.biggestpalindrome;

import java.util.Comparator;
import java.util.stream.LongStream;

public class Main {


    public static void main(String[] args) {
        Long max = (long) 999*999;
        long palindrome = LongStream.range(0, 999*999).boxed().sorted(Comparator.reverseOrder())
                .filter(number -> isPalindrome(number))
                .findFirst().orElse(0L);
        System.out.println("Biggest palindrome: " + palindrome);
    }



    private static boolean isPalindrome(Long number){
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
