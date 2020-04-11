package Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int[] array = new int[]{3, 4, 5, 12, 0, -4, 10, 2, 1, 17, 20, -1};
        sort(array);
    }

    public static void sort(int[] array){
        int n = array.length;
        for(int i=0;i < n;i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j+1]) {
                    //swap
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
