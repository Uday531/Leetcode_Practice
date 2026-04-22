package day38;

public class MaximumSubArray_53 {
    static void main() {
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(a));
    }
    public static int maxSum(int[] a){
        int cursum=a[0];
        int maxsum=a[0];
        for(int i=1;i<a.length;i++){
            cursum=Math.max(a[i],cursum+a[i]);
            maxsum=Math.max(maxsum,cursum);
        }
        return maxsum;
    }
}
