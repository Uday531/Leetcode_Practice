package day61;

public class ReverseString_344 {
    static void main() {
        char[] c={'h','e','l','l','o'};
        System.out.println(reverseString(c));
    }
    public static char[] reverseString(char[] c){
        char[] b=new char[c.length];
        int count=0;
        for (int i=c.length-1;i>=0;i--){
            b[count]=c[i];
            count++;
        }
        return b;
    }
}
