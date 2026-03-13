package day1;

import java.util.Arrays;

public class TwoSumwithBrute {
    static void main() {
        int[] gh={2,5,4,7,9};
        int target=7;
        int[] b=twoSum(gh,target);
        System.out.println("The indices of the target sum are: "+ Arrays.toString(b));
    }
    public static int[] twoSum(int[] arr,int target){
        int[] ans=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
