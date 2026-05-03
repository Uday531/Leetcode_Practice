package day47;

public class RotateString_796 {
    static void main() {
        String a="abcde";
        String b="deabc";
        System.out.println(rotateString(a,b));
    }
    public static boolean rotateString(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        return (a+a).contains(b);
    }
}
