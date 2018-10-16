import org.junit.Test;

import static org.junit.Assert.*;

public class Oct11Test {

    @Test
    public void main() {
    }

    @Test
    public void alternateStrings1() {
        String result = Oct11.alternateStrings("abc", "xyz");
        assertEquals("axbycz",result);

    }

    public void alternateStrings2() {
        String result = Oct11.alternateStrings("Hi", "There");
        assertEquals("HTihere",result);

    }
    public void alternateStrings3() {
        String result = Oct11.alternateStrings("Thereee", "xxxx");
        assertEquals("Txhxexrxeee",result);

    }

    @Test
    public void abctest1() {
        boolean result = Oct11.abctest("123abc");
        assertEquals(true,result);
    }

    @Test
    public void abctest2() {
        boolean result = Oct11.abctest("123.abc");
        assertEquals(false,result);
    }

    @Test
    public void abctest3() {
        boolean result = Oct11.abctest("abc.123");
        assertEquals(true,result);
    }
}