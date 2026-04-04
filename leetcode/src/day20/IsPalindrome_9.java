package day20;

public class IsPalindrome_9 {
    static void main() {
        int a=1012;
        System.out.println(isPalindrome(a));
    }
    public static boolean isPalindrome(int x) {
        String d=Integer.toString(x);
        int left=0;
        int right=d.length()-1;
        while(left<right){
            if(d.charAt(left)!=d.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
