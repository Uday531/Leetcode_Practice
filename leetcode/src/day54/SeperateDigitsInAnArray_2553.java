package day54;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeperateDigitsInAnArray_2553 {
    static void main() {
        int[] a={12,34,56,78};
        System.out.println(Arrays.toString(seperateDigits(a)));
    }
    public static int[] seperateDigits(int[] a){
        List<Integer> l=new ArrayList<>();
        for (int n:a){
            String s=String.valueOf(n);
            for (char c:s.toCharArray()){
                l.add(c-'0');
            }
        }
        int[] res=new int[l.size()];
        for (int i=0;i<l.size();i++){
            res[i]=l.get(i);
        }
        return res;
    }
}
