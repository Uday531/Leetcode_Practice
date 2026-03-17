package day4;

public class ValidPalindrome {
    static void main() {
        String a="0P";
        boolean t=isPalidrome(a);
        System.out.println(t);
    }
    public static boolean isPalidrome(String s){
        String g=s.toLowerCase();
        String w=g.replaceAll("[^a-zA-Z0-9]","");
        int a=0,b=w.length()-1;
        char[] c=w.toCharArray();
        while(a<b){
            char temp=c[a];
            c[a]=c[b];
            c[b]=temp;
            a++;
            b--;
        }
        if (new String(c).equals(w)){
            return true;
        }
        return false;
    }
}
