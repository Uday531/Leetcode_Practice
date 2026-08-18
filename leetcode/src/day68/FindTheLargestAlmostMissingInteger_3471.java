package day68;

import java.util.HashMap;
import java.util.HashSet;

public class FindTheLargestAlmostMissingInteger_3471 {
    static void main() {
        int[] a={1,2,3,4,5};
        int k=3;
        System.out.println(largestInteger(a,k));
    }
    public static int largestInteger(int [] nums,int k){
        HashMap<Integer,Integer> h=new HashMap<>();
        for (int i=0;i<=nums.length-k;i++){
            HashSet<Integer> s=new HashSet<>();
            for (int j=i;j<i+k;j++){
                s.add(nums[j]);
            }
            for (int num:s){
                h.put(num,h.getOrDefault(num,0)+1);
            }
        }
        int ans=-1;
        for (int num:h.keySet()){
            if (h.get(num)==1){
                ans=Math.max(ans,num);
            }
        }
        return ans;
    }
}
