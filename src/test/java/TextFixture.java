import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TextFixture {

    @BeforeEach
    void init(TestInfo testInfo) {
        String callingTest = testInfo.getTestMethod().get().getName();
        System.out.println("Before " + callingTest);
    }

    @AfterEach
    void after(TestInfo testInfo) {
        String callingTest = testInfo.getTestMethod().get().getName();
        System.out.println("After " + callingTest);
    }

    @BeforeAll
    static void init() {
        System.out.println("Before all tests");
    }

    @AfterAll
    static void after() {
        System.out.println("After all tests");
    }

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