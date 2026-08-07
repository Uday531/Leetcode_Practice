package day61;

public class ShuffleString_1528 {
    static void main() {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        System.out.println(shuffleString(s,indices));
    }
    public static String shuffleString(String s,int[] indices){
        char[] c=new char[indices.length];
        for (int i=0;i< indices.length;i++){
            c[indices[i]]=s.charAt(i);
        }
        return new String(c);
    }
}
