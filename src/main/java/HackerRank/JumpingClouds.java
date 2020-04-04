package HackerRank;

import java.security.InvalidParameterException;

public class JumpingClouds {
    public static void main(String[] args){
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
    }

    static int jumpingOnClouds(int[] arr) {
        int clouds = 0;
        int i = 0;
        int n = arr.length;
        while( i < n ){
            clouds++;
            if(i + 2 < n && arr[i + 2] == 0){
                i = i + 2;
            }
            else {
                i++;
            }

        }

        return clouds - 1;
    }
}
