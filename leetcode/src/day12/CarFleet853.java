package day12;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet853 {
    static void main() {
        int[] pos={10,8,0,5,3};
        int[] speed={2,4,1,1,3};
        int target=12;
        System.out.println(carFleets(target,pos,speed));
    }
    public static int carFleets(int t,int[] pos,int[] speed){
        int a=pos.length;
        double[][] d=new double[a][2];
        Stack<Double> s=new Stack<>();
        for (int i=0;i<a;i++){
            d[i][0]=pos[i];
            d[i][1]=(double) (t-pos[i])/speed[i];
        }
        Arrays.sort(d,(x,y)->Double.compare(y[0],x[0]));
        for (int i=0;i<a;i++){
            double cur=d[i][1];
            if (s.isEmpty() || cur>s.peek()){
                s.push(cur);
            }
        }
        return s.size();
    }
}
