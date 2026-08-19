package day69;

import java.util.Arrays;

public class ProductOfAnArrayExceptSelf_238 {
    static void main() {
        int[] a={2,3,4,5};
        System.out.println(Arrays.toString(productExceptSelf(a)));
    }
    public static int[] productExceptSelf(int[] num){
        int n=num.length;
        int[] ans=new int[n];
        ans[0]=1;
        int b=1;
        for (int i=1;i<n;i++){
            ans[i]=ans[i-1]*num[i-1];
        }
        for (int i=n-1;i>=0;i--){
            ans[i]=ans[i]*b;
            b=b*num[i];
        }
        return ans;
    }
}
