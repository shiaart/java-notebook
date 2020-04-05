package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        List<Integer> result = findClosestElements(array, 4, 3);
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int targetIndex = binarySearch(arr, x);
        int l = targetIndex, r = targetIndex;
        if(targetIndex >= 0){
            if(k < targetIndex){
                //take middle
                l = targetIndex -k/2;
                r = targetIndex + k/2;
            }
            else if(k > targetIndex){
                //take k from start
                l =0;
                r = k - 1;
            }
            else {
                l =0;
                r = k - 1;
            }
        }
        else{
            if(x < arr[0]){
                l =0;
                r = k - 1;
            }
            else if (x > arr[arr.length - 1]){
                l = arr.length - 1 -k;
                r = arr.length -1;
            }
        }
        List<Integer> list = new ArrayList<Integer>();

        for(int i=l;i <= r;i++){
            list.add(arr[i]);
        }

        return list;
    }

    static int binarySearch(int[] arr, int x){
        int l=0, r=arr.length;

        while(l<r){
            int mid = l + (r-l)/2;

            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] < x){
                l = mid + 1;
            }
            else {
                r = mid;
            }
        }

        return -1;
    }
}
