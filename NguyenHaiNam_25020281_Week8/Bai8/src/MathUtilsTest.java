import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

public class MathUtilsTest {
    @BeforeAll
    static void startTest() {
        System.out.println("=== Bắt đầu chạy MathUtilsTest ===");
    }

    @AfterAll
    static void endTest() {
        System.out.println("=== Kết thúc ===");
    }

    // Max
    @Test
    @DisplayName("Test max: a < b")
    public void testcase_01() {
        int a = 3;
        int b = 5;
        int result = MathUtils.max(a, b);

        assertEquals(b, result);
    }

    @Test
    @DisplayName("Test max: a = b")
    public void testcase_02() {
        int a = 5;
        int b = 5;
        int result = MathUtils.max(a, b);

        assertEquals(a, result);
    }

    @Test
    @DisplayName("Test max: a > b")
    public void testcase_03() {
        int a = 7;
        int b = 2;
        int result = MathUtils.max(a, b);

        assertEquals(a, result);
    }

    @Test
    @DisplayName("Test max: BA (MAX)")
    public void testcase_04() {
        int a = Integer.MAX_VALUE;
        int b = 5;
        int result = MathUtils.max(a, b);

        assertEquals(a, result);
    }

    @Test
    @DisplayName("Test max: BA (MIN)")
    public void testcase_05() {
        int a = Integer.MIN_VALUE;
        int b = 7;
        int result = MathUtils.max(a, b);

        assertEquals(b, result);
    }

    // Divide
    @Test
    @DisplayName("Test divide: b > 0")
    public void testcase_06() {
        int a = 3;
        int b = 1;
        int result = MathUtils.divide(a, b);

        assertEquals(3, result);
    }

    @Test
    @DisplayName("Test divide: b < 0")
    public void testcase_07() {
        int a = 5;
        int b = -2;
        int result = MathUtils.divide(a, b);

        assertEquals(-2, result);
    }

    @Test
    @DisplayName("Test divide: b = 0 (Expect Exception)")
    public void testcase_08() {
        int a = 2;
        int b = 0;

        assertThrows(IllegalArgumentException.class, () -> MathUtils.divide(a, b));
    }
}