package BinarySearchLeetCode;

public class FindPeakElement2 {
    public static void main(String[] args) {
        int[] array = new int[]{-1, 3, 4, 5, 6, 10, 6, 8};
        int result = findPeakElement(array);
    }

    public static int findPeakElement(int[] nums) {
        int l=0, r = nums.length -1;
        while(l<r){
            int mid = l + (r - l)/2;

            if(nums[mid] > nums[mid+1]){
                r = mid;
            }
            else {
                l = mid+1;
            }
        }

        return l;
    }
}
