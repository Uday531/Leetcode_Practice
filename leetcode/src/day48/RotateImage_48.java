package day48;

import java.util.Arrays;

public class RotateImage_48 {
    static void main() {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(rotateImage(a)));
    }
    public static int[][] rotateImage(int[][] m){
        int n=m.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int left=0,right=n-1;
            while(left<right){
                int temp=m[i][left];
                m[i][left]=m[i][right];
                m[i][right]=temp;
                left++;
                right--;
            }
        }
        return m;
    }
}
