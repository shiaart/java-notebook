package BinarySearchLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2InputArraySorted {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 3, 4}, 6);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i=0, j = numbers.length -1;

        while(i<j){
            int val = numbers[i] + numbers[j];
            if(val == target){
                return new int[]{i+1, j+1};
            }
            else if(val < target){
                i++;
            }
            else if(val > target){
                j--;
            }
        }

        return new int[]{-1, -1};
    }
}
