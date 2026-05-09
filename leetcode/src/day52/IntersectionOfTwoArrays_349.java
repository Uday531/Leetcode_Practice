package day52;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays_349 {
    static void main() {
        int[] a={1,2,3,4};
        int[] b={3,4,5,6};
        System.out.println(Arrays.toString(intersection(a, b)));
    }
    public static int[] intersection(int[] a,int[] b){
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for (int n:a){
            s1.add(n);
        }
        for (int n:b){
            if (s1.contains(n)){
                s2.add(n);
            }
        }
        int[] res=new int[s2.size()];
        int index=0;
        for (int n:s2){
            res[index++]=n;
        }
        return res;
    }
}
