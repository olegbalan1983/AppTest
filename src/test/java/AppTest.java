import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void testAbs() {
        assertEquals(Math.abs(-6),6);
    }
    @Test
    void testIsFinite() {
        assertTrue(Double.isFinite((56)));
        assertFalse(Double.isFinite(Double.POSITIVE_INFINITY));
    }
    @Test
    void testParsing() {
        assertThrows(NumberFormatException.class, () -> Integer.parseInt("hello") );
    }
    @ParameterizedTest
    @ValueSource(doubles = {55,21,36.35})
    void testIsFiniteParameterized(double num) {
        assertTrue(Double.isFinite(num));
    }
    @RepeatedTest(5)
    void testAbsRepeat() {
        assertEquals(Math.abs(-6), 6);
    }
}
