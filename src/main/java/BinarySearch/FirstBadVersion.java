package BinarySearch;


public class FirstBadVersion {
    public static void main(String[] args) {
        int b = firstBadVersion(4);
    }

    public static int firstBadVersion(int n) {
        if(n == 1){
            if(isBadVersion(n)){
                return n;
            }
        }

        int l=1, r=n;

        while(l < r){
            int mid = l + (r - l)/2;

            if(isBadVersion(mid)){
                //go left
                r = mid;
            }
            else{
                //go right
                l = mid+1;
            }
        }

        return l;
    }

    public static boolean isBadVersion(int v){
        if(v == 0) return false;
        else if(v == 1) return false;
        else if(v == 2) return false;
        else if(v == 3) return true;
        else if(v == 4) return true;
        else if(v == 5) return true;
        else return true;
    }
}
