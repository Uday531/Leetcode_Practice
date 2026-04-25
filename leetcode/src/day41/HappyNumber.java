package day41;
import java.util.*;

public class HappyNumber {
    static void main() {
        int n=19;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> h=new HashSet<>();
        while(n!=1 && !h.contains(n)){
            h.add(n);
            n=getSum(n);
        }
        return n==1;
    }
    private static int getSum(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d;
            n=n/10;
        }
        return sum;
    }
}
