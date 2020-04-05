package BinarySearch;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        boolean result = isPerfectSquare(808201);
    }

    public static boolean isPerfectSquare(int num) {
        if(num < 2){
            return true;
        }
        long l=2, r=num/2;
        while(l<=r){
            long mid = l + (r - l)/2;
            long val = mid*mid;
            if(val == num){
                return true;
            }
            else if(val < num){
                l = mid +1;
            }
            else {
                r = mid-1;
            }
        }

        return false;
    }
}
