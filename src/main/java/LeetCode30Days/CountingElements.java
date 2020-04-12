package LeetCode30Days;

import java.util.*;

public class CountingElements {
    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 1, 2, 4, 7, 6};
        int result = countElements(array);
    }

    public static int countElements(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i : arr){
            if(!set.contains(i)){
                set.add(i);
            }
        }

        for(int i : arr) {
            if(set.contains(i+1)){
                count+= 1;
            }
        }

        return count;
    }
}
