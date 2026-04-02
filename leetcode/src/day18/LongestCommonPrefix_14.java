package day18;

import java.util.HashMap;
import java.util.HashSet;

public class LongestCommonPrefix_14 {
    static void main() {
        String[] a={"flower","flow","flight"};
        System.out.println(longestPrefix(a));
    }
    public static String longestPrefix(String[] a){
        if (a==null || a.length==0){
            return "";
        }
        for(int i=0;i<a[0].length();i++) {
            char c = a[0].charAt(i);
            for (int j = 1; j < a.length; j++) {
                if (i >=a[j].length() || a[j].charAt(i)!=c){
                    return a[0].substring(0,i);
                }
            }
        }
        return a[0];
    }
}
