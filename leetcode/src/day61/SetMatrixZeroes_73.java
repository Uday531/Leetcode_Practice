package day61;

import java.util.Arrays;
import java.util.HashSet;

public class SetMatrixZeroes_73 {
    static void main() {
        int[][] a={{1,2,3},{4,0,0},{7,8,9}};
        System.out.println(Arrays.deepToString(setMatrixZeroes(a)));
    }
    public static int[][] setMatrixZeroes(int[][] matrix){
        HashSet<Integer> rows=new HashSet<>();
        HashSet<Integer> cols=new HashSet<>();
        int m= matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
            if(matrix[i][j]==0){
                rows.add(i);
                cols.add(j);
                }
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(rows.contains(i) || cols.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
        return matrix;
    }
}
