package day56;

import java.util.Arrays;

public class MinimumCostOfBuyingCandiesWithDiscount_2144 {
    static void main() {
        int[] a={6,5,7,9,2,2};
        System.out.println(minCost(a));
    }
    public static int minCost(int[] c){
        Arrays.sort(c);
        int ans=0;
        for(int i=c.length-1;i>=0;i-=3){
            ans+=c[i];
            if(i>=0){
                ans+=c[i-1];
            }
        }
        return ans;
    }
}
