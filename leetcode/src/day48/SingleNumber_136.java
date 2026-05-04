package day48;

import java.util.HashMap;

public class SingleNumber_136 {
    static void main() {
        int[] aa={1,2,3,3,4,1,2};
        System.out.println(singleNumber(aa));
    }
    public static int singleNumber(int[] m){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int n:m){
            h.put(n,h.getOrDefault(n,0)+1);
        }
        for (int key:h.keySet()){
            if(h.get(key)==1){
                return key;
            }
        }
        return -1;
    }
}
