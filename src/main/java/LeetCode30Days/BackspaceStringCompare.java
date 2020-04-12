package LeetCode30Days;

import java.util.*;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        boolean result = backspaceCompare("ab##", "c#d#");
    }

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> SStack = new Stack<>();
        Stack<Character> TStack = new Stack<>();

        for(Character c : S.toCharArray()){
            if(c.equals('#')){
                if(!SStack.empty()){
                    SStack.pop();
                }
            }
            else{
                SStack.push(c);
            }
        }

        for(Character c : T.toCharArray()){
            if(c.equals('#')){
                if(!TStack.empty()){
                    TStack.pop();
                }

            }
            else {
                TStack.push(c);
            }
        }

        if(SStack.size() != TStack.size()){
            return false;
        }



        while(!SStack.empty() && !TStack.empty()){
            if(!SStack.pop().equals(TStack.pop())){
                return false;
            }
        }

        return true;
    }
}
