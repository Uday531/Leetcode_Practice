package day69;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {
    static void main() {
        int[] a={-1,-1,0,1,2,-4};
        System.out.println(threeSum(a));
    }
    public static List<List<Integer>> threeSum(int[] a){
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(a);
        int b= a.length-1;
        for (int i=0;i< a.length-2;i++){
            if (i>0 && a[i]==a[i-1]){
                continue;
            }
            int left=i+1;
            int right=b;
            while (left<right){
                int sum=a[i]+a[left]+a[right];
                if (sum==0) {
                    l.add(Arrays.asList(a[i], a[left], a[right]));
                    left++;
                    right--;
                    while (left < right && a[left] == a[left - 1]) {
                        left++;
                    }
                    while (left < right && a[right] == a[right + 1]) {
                        right--;
                    }
                } else if (sum<0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return l;
    }
}
