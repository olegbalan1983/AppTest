import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class NumbersTest {
    @Test
    public void testAbs() {
        assertEquals(6, Math.abs(-6));
    }
    @Test
    public void testIsFinite() {
        assertTrue(Double.isFinite(56));
        assertFalse(Double.isFinite(Double.POSITIVE_INFINITY));
    }
    @Test
    public void testParsing() {
        assertThrows(NumberFormatException.class, () -> Integer.parseInt("hello"));
    }
}
