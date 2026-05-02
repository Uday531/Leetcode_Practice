package day46;
import java.util.*;

public class LetterCombinationsOfAPhoneNumber_17 {
    static void main() {
        String a= "678";
        System.out.println(letterCombinations(a));
    }
    public static List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null || digits.length()==0){
            return res;
        }
        String[] m={
                "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        backtrack(res,m,digits,0,new StringBuilder());
        return res;
    }
    private static void backtrack(List<String> res,String[] map,String digits,int index,StringBuilder sb){
        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }
        String letters = map[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            sb.append(c);
            backtrack(res, map, digits, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }
    }
}
