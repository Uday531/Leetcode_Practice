package day33;

public class IntegerToRoman_12 {
    static void main() {
        int n=50;
        System.out.println(intToRoman(n));
    }
    public static String intToRoman(int n){
        String roman="";
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman_letters={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<values.length;i++){
            while(n>=values[i]){
                roman=roman+roman_letters[i];
                n=n-values[i];
            }
        }
        return roman;
    }
}
