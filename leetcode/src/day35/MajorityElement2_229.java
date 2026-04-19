package day35;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2_229 {
    static void main() {
        int[] n={3,2,3};
        System.out.println(majorityElement(n));
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int j:nums){
            h.put(j,h.getOrDefault(j,0)+1);
        }
        for(int k:h.keySet()){
            if(h.get(k)>n/3){
                l.add(k);
            }
        }
        return l;
    }
}
