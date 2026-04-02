package day18;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    static void main() {
        int[] a={1,2};
        int[] b={3,4};
        System.out.println(findMedianSortedArrays(a,b));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] ne=new int[m+n];
        int t=m+n;
        double d=0;
        for(int i=0;i<m;i++){
            ne[i]=nums1[i];
        }
        int k=ne.length-n;
        for(int i=0;i<n;i++){
            ne[k+i]=nums2[i];
        }
        Arrays.sort(ne);
        if (t%2!=0){
            return ne[t/2];
        }
        else{
            return (double) (ne[t/2] + ne[(t/2) - 1]) /2.0;
        }
//        int tl=0;
//        for(int i=0;i<t;i++){
//            tl=tl+ne[i];
//        }
//        d= (double) tl /t;
//        return d;
    }
}
