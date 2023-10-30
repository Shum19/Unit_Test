import HW.HW_6.CompareArrays;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareArraysTest {
    List<Integer> array1 = new ArrayList<>(List.of(1, 1, 1, 1));
    List<Integer> array2 = new ArrayList<>(List.of(2, 2, 2, 2));
    List<Integer> array3 = new ArrayList<>();
    List <Integer> array4 = new ArrayList<>(List.of(5,5));
    List <Integer> array5 = new ArrayList<>(List.of(6, 6, 4, 4));

    @Test
    public void findAverageValueTest(){
        double average1 = CompareArrays.findAverageValue(array1);
        double average2 = CompareArrays.findAverageValue(array2);
        assertEquals(1, average1);
        assertEquals(2, average2);
    }
    @Test
    public void isGreaterTest(){
        assertEquals("Не допустимый массив", CompareArrays.isGreater(array1, array3));
        assertEquals("Не допустимый массив", CompareArrays.isGreater(array3, array2));
        assertEquals("Второй список имеет большее среднее значение", CompareArrays.isGreater(array1, array2));
        assertEquals("Первый список имеет большее среднее значениеПервый список имеет большее среднее значение",
                                CompareArrays.isGreater(array4, array2));
        assertEquals("Средние значения равны", CompareArrays.isGreater(array4, array5));
    }


}
