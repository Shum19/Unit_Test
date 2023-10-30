package Practice.fifth.number;

import java.util.Random;

public class RandomArrNum {
    private int [] nums;
    public RandomArrNum(int count){
        nums = new int [count];
        Random random = new Random();
        for (int i = 1; i < nums.length; i++) {
            nums[i] = random.nextInt(0, 100);
        }
    }
    public int[] getNums(){
        return this.nums;
    }

}
