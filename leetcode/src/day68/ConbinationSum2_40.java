package day68;

import java.util.*;

public class ConbinationSum2_40 {
    static void main() {
        int[] a={10,1,2,7,6,1,5};
        int target=8;
        System.out.println(combinationSum2(a,target));
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        Set<List<Integer>> res=new HashSet<>();
        backtrack(0,target,new ArrayList<>(),candidates,res);
        return new ArrayList<>(res);
    }
    public static void backtrack(int index,int target,List<Integer> curr,int[] candidates,Set<List<Integer>> res){
        if (target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            curr.add(candidates[i]);
            backtrack(i+1,target-candidates[i],curr,candidates,res);
            curr.removeLast();
        }
    }
}
