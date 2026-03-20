package day7;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring_121 {
    static void main() {
        String a="pwwkew";
        System.out.println(lengthOfLongestSubstring(a));
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxlength= 0;
        Set<Character> charset = new HashSet<>();
        int left = 0;

        for(int right= 0;right<s.length();right++){
            if(!charset.contains(s.charAt(right))){
                charset.add(s.charAt(right));
                maxlength = Math.max(maxlength, right-left+1);
            }else{
                while(charset.contains(s.charAt(right))){
                    charset.remove(s.charAt(left));
                    left++;
                }
                charset.add(s.charAt(right));
            }
        }
        return maxlength;
    }
    }

