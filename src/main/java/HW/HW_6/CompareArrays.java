package HW.HW_6;


import java.util.List;


public class CompareArrays {
    public static int findAverageValue(List <Integer> arr){
        int average = 0;
        if (arr.size()==0){return 0;}
        for (int num : arr) {average += num;}
        return average/arr.size();
    }
    public static String isGreater(List <Integer> arr1, List <Integer>  arr2){
        int avgArr1 = findAverageValue(arr1);
        int avgArr2 = findAverageValue(arr2);
        if (avgArr1 == 0  || avgArr2 == 0){return "Не допустимый массив";}
        else if(avgArr1 > avgArr2){return "Первый список имеет большее среднее значениеПервый список имеет большее среднее значение";}
        else if (avgArr2 > avgArr1) {return "Второй список имеет большее среднее значение";}
        else return "Средние значения равны";
    }
}
