package day64;

import java.util.HashMap;

public class LengthOfTheLongestSubArrayAtMostKFrequency_2958 {
    static void main() {
        int[] a={1,2,3,1,2,3,1,2};
        int k=2;
        System.out.println(lengthOfSubArray(a,k));
    }
    public static int lengthOfSubArray(int[] nums,int k){
        int maxLength=0;
        int j=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
            while (h.get(nums[i])>k){
                h.put(nums[j],h.get(nums[j])-1);
                if (h.get(nums[j])==0){
                    h.remove(nums[j]);
                }
                j++;
            }
            int len=i-j+1;
            maxLength=Math.max(len,maxLength);
        }
        return maxLength;
    }
}
