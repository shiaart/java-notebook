package TwoSum;


import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    public static void main(String[] args){
        int[] arr = {2, 7, 11, 15};
        int[] result = twoSum(arr, 22);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i < nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
