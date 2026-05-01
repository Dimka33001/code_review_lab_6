import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(-4, 3));
    }

    @Test
    void dif() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.dif(5, 3));
        assertEquals(-7, calc.dif(3, 10));
    }

    @Test
    void div() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.div(10, 5));
        assertEquals(0, calc.div(10, 0)); // Проверка защиты от деления на ноль, если ты её добавил
    }

    @Test
    void times() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.times(3, 5));
        assertEquals(-12, calc.times(-3, 4));
    }

    @Test
    void solver() {
        Calculator calc = new Calculator();
        // Здесь должно быть значение, которое возвращает твой метод solver()
        // В моем примере это было 16: (5+3)*(10-2)/4 = 8*8/4 = 16
        assertEquals(16, calc.solver());
    }
}