import org.junit.Assert;
import org.junit.Test;

public class KangarooTest {

    @Test
    public void KangarooTestTrue(){
        //GIVEN
        Kangaroo rooOne = new Kangaroo(0, 3);
        Kangaroo rooTwo = new Kangaroo( 4, 2);
        //WHEN
        boolean expected = true;

        //THEN
        boolean actual = rooOne.willRoosMeet(rooTwo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void KangarooTestFalse(){
        //GIVEN
        Kangaroo rooOne = new Kangaroo(0, 5);
        Kangaroo rooTwo = new Kangaroo( 4, 2);
        //WHEN
        boolean expected = false;

        //THEN
        boolean actual = rooOne.willRoosMeet(rooTwo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void KangarooTestFalseNeverCatch(){
        //GIVEN
        Kangaroo rooOne = new Kangaroo( 0, 1);
        Kangaroo rooTwo = new Kangaroo(4, 2);
        //WHEN
        boolean expected = false;

        //THEN
        boolean actual = rooOne.willRoosMeet(rooTwo);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void KangarooTestTrueSameSpot(){
        //GIVEN
        Kangaroo rooOne = new Kangaroo( 4, 1);
        Kangaroo rooTwo = new Kangaroo(4, 8);
        //WHEN
        boolean expected = true;

        //THEN
        boolean actual = rooOne.willRoosMeet(rooTwo);
        Assert.assertEquals(expected, actual);
    }

}
