package day69;

import java.util.HashMap;
import java.util.HashSet;

public class SubArraySumEqualsK_560 {
    static void main() {
        int[] a={2,4,3,5};
        int k=6;
        System.out.println(subArraySumOfK(a,k));
    }
    public static int subArraySumOfK(int[] nums,int k){
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        int prefixSum=0;
        h.put(0,1);
        for (int num:nums){
            prefixSum+=num;
            int needed=prefixSum-k;
            if (h.containsKey(needed)){
                count+=h.get(needed);
            }
            h.put(prefixSum,h.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
