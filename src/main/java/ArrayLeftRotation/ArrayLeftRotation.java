package ArrayLeftRotation;

public class ArrayLeftRotation {
    public static void main(String[] args){
        System.out.println(rotLeft(new int[]{ 1,2,3,4,5,}, 1));
    }

    static int[] rotLeft(int[] a, int d) {
        int len = a.length;
        int index = d;
        int delta = len - index;
        int[] result = new int[len];

        for(int i = index, j = 0; i < len;i++, j++){
            result[j] = a [i];
        }

        for (int k=0; k < index;k++){
            result[k + delta] = a[k];
        }

        return result;
    }
}
