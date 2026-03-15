package day3;

public class ReverseVowelsOfAString {
    static void main() {
        String s = "Uday";
        String r = reverseVowelsOfAString(s);
        System.out.println(r);
    }
    public static String reverseVowelsOfAString(String s){
        int l=0;
        char[] c=s.toCharArray();
        int r=c.length-1;
        while(l<r){
            while (l<r && !isVowel(c[l])){
                l++;
            }
            while (l<r && !isVowel(c[r])){
                    r--;
        }
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            l++;
            r--;
        }
        return new String(c);
    }
    public static boolean isVowel(char l){
        return l=='a' || l=='e' || l=='i' || l=='o' || l=='u' || l=='A' || l=='E' || l=='I' || l=='O' || l=='U';
    }
}
