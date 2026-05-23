package day55;

public class CheckIfArrayIsSortedAndRotated_1752 {
    static void main() {
        int[] a={3,4,5,1,2};
        System.out.println(check(a));
    }
    public static boolean check(int[] nums){
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }
        return count<=1;
    }
}
