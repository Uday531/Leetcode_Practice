package day35;

public class MaximumDistanceBetweenAPairOfValues_1855 {
    static void main() {
        int[] a={55,30,5,4,2};
        int[] b={100,20,10,10,5};
        System.out.println(maxDist(a,b));
    }
    public static int maxDist(int[] num1,int[] num2){
        int i=0,j=0;
        int maxDist=0;
        while(i<num1.length && j<num2.length){
            if(num1[i]<=num2[j]){
                maxDist=Math.max(maxDist,j-i);
                j++;
            }else{
                i++;
            }
        }
        return maxDist;
    }
}
