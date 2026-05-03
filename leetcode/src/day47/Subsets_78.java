package day47;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
    static void main() {
        int[] a={1,2,3};
        System.out.println(subsets(a));
    }
    public static List<List<Integer>> subsets(int[] a){
        List<List<Integer>> l=new ArrayList<>();
        back(0,a,new ArrayList<>(),l);
        return l;
    }
    public static List<List<Integer>> back(int s,int[] a,List<Integer> cur ,List<List<Integer>> l){
        l.add(new ArrayList<>(cur));
        for (int i=s;i<a.length;i++){
            cur.add(a[i]);
            back(i+1,a,cur,l);
            cur.remove(cur.size()-1);
        }
        return l;
    }
}
