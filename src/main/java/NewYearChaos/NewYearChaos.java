package NewYearChaos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NewYearChaos {
    public static void main(String[] args){
        minimumBribes(new int[]{ 2,1,5,3,4});
    }

    static void minimumBribes(int[] q) {
        int count = 0;
        for(int i = q.length - 1; i >= 0; i--){
            if(q[i] != i + 1){
                if(i - 1 >= 0 && q[i - 1] == i + 1){
                    count++;
                    int temp = q[i - 1];
                    q[i - 1] = q[i];
                    q[i] = temp;
                }
                else if(i - 2 >= 0 && q[i - 2] == i + 1) {
                    count = count + 2;
                    q[i - 2] = q[i - 1];
                    q[i - 1] = q[i];
                    q[i] = i+1;
                }
                else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }

        System.out.println(count);
        return;


    }
}
