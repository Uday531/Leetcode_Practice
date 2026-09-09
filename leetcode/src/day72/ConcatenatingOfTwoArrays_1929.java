package day72;

import java.util.Arrays;

public class ConcatenatingOfTwoArrays_1929 {
    static void main() {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}
