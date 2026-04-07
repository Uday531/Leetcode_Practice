package day23;

import java.util.Arrays;

public class ThreeSumClosest_16 {
    static void main() {
        int[] a={-1,2,1,-4};
        int target=1;
        System.out.println(threeSumClosest(a,target));
    }
    public static int threeSumClosest(int[] a,int target){
        Arrays.sort(a);
        int res=a[0]+a[1]+a[2];
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<a.length-2;i++){
            int left=i+1;
            int right=a.length-1;
            while(left<right){
                int sum=a[i]+a[left]+a[right];
                if(sum==target){
                    return target;
                }
                else if(sum<target){
                    left++;
                }else{
                    right--;
                }
                int difftotarget=Math.abs(sum-target);
                if(difftotarget<mindiff){
                    res=sum;
                    mindiff=difftotarget;
                }
            }
        }
        return res;
    }
}
