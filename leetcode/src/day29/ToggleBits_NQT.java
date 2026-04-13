package day29;

public class ToggleBits_NQT {
    static void main() {
        int a=5;
        System.out.println(toggleBits(a));
    }
    public static int toggleBits(int n){
        int bits=(int)(Math.log(n)/Math.log(2))+1;
        int mask=(1<<bits)-1;
        return n^mask;
    }
}
