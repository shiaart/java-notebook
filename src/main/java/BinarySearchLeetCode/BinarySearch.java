package BinarySearchLeetCode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{-1, 3, 4, 5, 6, 10, 100, 132};
        int result = binarySearch(array, 0, array.length -1, 4);
    }

    public static int binarySearch(int[] array, int i, int j, int target) {
        if(j >= i){
            int index = i + (j - i)/2;
            if(array[index] == target){
                return index;
            }
            else if(array[index] < target){
                return binarySearch(array, index + 1, j, target);
            }
            else if(array[index] > target){
                return binarySearch(array, i, index, target);
            }
        }

        return -1;
    }
}
