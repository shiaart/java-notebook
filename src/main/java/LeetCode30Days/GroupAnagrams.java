package LeetCode30Days;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] array = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(array);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String s: strs){
            char[] temp =  s.toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);
            if(map.containsKey(sorted)){
                ArrayList<String> list = map.get(sorted);
                list.add(s);
                map.put(sorted, list);
            }
            else {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(sorted, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}
