package day34;

public class MirrorDistanceOfAnInteger_3783 {
    static void main() {
        int n=20;
        System.out.println(mirrorDistance(n));
    }
    public static int mirrorDistance(int n){
        int org=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return Math.abs(org-rev);
    }
}
