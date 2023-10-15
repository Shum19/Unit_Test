package Third.hw;

import HW.HW_3.EvenOddNumber;
import HW.HW_3.NumberInInterval;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenOddNumberTest {
// Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет,
// является ли переданное число четным или нечетным:
    @Test
    public void evenOddNumberTest(){
        assertTrue(EvenOddNumber.evenOddNumber(50));
        assertFalse(EvenOddNumber.evenOddNumber(3));
    }
}
