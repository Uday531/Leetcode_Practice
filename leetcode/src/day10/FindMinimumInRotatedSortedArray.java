package day10;

public class FindMinimumInRotatedSortedArray {
    static void main() {
        int[] a = {3, 4, 5, 1,0, 2};
        System.out.println(findMin(a));
    }
    public static int findMin(int[] a){
//        int min=Integer.MAX_VALUE;
//        for (int i=0;i< a.length;i++){
//            if (a[i]<min) {
//                min = a[i];
//            }
//        }
//        return min;
        int left=0,right=a.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if (a[mid]>a[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return a[left];
    }
}
