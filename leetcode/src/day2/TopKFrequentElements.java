package day2;

import java.util.*;

public class TopKFrequentElements {
    static void main() {
        int[] a={1,4,5,3,1,4,4};
        int k=3;
        int[] b=topKFrequentElements(a,k);
        System.out.println(Arrays.toString(b));
    }
    public static int[] topKFrequentElements(int[] a,int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int s:a) {
            h.put(s,h.getOrDefault(s, 0)+1);
        }
        List<Map.Entry<Integer,Integer>> l=new ArrayList<>(h.entrySet());
        l.sort((x,y)->y.getValue()-x.getValue());
        int[] res=new int[k];
        for (int i=0;i<k;i++){
            res[i]=l.get(i).getKey();
        }
        return res;
    }
}
