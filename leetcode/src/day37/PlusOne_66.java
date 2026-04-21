package day37;

import java.util.Arrays;

public class PlusOne_66 {
    static void main() {
        int[] a={9,9,9,9};
        System.out.println(Arrays.toString(plusOne(a)));
    }
    public static int[] plusOne(int[] a){
        int n=a.length;
        for (int i=n-1;i>=0;i--){
            if (a[i]<9){
                a[i]++;
                return a;
            }
            a[i]=0;
        }
        int[] res=new int[n+1];
        res[0]=1;
        return res;
    }
}
