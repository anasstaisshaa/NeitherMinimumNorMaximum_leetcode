import java.util.Arrays;

class Solution {
    public static int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);

        for(int i = 1; i < nums.length-1; i++){
            if(nums[i] > nums[0] && nums[i] < nums[nums.length-1])
                return nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,4};

        System.out.println(findNonMinOrMax(nums));
    }
}
