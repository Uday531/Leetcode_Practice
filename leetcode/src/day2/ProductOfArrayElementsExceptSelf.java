package day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductOfArrayElementsExceptSelf {
    static void main() {
        int[] p={2,4,5,7,8};
        int[] res=productofArray(p);
        System.out.println(Arrays.toString(res));
    }
    public static int[] productofArray(int[] arr){
        int n= arr.length;
        int[] a=new int[n];
        a[0]=1;
        int b=1;
        for (int i=1;i<n;i++){
            a[i]=a[i-1]*arr[i-1];
        }
        for(int i=n-1;i>=0;i--){
            a[i]=a[i]*b;
            b=b*arr[i];
        }
        return a;
    }
}
