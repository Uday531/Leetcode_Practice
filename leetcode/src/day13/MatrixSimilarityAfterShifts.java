package day13;

public class MatrixSimilarityAfterShifts {
    static void main() {
    int[][] m={{1,2,1,2},{4,5,4,5},{7,8,7,8}};
    int k=2;
    System.out.println(areSimilar(m,k));
    }
    public static boolean areSimilar(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int shift=k%n;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i%2==0){
                    int col=(j+shift)%n;
                    if(mat[i][j]!=mat[i][col]){
                        return false;
                    }
                }else{
                    int col=(j-shift+n)%n;
                    if(mat[i][j]!=mat[i][col]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
