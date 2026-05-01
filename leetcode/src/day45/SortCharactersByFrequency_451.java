package day45;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency_451 {
    static void main() {
        String s="ABCDE";
        System.out.println(freqSort(s));
    }
    public static String freqSort(String s){
        HashMap<Character,Integer> h=new HashMap<>();
        for (char c:s.toCharArray()){
            h.put(c, h.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> p=new PriorityQueue<>((a,b)->h.get(b)-h.get(a));
        p.addAll(h.keySet());
        StringBuilder res=new StringBuilder();
        while (!p.isEmpty()){
            char c=p.poll();
            int freq=h.get(c);
            for (int i=0;i<freq;i++){
                res.append(c);
            }
        }
        return res.toString();
    }
}
