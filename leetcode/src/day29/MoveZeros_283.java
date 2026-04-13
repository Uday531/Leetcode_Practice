package day29;

import java.util.Arrays;

public class MoveZeros_283 {
    static void main() {
        int[] a={1,3,5,0,2,0};
        int[] b=moveZeros(a);
        System.out.println(Arrays.toString(b));
    }
    public static int[] moveZeros(int[] a){
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        return a;
    }
}
