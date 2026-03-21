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
//public class Main
//{
//    public static void main(String[] args) {
//        String s="MAME";
//        System.out.println(validPalindrome(s));
//        System.out.println("Hello World");
//    }
//    public static boolean validPalindrome(String s){
//        int left=0,right=s.length()-1;
//        char[] c=s.toCharArray();
//        for(int i=0;i<right;i++){
//            while(left<right){
//                if(c[left]==c[right]){
//                    left++;
//                    right--;
//                }
//                else{
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}