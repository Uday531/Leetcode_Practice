package day70;

import java.util.Arrays;

public class DistributeElementsInto2Arrays1_3069 {
    static void main() {
        int[] nums={2,1,3};
        System.out.println(Arrays.toString(distributeArray(nums)));
    }
    public static int[] distributeArray(int[] nums){
        int n=nums.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int size1=0;
        int size2=0;
        arr1[size1++]=nums[0];
        arr2[size2++]=nums[1];

        for (int i = 2; i < n; i++) {

            if (arr1[size1 - 1] > arr2[size2 - 1]) {
                arr1[size1++] = nums[i];
            } else {
                arr2[size2++] = nums[i];
            }
        }
        int[] res=new int[n];
        int index = 0;

        for (int i = 0; i < size1; i++) {
            res[index++] = arr1[i];
        }

        for (int i = 0; i < size2; i++) {
            res[index++] = arr2[i];
        }
        return res;
    }
}
