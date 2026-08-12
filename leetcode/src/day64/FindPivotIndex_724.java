package day64;

public class FindPivotIndex_724 {
    static void main() {
        int[] a={1,7,3,6,5,6};
        System.out.println(pivotIndex(a));
    }
    public static int pivotIndex(int[] a){
        int leftSum=0;
        int rightSum;
        int total=0;
        for (int j : a) {
            total = total + j;
        }
        for (int i=0;i<a.length;i++){
            rightSum=total-leftSum-a[i];
            if (leftSum==rightSum){
                return i;
            }
            leftSum=leftSum+a[i];
        }
        return -1;
    }
}
