package HappyNumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class HappyNumber {
    public static void main(String[] args) {
       isHappy(2);
    }

    public static boolean isHappy(int n) {
       int result = n;
       Set<Integer> visited = new HashSet<Integer>();
       while(result != 1){
           // generate arraylist from result
           result = getSumOfPowers2(getArray(result));
           if(visited.contains(result)){
               return false;
           }
           else{
               visited.add(result);
           }
       }

       return result == 1;
    }

    static ArrayList<Integer> getArray(int a){
        //104
        ArrayList<Integer> result = new ArrayList<Integer>();
        int res = a;
        while(res != 0){
            int temp = res%10;
            result.add(temp);
            res = (res - temp)/10;
        }

        return result;
    }

    static int getSumOfPowers2(ArrayList<Integer> arrayList){
        int sum = 0;
        for(Integer i : arrayList){
            sum += i*i;
        }
        return sum;
    }
}