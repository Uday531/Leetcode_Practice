package day72;

public class FirstUniqueCharacterInAString_387 {
    static void main() {
        String s="udayu";
        System.out.println(firstUniqueChar(s));
    }
    public static int firstUniqueChar(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
