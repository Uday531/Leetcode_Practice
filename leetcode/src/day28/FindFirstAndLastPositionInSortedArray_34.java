package day28;

import java.util.Arrays;

public class FindFirstAndLastPositionInSortedArray_34 {
    static void main() {
        FindFirstAndLastPositionInSortedArray_34 f=new FindFirstAndLastPositionInSortedArray_34();
        int[] a={1,3,4,5,7};
        int t=5;
        int[] res=searchRange(a,t);
        System.out.println(Arrays.toString(res));
    }
    public static int[] searchRange(int[] nums,int target){

        int first=findfirst(nums,target);
        int last=findlast(nums,target);
        return new int[]{first,last};
    }
    private static int findfirst(int[] nums,int target){
        int left=0,right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
    private static int findlast(int[] nums,int target){
        int left=0,right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
}
