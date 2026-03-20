package day7;

import java.util.HashSet;

public class LengthOfLongestSubstring_121 {
    static void main() {
        String a="pwwkew";
        System.out.println(longestSubstring(a));
    }
    public static int longestSubstring(String s){
        HashSet<Character> h=new HashSet<>();
        int left=0;
        int maxLength=0;
        for (int right=0;right<s.length();right++){
            char c=s.charAt(right);
            while (h.contains(c)){
                h.remove(s.charAt(left));
                left++;
            }
            h.add(c);
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
