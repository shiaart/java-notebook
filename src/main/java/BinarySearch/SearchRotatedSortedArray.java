package BinarySearch;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int result = search(new int[]{4,5,6,7,0,1,2}, 1);
    }

    public static int search(int[] nums, int target) {

        if(nums.length < 1){
            return -1;
        }

        if(nums.length == 1){
            if(nums[0] == target) return 0;
            else return -1;
        }

        int minIndex = findRotateIndex(nums, 0, nums.length - 1);

        if(nums[minIndex] == target) return minIndex;
        if(minIndex == 0) return binarySearch(nums, 0, nums.length -1, target);

        if(target < nums[0]){
            return binarySearch(nums, minIndex + 1, nums.length -1, target);
        }
        else{
            return binarySearch(nums, 0, minIndex - 1, target);
        }
    }

    public static int binarySearch(int[] nums, int l, int r, int target){
        if(l<=r){
            int mid = l + (r-l)/2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) return binarySearch(nums, l, mid -1, target );
            else return binarySearch(nums, mid + 1, r, target );
        }

        return -1;
    }

    public static int findRotateIndex(int[] nums, int l, int r){
        //no rotation
        if(nums[l] < nums[r]){
            return 0;
        }

        while(l <= r){
            int mid = (l + r)/2;

            if(nums[mid] > nums[mid+1]){
                return mid +1;
            }
            else {
                if(nums[mid] < nums[l]){
                    r = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
        }

        return 0;

    }
}
