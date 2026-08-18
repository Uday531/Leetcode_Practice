package day68;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {
    static void main() {
        int[] a={2,3,6,7};
        int target=7;
        System.out.println(combinationSum(a,target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> res=new ArrayList<>();
        backtrack(0,target,new ArrayList<>(),candidates,res);
        return res;
    }
    public static void backtrack(int index,int target,List<Integer> curr,int[] candidates,List<List<Integer>> res){
        if (target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            curr.add(candidates[i]);
            backtrack(i,target-candidates[i],curr,candidates,res);
            curr.removeLast();
        }
    }
}
