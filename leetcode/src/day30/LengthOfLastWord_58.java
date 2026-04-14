package day30;

public class LengthOfLastWord_58 {
    static void main() {
        String s="Hello World";
        System.out.println(lenOfWord(s));
    }
    public static int lenOfWord(String s){
        String tst=s.trim();
       int count=0;
       int r=tst.length()-1;
       for(int i=r;i>=0;i--){
           if (tst.charAt(i)!=' '){
               count++;
           }else {
               break;
           }
       }
       return count;
    }
}
