package BinarySearch;

public class SearchForARange {
    public static void main(String[] args) {
        int[] array = new int[]{5,7,7,8,8,10};
        int[] result = searchRange(array, 8);
    }

    public static int[] searchRange(int[] nums, int target) {
        int left = -1, right = -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                left = i;
                break;
            }
        }

        for(int j=nums.length -1; j >=0;j--){
            if(nums[j] == target){
                right = j;
                break;
            }
        }

        if(left <= right){
            return new int[]{left, right};
        }
        else {
            return new int[]{-1, -1};
        }

    }
}
