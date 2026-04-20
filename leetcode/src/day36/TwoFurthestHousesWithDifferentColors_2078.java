package day36;

public class TwoFurthestHousesWithDifferentColors_2078 {
    static void main() {
        int[] colors={1,1,1,6,1,1,1};
        System.out.println(maxDistance(colors));
    }
    public static int maxDistance(int[] colors) {
        int n=colors.length;
        int maxDist=0;
        for(int j=n-1;j>=0;j--){
            if(colors[j]!=colors[0]){
                maxDist=j;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(colors[i]!=colors[n-1]){
                maxDist = Math.max(maxDist, n - 1 - i);
                break;
            }
        }
        return maxDist;
    }
}
