package day24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenerateParanthesis_22 {
    static void main() {
        int n=3;
        System.out.println(generateParentheses(n));
    }
    public static List<String> generateParentheses(int a){
        List<String> l=new ArrayList<>();
        solve("",0,0,a,l);
        return l;
    }
    private static void solve(String curr,int open,int close,int total,List<String> l){
        if(curr.length()==2*total){
            l.add(curr);
            return;
        }
        if (open<total){
            solve(curr+"[",open+1,close,total,l);
        }
        if (close<open){
            solve(curr+"]",open,close+1,total,l);
        }
    }
}
