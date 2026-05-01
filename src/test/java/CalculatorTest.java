import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void add() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(-1, 1));
        assertEquals(-5, calc.add(-2, -3));
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(-4, 3));
    }

    @Test
    void dif() {
        assertEquals(2, calc.dif(5, 3));
        assertEquals(-3, calc.dif(1, 4));
        assertEquals(0, calc.dif(0, 0));
        Calculator calc = new Calculator();
        assertEquals(2, calc.dif(5, 3));
        assertEquals(-7, calc.dif(3, 10));
    }

    @Test
    void div() {
        assertEquals(2, calc.div(6, 3));
        assertEquals(-2, calc.div(6, -3));
        assertThrows(ArithmeticException.class, () -> calc.div(5, 0));
        Calculator calc = new Calculator();
        assertEquals(2, calc.div(10, 5));
        assertEquals(0, calc.div(10, 0)); // Проверка защиты от деления на ноль, если ты её добавил
    }

    @Test
    void times() {
        assertEquals(15, calc.times(3, 5));
        assertEquals(-6, calc.times(-2, 3));
        assertEquals(0, calc.times(0, 100));
        Calculator calc = new Calculator();
        assertEquals(15, calc.times(3, 5));
        assertEquals(-12, calc.times(-3, 4));
    }

    @Test
    void solver() {
        assertEquals(4, calc.solver());
        Calculator calc = new Calculator();
        // Здесь должно быть значение, которое возвращает твой метод solver()
        // В моем примере это было 16: (5+3)*(10-2)/4 = 8*8/4 = 16
        assertEquals(16, calc.solver());
    }
}