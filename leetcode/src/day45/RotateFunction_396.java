package day45;

public class RotateFunction_396 {
    static void main() {
        int[] a={1,5,4,3};
        System.out.println(rotateFunc(a));
    }
    public static int rotateFunc(int[] a){
        int n=a.length;
        long sum=0;
        long fi=0;
        for (int i=0;i<n;i++){
            sum=sum+a[i];
            fi=fi+(long)i*a[i];
        }
        long max=fi;
        for (int i=1;i<n;i++){
            fi=fi+sum-(long)n*a[n-i];
            max=Math.max(max,fi);
        }
        return (int) max;
    }
}
