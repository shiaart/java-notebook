package FindPairInArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairsInArray {

    public static void main(String[] args){
        System.out.println(sockMerchant(7,  new int[]{ 1,2,3,3,2,1,1 }));
    }

    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int i=0;
        int result=0;
        while (i < n-1) {
            if(ar[i] == ar[i+1]){
                result++;
                i= i+2;
            }
            else {
                i = i+1;
            }
        }

        return result;
    }
}
