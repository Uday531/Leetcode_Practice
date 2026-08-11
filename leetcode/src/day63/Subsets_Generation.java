package day63;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsets_Generation {
    static void main() {
        int[] nums={1,2,3};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        int index=0;
        generate(nums,index,l,res);
        return res;
    }
    private static void generate(int[] nums,int index,List<Integer> l,List<List<Integer>> res){
        if(index==nums.length){
            res.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[index]);
        generate(nums,index+1,l,res);
        l.removeLast();
        generate(nums,index+1,l,res);
    }
}
