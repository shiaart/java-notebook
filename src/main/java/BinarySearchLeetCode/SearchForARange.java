package BinarySearchLeetCode;

public class SearchForARange {
    public static void main(String[] args) {
        int[] array = new int[]{5,7,7,8,9,10};
        int[] result = searchRange(array, 6);

        int[] resultLog = searchRangeLog(array, 6);
    }

    public static int[] searchRangeLog(int[] nums, int target) {
        int leftIndex = getIndex(nums, target, true);
        int rightIndex = getIndex(nums, target, false);

        if(leftIndex < nums.length && rightIndex < nums.length && leftIndex <= rightIndex){
            return new int[]{leftIndex, rightIndex};
        }
        else return new int[]{-1, -1};
    }

    static int getIndex(int[] nums, int target, boolean left){
        if(left){
            int l = 0, r = nums.length;
            while(l < r){
                int mid = l + (r-l)/2;

                if(nums[mid] < target){
                    l = mid + 1;
                }
                else if(nums[mid] > target){
                    r = mid;
                }
                else if(nums[mid] == target){
                    r = mid;
                }
            }

            return l;
        }
        else{
            int l = 0, r = nums.length;
            while(l < r){
                int mid = l + (r-l)/2;

                if(nums[mid] < target){
                    l = mid + 1;
                }
                else if(nums[mid] > target){
                    r = mid;
                }
                else if(nums[mid] == target){
                    l = mid + 1;
                }
            }

            return r - 1;
        }
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
