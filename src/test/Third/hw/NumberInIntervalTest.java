package Third.hw;

import HW.HW_3.NumberInInterval;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberInIntervalTest {
// Задание 2. Разработайте и протестируйте метод numberInInterval, который проверяет,
// попадает ли переданное число в интервал (25;100)
    @Test
    public void numberInIntervalTest(){
        assertTrue(NumberInInterval.numberInInterval(27));
        assertFalse(NumberInInterval.numberInInterval(24));
    }
}
