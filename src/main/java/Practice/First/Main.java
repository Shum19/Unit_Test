package Practice.First;
import org.assertj.core.api.Assertions.*;

import javax.xml.crypto.Data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] arg){
//        System.out.println(sum(Integer.MAX_VALUE, 3));
//        assertConditionA();
        happyNY();





    }
    public static int sum(int a, int b){
        assert Integer.MAX_VALUE - Math.abs(a) >= Math.abs(b):"Вышли за пределы целых чисел";
        return a+b;
    }
    public static void assertConditionA (){
        String[] weekend = {"Saturday", "Sunday"};
        assert weekend.length == 2;
        System.out.printf("There are %s off days", weekend.length);
    }
    public static void happyNY(){
        Calendar calendar = Calendar.getInstance();
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        String currantDate = format.format(calendar.getTime());
        assert 0 <= currantDate.compareTo("2023/10/10"): "Wait";
        System.out.println("Happy NY " + currantDate.compareTo("2023/10/10 "));
    }

}
