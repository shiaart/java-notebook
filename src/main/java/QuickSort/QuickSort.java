package QuickSort;

public class QuickSort {
    public static void main(String[] args){
        sort();
    }

    static void sort() {
        int[] array = new int[]{4,56,32,1,34,4, 4, 0, 1, 4, 2};
        qSort(array, 0, array.length - 1);
    }

    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = low - 1, j = low;
        while(j < high){
            if(arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;
    }

    static void qSort(int[] arr, int l, int r){
        if(l < r) {
            int pi = partition(arr, l, r);
            qSort(arr, l, pi - 1);
            qSort(arr, pi + 1, r);
        }
    }
}
