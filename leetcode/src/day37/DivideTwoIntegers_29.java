package day37;

public class DivideTwoIntegers_29 {
    static void main() {
        int a=10;
        int b=3;
        System.out.println(divide(a,b));
    }
    public static int divide(int dividend,int divisor){
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        long dv=Math.abs((long)dividend);
        long ds=Math.abs((long)divisor);
        int res=0;
        while(dv>=ds){
            long temp=ds;
            int mul=1;
            while(dv>=(temp<<1)){
                temp<<=1;
                mul<<=1;
            }
            dv=dv-temp;
            res=res+mul;
        }
        if((dividend<0) ^ (divisor<0)){
            return -res;
        }
        return res;
    }
}
