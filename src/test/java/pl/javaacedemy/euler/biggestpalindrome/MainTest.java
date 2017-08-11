package pl.javaacedemy.euler.biggestpalindrome;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pl.javaacademy.euler.biggestpalindrome.Main;

public class MainTest {

    @DataProvider
    public Object[][] longNumbersProvider() {
        return new Object[][] {
                {1239L, 9321L},
                {1027L, 7201L},
                {55555L, 55555L},
                {90L, 9L},
        };
    }

    @Test(dataProvider = "longNumbersProvider")
    public void shouldReverseNumber(long given, long expected) {
        // Given

        // When
        long reversed = Main.getReverseNumber(given);

        // Then
        Assert.assertEquals(reversed, expected);
    }
}
