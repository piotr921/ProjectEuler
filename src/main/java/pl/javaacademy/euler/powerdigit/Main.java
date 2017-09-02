package pl.javaacademy.euler.powerdigit;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal(2);
        BigDecimal multiplicant = new BigDecimal(2);
        for (int i = 1; i < 1000; i++) {
            decimal = decimal.multiply(multiplicant);
        }
        char[] chars = decimal.toString().toCharArray();
        int sum = 0;
        for (char c : chars) {
            sum += Character.getNumericValue(c);
            System.out.println("new sum: " + sum);
        }
        System.out.println("2^1000 = " + decimal);
        System.out.println("Sum = " + sum);

    }
}
