package day4;

import java.util.Arrays;

public class TwoSumII_InputArrayIsSortedTwoPointers {
    static void main() {
        int[] a = {2, 3, 5, 7};
        int target = 8;
        int[] ans = twoSortedII(a, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSortedII(int[] arr, int t) {
        int a = 0, b = arr.length - 1;
        while (a < b) {
            int r = arr[a] + arr[b];
            if (r == t) {
                return new int[]{a + 1, b + 1};
            }
            if (r<t){
                a++;
            }
            else{
                b--;
            }
        }
        return new int[]{-1, -1};
    }
}
