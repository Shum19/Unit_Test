package fifth.practice;

import Practice.fifth.number.FindMaxNumber;
import Practice.fifth.number.RandomArrNum;
import Practice.fifth.user.UserRepository;
import Practice.fifth.user.UserService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModuleTest {
    @Test
    public void RandomArrNumTest(){
        RandomArrNum randomArrNum = new RandomArrNum(10);
        assertEquals(10, randomArrNum.getNums().length);

    }
    @Test
    public void FindMaxNum(){
        int [] arr = {1, 2, 3, 4, 5, 6, 9};
        int max = FindMaxNumber.findMaxNum(arr);
        assertEquals(9, max);
    }
    @Test
    public void IntegrationTest(){
        RandomArrNum randomArrNum = new RandomArrNum(10);
        Arrays.sort(randomArrNum.getNums());
        int actualMax = FindMaxNumber.findMaxNum(randomArrNum.getNums());
        int expectedMax = randomArrNum.getNums()[randomArrNum.getNums().length - 1];
        assertEquals(expectedMax, actualMax);
    }
    @Test
    public void UserOrderTest(){
        UserRepository repo = new UserRepository();
        UserService service = new UserService(repo);
        assertEquals("User 1", service.getUserName(1));
    }
}
