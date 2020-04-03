package LongestSubString;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {

    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int total = 0;
        char[] arr = s.toCharArray();
        for(int i=0; i< arr.length; i++)
        {
            List<Character> list = new ArrayList<Character>();
            for(int j=i; j< s.length(); j++)
            {
                if(!list.contains(arr[j])){
                    list.add(arr[j]);
                }
                else break;
            }

            if(total < list.size()) {
                total = list.size();
            }
        }

        return total;
    }
}