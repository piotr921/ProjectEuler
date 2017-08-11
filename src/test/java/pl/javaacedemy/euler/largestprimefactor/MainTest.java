package pl.javaacedemy.euler.largestprimefactor;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pl.javaacademy.euler.largestprimefactor.Main;

public class MainTest {

    @DataProvider
    private Object[][] numbersProvider() {
        return new Object[][] {
                {97, true},
                {98, false},
                {555, false},
                {523, true},
                {7919, true},
                {7918, false}
        };
    }

    @Test(dataProvider = "numbersProvider")
    public void shouldCheckIfNumberIsPrime(int number, boolean expected) {
        // Given

        // When
        boolean isPrime = Main.isPrime(number);

        // Then
        Assert.assertEquals(isPrime, expected);
    }
}
