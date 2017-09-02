package pl.javaacedemy.euler.divisibletriangular;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pl.javaacademy.euler.divisibletriangular.Main;

public class MainTest {

    @DataProvider
    private Object[][] triangularNumbersProvider(){
        return new Object[][] {
                {28L, 6L},
                {21L, 4L},
                {15L, 4L}
        };
    }

    @Test(dataProvider = "triangularNumbersProvider")
    public void shouldCalcNumberOfDividers(long given, long expected) {
        // When
        long noOfDividers = Main.calcNoOfDividers(given);

        // Then
        Assert.assertEquals(noOfDividers, expected);
    }
}
