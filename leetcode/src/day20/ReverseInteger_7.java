package day20;

public class ReverseInteger_7 {
    static void main() {
        int a=-121;
        System.out.println(reverseInteger(a));
    }
    public static int reverseInteger(int x){
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;
    }
}
