package day21;

public class ZigzagConversion_6 {
    static void main() {
        String s="PAYPALISHIRING";
        int n=3;
        System.out.println(convert(s,n));
    }
    public static String convert(String s,int numRows){
        String[] a=new String[numRows];
        for(int i=0;i<numRows;i++){
            a[i]="";
        }
        int i=0;
        while(i<s.length()){
            for(int index=0;index<numRows && i<s.length();index++){
                a[index]+=s.charAt(i++);
            }
            for(int index=numRows-2;index>0 && i<s.length();index--){
                a[index]+=s.charAt(i++);
            }
        }
        String res="";
        for(String w:a){
            res=res+w;
        }
        return res;
    }
}
