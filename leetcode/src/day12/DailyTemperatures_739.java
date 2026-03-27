package day12;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures_739 {
    static void main() {
        int[] a={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemps(a)));
    }
    public static int[] dailyTemps(int[] s){
        Stack<Integer> h=new Stack<>();
        int a=s.length;
        int[] b=new int[a];
        for (int i=a-1;i>=0;i--){
            while(!h.isEmpty() && s[i]>=s[h.peek()]){
                h.pop();
            }
            if (!h.isEmpty()){
                b[i]=h.peek()-i;
            }
            h.push(i);
        }
        return b;
    }
}
