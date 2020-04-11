package Sorting;

public class MergeSort {
    public static void main(String[] args){
        int[] array = new int[]{4,56,32,1,34,4, 4, 0, 1, 4, 2};
        sort(array);
    }

    public static void sort(int[] array){
        mergeSort(array, new int[array.length], 0, array.length - 1);
    }

    public static void mergeSort(int[] array, int[] tempArray, int leftStart, int rightEnd){
        if(leftStart >= rightEnd) return;

        int middle = (rightEnd + leftStart)/2;
        mergeSort(array, tempArray, leftStart, middle);
        mergeSort(array, tempArray,middle+1, rightEnd);
        mergeHalves(array, tempArray, leftStart, rightEnd);
    }

    public static void mergeHalves(int[] array, int[] tempArray, int leftStart, int rightEnd){
        int leftEnd = (rightEnd+leftStart)/2;
        int rightStart = leftEnd + 1;
        int index = leftStart;
        int left = leftStart;
        int right = rightStart;
        while(left <= leftEnd && right <= rightEnd){
            if(array[left] > array[right]){
                tempArray[index] = array[right];
                right++;
            }
            else {
                tempArray[index] = array[left];
                left++;
            }
            index++;
        }

        System.arraycopy(array, left, tempArray, index,leftEnd - left + 1);
        System.arraycopy(array, right, tempArray, index,rightEnd - right + 1);
        System.arraycopy(tempArray, leftStart, array, leftStart, rightEnd - leftStart + 1);
    }
}
