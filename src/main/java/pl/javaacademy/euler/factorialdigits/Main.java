package pl.javaacademy.euler.factorialdigits;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal number = factorial(new BigDecimal(100));
        System.out.println(number);
        char[] chars = number.toString().toCharArray();
        int sum = 0;
        for (char c : chars) {
            int digit = Character.getNumericValue(c);
            System.out.println("adding: " + digit);
            sum += digit;
        }
        System.out.println(sum);
    }


    private static BigDecimal factorial(BigDecimal number) {
        if (number.compareTo(BigDecimal.ONE) != 1) {
            return BigDecimal.ONE;
        } else {
            return number.multiply(factorial(number.subtract(BigDecimal.ONE)));
        }
    }
}
