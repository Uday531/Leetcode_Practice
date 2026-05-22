package day51;

import java.util.Arrays;

public class JumpGameIX_3660 {
    static void main() {
        int[] a={2,1,3,5};
        System.out.println(Arrays.toString(maxValue(a)));
    }
    public static int[] maxValue(int[] nums){
        int n=nums.length;
            int[] ans=new int[n];
            int[] premax=new int[n];
            premax[0]=nums[0];
            for (int i=1;i<n;i++){
                premax[i]=Math.max(premax[i-1],nums[i]);

            }
            int sufmin=Integer.MAX_VALUE;
            for (int i=n-1;i>=0;i--){
                if(premax[i]>sufmin){
                    ans[i]=ans[i+1];

                }else {
                    ans[i]=premax[i];
                }
                sufmin=Math.min(sufmin,nums[i]);
            }
            return ans;
    }
}
