package Sorting;

public class QuickSort {
    public static void main(String[] args){
        int[] array = new int[]{4,56,32,1,34,4, 4, 0, 1, 4, 2};
        sort(array);
    }

    static void sort(int[] array) {
        qSort(array, 0, array.length - 1);
    }

    static int partition(int[] arr, int l, int r, int pivot){
        while(l<=r){
            while(arr[l] < pivot){
                l++;
            }
            while(arr[r] > pivot){
                r--;
            }

            if(l <= r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

                l++;
                r--;
            }
        }

        return l;
    }

    static void qSort(int[] arr, int l, int r){
        if(l < r) {
            int pivot = (l + r)/2;
            int pi = partition(arr, l, r, arr[pivot]);
            qSort(arr, l, pi - 1);
            qSort(arr, pi, r);
        }
    }
}
