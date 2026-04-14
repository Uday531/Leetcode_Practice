package day29;

public class NextSunday_NQT {
    static void main() {
        int n=13;
        int startDay=1;
        System.out.println(nextSunday(n,startDay));
    }
    public static int nextSunday(int n,int startDay){
        int sundays=n/7;
        int rem=n%7;
        if ((startDay+rem)>=7){
            sundays++;
        }
        return sundays;
    }
}
