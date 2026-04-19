package day35;

import java.util.HashMap;

public class MajorityElement_169 {
    static void main() {
        int[] a={2,2,1,1,1,1,1,2,2};
        System.out.println(majorityElement(a));
    }
    public static int majorityElement(int[] a){
        int n=a.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int k:a){
            h.put(k,h.getOrDefault(k,0)+1);
            if(h.get(k)>n/2){
                return k;
            }
        }
        return -1;
    }
}
