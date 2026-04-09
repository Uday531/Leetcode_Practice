package day25;

import java.util.Arrays;

public class MergeSortedArrays_88 {
    static void main() {
        int[] a1={1,2,3,0,0,0};
        int[] a2={2,5,6};
        int m=3;
        int n=3;
        mergeArrays(a1,a2,m,n);
        Arrays.sort(a1);
        for (int i=0;i<m+n;i++){
            System.out.print(a1[i]+" ");
        }
    }
    public static void mergeArrays(int[] a1,int[] a2,int m,int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0 && a1[i]>a2[i]){
                a1[k]=a1[i];
                k--;
                i--;
            }else{
                a1[k]=a2[j];
                k--;
                j--;
            }
        }
    }
}
