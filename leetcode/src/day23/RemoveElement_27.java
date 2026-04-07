package day23;

public class RemoveElement_27 {
    static void main() {
        int[] a={3,2,2,1};
        int val=2;
        System.out.println(removeElement(a,val));
    }
    public static int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
