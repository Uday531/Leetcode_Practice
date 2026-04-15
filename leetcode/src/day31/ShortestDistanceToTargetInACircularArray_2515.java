package day31;

public class ShortestDistanceToTargetInACircularArray_2515 {
    static void main() {
        String[] s={"hello","i","am","leetcode","hello"};
        String t="leetcode";
        int start=1;
        System.out.println(dist(s,t,start));
    }
    public static int dist(String[] a,String t,int start){
        int n=a.length;
        int mindist=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i].equals(t)){
                int diff=Math.abs(i-start);
                int dist=Math.min(diff,n-diff);
                mindist=Math.min(dist,mindist);
            }
        }
        return mindist==Integer.MAX_VALUE?-1:mindist;
    }
}
