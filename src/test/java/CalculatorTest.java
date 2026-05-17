import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void add() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(-1, 1));
        assertEquals(-5, calc.add(-2, -3));
    }

    @Test
    void dif() {
        assertEquals(2, calc.dif(5, 3));
        assertEquals(-3, calc.dif(1, 4));
        assertEquals(0, calc.dif(0, 0));
    }

    @Test
    void div() {
        assertEquals(2, calc.div(6, 3));
        assertEquals(-2, calc.div(6, -3));
        // ✅ Исправлено: IllegalArgumentException вместо ArithmeticException
        assertThrows(IllegalArgumentException.class, () -> calc.div(5, 0));
    }

    @Test
    void times() {
        assertEquals(15, calc.times(3, 5));
        assertEquals(-6, calc.times(-2, 3));
        assertEquals(0, calc.times(0, 100));
    }

    @Test
    void solver() {
        // ✅ Исправлено: 16 вместо 4
        assertEquals(16, calc.solver());
    }
}
