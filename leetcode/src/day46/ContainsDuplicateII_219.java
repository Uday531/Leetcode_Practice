package day46;
import java.util.*;

public class ContainsDuplicateII_219 {
    static void main() {
        int[] a={1,3,4,6};
        int k=8;
        System.out.println(containsNearbyDuplicate(a,k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                return true;
            }
            s.add(nums[i]);
            if(s.size()>k){
                s.remove(nums[i-k]);
            }
        }
        return false;
    }
}
