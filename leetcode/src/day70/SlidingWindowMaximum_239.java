package day70;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum_239 {
    static void main() {
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
    public static int[] maxSlidingWindow(int[] nums,int k){
        int n= nums.length;
        int[] res=new int[n-k+1];
        Deque<Integer> q=new ArrayDeque<>();
        for (int i=0;i<n;i++){
            while(!q.isEmpty() && q.peekFirst()<=i-k){
                q.removeFirst();
            }
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]){
                q.removeLast();
            }
            q.add(i);
            if (i>=k-1){
                res[i-k+1]=nums[q.peekFirst()];
            }
        }
        return res;
    }
}
