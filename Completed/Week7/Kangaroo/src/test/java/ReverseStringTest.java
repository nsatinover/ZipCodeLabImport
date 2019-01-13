import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
    ReverseString reverseString = new ReverseString();


    @Test
    public void reverseStringTest(){
        //GIVEN
        String input = "nick";
        //WHEN
        String expected = "kcin";

        //THEN
        String actual = reverseString.reverseString(input);
        Assert.assertEquals(expected, actual);
    }
}
