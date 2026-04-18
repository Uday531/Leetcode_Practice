package day34;

import java.util.HashMap;
import java.util.Map;

public class MinimumAbsoluteDistanceBetweenMirrorPairs_3761 {
    static void main() {
        int[] a={21,120};
        System.out.println(minDistancePairs(a));
    }
    public static int minDistancePairs(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                minDist = Math.min(minDist, i - map.get(nums[i]));
            }
            int rev = reverse(nums[i]);
            map.put(rev, i);
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
    private static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}
