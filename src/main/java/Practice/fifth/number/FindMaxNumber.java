package Practice.fifth.number;

public class FindMaxNumber {
    public static int findMaxNum(int [] nums){
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max=nums[i];
        }
        return max;
    }
}
