package LeetCode30Days;

public class MaximumSubarray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArray(int[] nums) {
       int tempSum = 0;
       int maxSum = nums[0];
       for(int i : nums){
           tempSum = Math.max(i, tempSum + i);
           maxSum = Math.max(tempSum, maxSum);
       }

       return maxSum;
    }
}
