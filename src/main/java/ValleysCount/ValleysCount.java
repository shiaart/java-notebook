package ValleysCount;

import java.util.Arrays;

public class ValleysCount {
    public static void main(String[] args){
        System.out.println(countingValleys(8, "UUDDDUDDUU"));
    }

    static int countingValleys(int n, String s) {
        int result = 0;
        int valleyTotal = 0;

        for (char ch: s.toCharArray()) {
            if(ch == 'U'){
                result++;
                if(result == 0){
                    valleyTotal++;
                }
            }
            if (ch == 'D'){
                result--;
            }
        }

        return valleyTotal;
    }
}
