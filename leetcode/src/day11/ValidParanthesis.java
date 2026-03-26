package day11;

import java.util.Stack;

public class ValidParanthesis {
    static void main() {
        String s="([)";
        System.out.println(validParanthesis(s));
    }
    public static boolean validParanthesis(String s){
        Stack<Character> e=new Stack<>();
        for (char c:s.toCharArray()){
            if (c=='(' || c=='{' || c=='['){
                e.push(c);
            }else {
                if (e.isEmpty()){
                    return false;
                }
                char top=e.pop();
                if (c==')' && top!='(' ||
                        c=='}' && top!='{' ||
                        c==']' && top!='['){
                    return false;
                }
            }
        }
        return e.isEmpty();
    }
}
