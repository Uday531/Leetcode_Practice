package day10;

public class SearchA2DMatrix {
    static void main() {
        int[][] a={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=52;
        System.out.println(searchin2dmatrix(a,target));
    }
    public static boolean searchin2dmatrix(int[][] a,int target){
        int m=a.length;
        int n=a[0].length;
        int row=0,col=n-1;
        while (row<m && col>=0){
            if(a[row][col]==target){
                return true;
            } else if (a[row][col]>target) {
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
