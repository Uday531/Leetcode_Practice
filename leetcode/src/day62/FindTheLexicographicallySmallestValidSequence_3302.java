package day62;

import java.util.Arrays;

public class FindTheLexicographicallySmallestValidSequence_3302 {
    static void main() {
        String a="aaaaaa";
        String b="aaabc";
        System.out.println(Arrays.toString(validSequence(a, b)));
    }
    public static int[] validSequence(String word1,String word2){
        int[] a=new int[word2.length()];
        for (int i=0;i<word2.length();i++){
            for (int j=0;j<word1.length();j++){
                if (word2.charAt(i) == word1.charAt(j)) {
                    a[i]=j;
                    break;
                }
            }
        }
        return a;
    }
}
