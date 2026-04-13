package day29;

public class MinimumDistanceToTheTarget_1848 {
    static void main() {
        int[] a={2,3,5,7,9};
        int b=0;
        int c=7;
        System.out.println(getDistance(a,b,c));
    }
    public static int getDistance(int[] a,int st,int t){
        int mindist=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]==t){
                int dist=Math.abs(i-st);
                mindist=Math.min(dist,mindist);
            }
        }
        return mindist;
    }
}
