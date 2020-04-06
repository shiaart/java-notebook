package BinarySearchLeetCode;

import java.util.*;

public class IntersectionTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        int[] result = intersect(nums1, nums2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        ArrayList<Integer> resultArray = new ArrayList<Integer>();

        for(int i=0;i<nums1.length;i++){
            if(map1.containsKey(nums1[i])){
                int currentValue = map1.get(nums1[i]);
                currentValue++;
                map1.put(nums1[i], currentValue);
            }
            else{
                map1.put(nums1[i], 1);
            }

        }

        for(int j=0;j<nums2.length;j++){
            if(map2.containsKey(nums2[j])){
                int currentValue = map2.get(nums2[j]);
                currentValue++;
                map2.put(nums2[j], currentValue);
            }
            else{
                map2.put(nums2[j], 1);
            }
        }

        for (Map.Entry<Integer, Integer> kvp: map1.entrySet()) {
                if(map2.containsKey(kvp.getKey())){
                    if(kvp.getValue() < map2.get(kvp.getKey())){
                        for(int i=0;i<kvp.getValue();i++){
                            resultArray.add(kvp.getKey());
                        }

                    }
                    else{
                        for(int i=0;i<map2.get(kvp.getKey());i++){
                            resultArray.add(kvp.getKey());
                        }
                    }
                }
        }

        int[] ret = new int[resultArray.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = resultArray.get(i).intValue();
        }

        return ret;
    }
}
