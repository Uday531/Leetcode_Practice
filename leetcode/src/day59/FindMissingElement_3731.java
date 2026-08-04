package day59;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindMissingElement_3731 {
    static void main() {
        int[] nums={5,6,8,9,10};
        List<Integer> l=findMissingElement(nums);
            System.out.println(l);
    }
    public static List<Integer> findMissingElement(int[] nums){
        List<Integer> l=new ArrayList<>();
        HashSet<Integer> h=new HashSet<>();
        int small=Integer.MAX_VALUE;
        int big=Integer.MIN_VALUE;
        for(int num:nums){
            small=Math.min(small,num);
            big=Math.max(big,num);
            h.add(num);
        }
        for (int i=small+1;i<big;i++){
            if(!h.contains(i)){
                l.add(i);
            }
        }
        return l;
    }
}
