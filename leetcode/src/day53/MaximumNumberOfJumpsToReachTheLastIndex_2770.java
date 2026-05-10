package day53;

import java.util.Arrays;

public class MaximumNumberOfJumpsToReachTheLastIndex_2770 {
    static void main() {
        int[] q={1,3,6,4,1,2};
        int t=2;
        System.out.println(maximumlast(q,t));
    }
    public static int maximumlast(int[] nums,int target){
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                if (dp[i] != -1 &&
                        Math.abs(nums[j] - nums[i]) <= target) {
                    dp[j] = Math.max(dp[j], dp[i] + 1);
                }
            }
        }
        return dp[n - 1];
    }
}
