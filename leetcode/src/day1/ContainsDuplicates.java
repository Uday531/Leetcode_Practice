package day1;

import java.util.HashSet;

public class ContainsDuplicates {
    static void main() {
        int[] arr={5,6,5,8,9};
        boolean t=containsDuplicate(arr);
        System.out.println(t);
    }
    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(h.contains(arr[i])){
                return true;
            }
            h.add(arr[i]);
        }
        return false;
    }
}
