package day32;

public class LargestTrianglearea_812 {
    static void main() {
        int[][] a={{0,0},{0,1},{1,0},{0,2},{2,0}};
        System.out.println(largestArea(a));
    }
    public static double largestArea(int[][] a){
        int n=a.length;
        double maxarea=0;
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    double area=Math.abs(
                            a[i][0]*(a[j][1]-a[k][1])+
                                    a[j][0]*(a[k][1]-a[i][1])+
                                    a[k][0]*(a[i][1]-a[j][1])
                    )/2.0;
                    maxarea=Math.max(maxarea,area);
                }
            }
        }
        return maxarea;
    }
}
