package day44;

public class MissingNumber_268 {
    static void main() {
        int[] a={1,2,0};
        System.out.println(missingNumber(a));
    }
    public static int missingNumber(int[] a){
        int n=a.length;
        int e=n*(n+1)/2;
        int l=0;
        for(int q:a){
            l=l+q;
        }
        return e-l;
    }
}
