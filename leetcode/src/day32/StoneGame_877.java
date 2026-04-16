package day32;

public class StoneGame_877 {
    static void main() {
        int[] a={1,0,1,2};
        System.out.println(stoneGame(a));
    }
    public static boolean stoneGame(int[] p){
        int[][] cache=new int[p.length][p.length];
        return dfs(0,0,true,p,cache,0,0);
    }
    private static boolean dfs(int start,int end,boolean player,int[] piles,int[][] cache,int aScore,int bScore){
        if(start>end){
            return aScore>bScore;
        }
        if (cache[start][end]!=0){
            return cache[start][end]==1?true:false;
        }
        boolean first=false;
        boolean last=false;
        boolean res=false;
        if(player){
            first=dfs(start+1,end,!player,piles,cache,aScore+piles[start],bScore);
            if(first){
                res=true;
            }
            last=dfs(start,end-1,!player,piles,cache,aScore+piles[start],bScore);
            res=last;
        }else {
            first=dfs(start+1,end,!player,piles,cache,aScore,bScore+piles[start]);
            if(!first){
                res=false;
            }
            last=dfs(start,end-1,!player,piles,cache,aScore,bScore+piles[end]);
            res=!last;
        }
        cache[start][end]=res?1:2;
        return res;
    }
}
