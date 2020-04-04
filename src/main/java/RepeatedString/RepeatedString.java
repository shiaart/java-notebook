package RepeatedString;

public class RepeatedString {
    public static void main(String[] args){
        System.out.println(repeatedString("abaaa", 200));
    }

    static long repeatedString(String s, long n) {
        int l = s.length();
        long remainder = n % l;
        long count = (n - remainder)/l;

        int countA = 0;
        for(int i = 0; i< l ;i++){
            if(s.charAt(i) == 'a'){
                countA++;
            }

        }
        int countR = 0;
        for(int i = 0; i< remainder ;i++){
            if(s.charAt(i) == 'a'){
                countR++;
            }

        }

        return countA * count + countR;

    }
}
