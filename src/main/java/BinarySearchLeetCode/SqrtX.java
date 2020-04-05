package BinarySearchLeetCode;

public class SqrtX {
    public static void main(String[] args) {
        int result = mySqrt(10);
    }

    public static int mySqrt(int x) {
        if(x < 2) return x;

        int i=2, j=x/2;
        long mult =0;
        int mid;
        while(i<=j){
            mid = i+(j-i)/2;
            mult = (long)mid*mid;

            if(mult == x) return mid;
            else if(mult > x) j = mid - 1;
            else i = mid + 1;
        }

        return j;
    }
}
