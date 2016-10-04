import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sola2Be on 03.10.2016.
 */
public class UtilTest {

    @Test
    public void zeroLength() throws Exception {
        Util util = new Util("");
        assertNull("String length == 0",util.uniqueChars());
    }

    @Test(expected = NullPointerException.class)
    public void emptyString() throws Exception {
        Util util = new Util(null);
        assertNull("Empty string", util.uniqueChars());
    }

    @Test
    public void testStringA() throws Exception {
        Util util = new Util("abbcdabc");
        assertEquals("Unique substring A","bcda",util.uniqueChars());
    }

    @Test
    public void testStringB() throws Exception {
        Util util = new Util("cbacdcbc");
        assertEquals("Unique substring B","bacd",util.uniqueChars());
    }

    @Test
    public void testStringC() throws Exception {
        Util util = new Util("aaaaaaa");
        assertEquals("Unique substring C","a",util.uniqueChars());
    }

    @Test
    public void testStringD() throws Exception {
        Util util = new Util("f");
        assertEquals("Unique substring D","f",util.uniqueChars());
    }

    @Test
    public void testStringE() throws Exception {
        Util util = new Util("abcabcabc");
        assertEquals("Unique substring E","abc",util.uniqueChars());
    }
}