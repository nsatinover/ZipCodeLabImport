import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest() {
        // Given
        Calculator calc = new Calculator();
        int x = 5;
        int y = 3;
        int expected = 8;

        // When
        int actual = calc.add(x, y);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest2() {
        // Given
        Calculator calc = new Calculator();
        int x = 4;
        int y = 3;
        int expected = 7;

        // When
        int actual = calc.add(x, y);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest3() {
        // Given
        Calculator calc = new Calculator();
        int x = 0;
        int y = 0;
        int expected = -1;

        // When
        int actual = calc.add(x, y);

        // Then
        Assert.assertEquals(expected, actual);
    }

}