package Sorting;

public class QuickSortNew {
    public static void main(String[] args){
        int[] array = new int[]{4,56,32,1,34,4, 4, 0, 1, 4, 2};
        sort(array);
    }

    static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    static void quickSort(int[] array, int l, int r){
        if(l < r){
            int pivotIndex = (l+r)/2;
            int partition = partition(array, l, r, array[pivotIndex]);
            quickSort(array, l, partition - 1);
            quickSort(array, partition, r);
        }
    }

    static int partition(int[] array, int l, int r, int pivot){
        while(l<=r){
            while(array[l] < pivot) l++;
            while (pivot < array[r]) r--;

            if(l <= r){
                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;

                l++;
                r--;
            }
        }

        return l;
    }

}
