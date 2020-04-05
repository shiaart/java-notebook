package LeetCode30Days;

class MoveZeroes {
    public static void main(String[] args){
        int[] result = moveZeroes(new int[]{0,3,0,1,0,3,4});
    }

    public static int[] moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }

        for(int j=lastNonZeroIndex; j < nums.length;j++){
            nums[j] = 0;
        }

        return nums;
    }
}