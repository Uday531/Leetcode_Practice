package day30;

import java.util.HashSet;
import java.util.Set;

public class ValidSquare_593 {
    static void main() {
        int[] p1={0,0};
        int[] p2={1,1};
        int[] p3={1,0};
        int[] p4={0,2};
        System.out.println(validSquare(p1,p2,p3,p4));
    }
    public static boolean validSquare(int[] p1,int[] p2,int[] p3,int[] p4){
        Set<Integer> s=new HashSet<>();
        s.add(dss(p1,p2));
        s.add(dss(p1,p3));
        s.add(dss(p1,p4));
        s.add(dss(p2,p3));
        s.add(dss(p2,p4));
        s.add(dss(p3,p4));
        return !s.contains(0) && s.size()==2;
    }
    private static int dss(int[] a,int[] b){
        return (a[0]-b[0])*(a[0]-b[0])+(a[1]-b[1])*(a[1]-b[1]);
    }
}

