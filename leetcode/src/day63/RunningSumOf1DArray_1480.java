package day63;

import java.util.Arrays;

public class RunningSumOf1DArray_1480 {
    static void main() {
        int[] a={1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(a)));
    }
    public static int[] runningSum(int[] nums){
        int[] runningSum=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            runningSum[i]=sum;
        }
        return runningSum;
    }
}
