package day64;

public class MaximumProductOfTwoElementsOfAnArray_1464 {
    static void main() {
        int[] a={3,4,5,2};
        System.out.println(maxSum(a));
    }
    public static int maxSum(int[] arr){
        int m=arr[arr.length-1]-1;
        int n=arr[arr.length-2]-1;
        return m*n;
    }
}
