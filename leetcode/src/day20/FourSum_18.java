package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_18 {
    static void main() {
        int[] a={1,0,-1,0,-2,2};
        System.out.println(fourSum(a,3));
    }
    public static List<List<Integer>> fourSum(int[] a,int target){
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(a);
        int n=a.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && a[i]==a[i-1]){
                continue;
            }
            for(int j=1;j<n-2;j++){
                if(j>i+1 && a[j]==a[j-1]){
                    continue;
                }
                int left=j+1;
                int right=n-1;
                while(left<right){
                    long sum=(long) a[i]+a[j]+a[left]+a[right];
                    if(sum==target){
                        l.add(Arrays.asList(a[i],a[j],a[left],a[right]));
                        left++;
                        right--;
                        while(left<right && a[left]==a[left-1]){
                            left++;
                        }
                        while(left<right && a[right]==a[right+1]) {
                            right--;
                        }
                    }
                    else if (sum<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return l;
    }
}
