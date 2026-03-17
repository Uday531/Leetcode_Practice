package day4;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumII_InputArrayIsSortedHashMap {
    static void main() {
        int[] gh={2,5,4,7,9};
        int target=11;
        int[] b=twoSum(gh,target);
        System.out.println("The indices of the target sum are: "+ Arrays.toString(b));
    }
    public static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for (int i=0;i< arr.length;i++){
            int r=target-arr[i];
            if(h.containsKey(r)){
                int ans[]={h.get(r)+1,i+1};
                return ans;
            }
            h.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
