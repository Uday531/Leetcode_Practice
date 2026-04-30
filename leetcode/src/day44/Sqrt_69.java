package day44;

public class Sqrt_69 {
    static void main() {
        int a=64;
        System.out.println(sqrt(a));
    }
    public static int sqrt(int n){
        if(n<2){
            return n;
        }
        int left=1,right=n/2;
        int a=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if((long)mid*mid==n){
                return mid;
            } else if ((long)mid*mid<n) {
                a=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return a;
    }
}
