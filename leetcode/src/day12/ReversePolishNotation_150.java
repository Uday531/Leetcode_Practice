package day12;

import java.util.Stack;

public class ReversePolishNotation_150 {
    static void main() {
        String[] t= {"2","1","+","3","*"};
        System.out.println(evalRPN(t));
    }
    public static int evalRPN(String[] t){
        Stack<Integer> s=new Stack<>();
        for (String c:t){
            if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")){
                int b=s.pop();
                int a=s.pop();
                if (c.equals("+")){
                    s.push(a+b);
                } else if (c.equals("-")) {
                    s.push(a-b);
                } else if (c.equals("*")) {
                    s.push(a*b);
                }else {
                    s.push(a/b);
                }
            }else {
                s.push(Integer.parseInt(c));
            }
        }
        return s.pop();
    }
}
