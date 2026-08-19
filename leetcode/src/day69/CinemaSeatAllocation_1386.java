package day69;

import java.util.HashMap;
import java.util.HashSet;

public class CinemaSeatAllocation_1386 {
    static void main() {
        int[][] reservedSeats={
                {4,3},{1,4},{4,6},{1,7}
        };
        int n=4;
        System.out.println(cinemaAllocation(n,reservedSeats));
    }
    public static int cinemaAllocation(int n,int[][] reservedSeats){
        HashMap<Integer, HashSet<Integer>> h=new HashMap<>();
        for (int[] seat:reservedSeats){
            int row=seat[0];
            int col=seat[1];
            h.putIfAbsent(row,new HashSet<>());
            h.get(row).add(col);
        }
        int ans=(n-h.size())*2;
        for (HashSet<Integer> seat:h.values()){
            boolean left=available(seat,2,5);
            boolean middle=available(seat,4,7);
            boolean right=available(seat,6,9);
            if (left && right){
                ans+=2;
            } else if (left || middle || right) {
                ans+=1;
            }
        }
        return ans;
    }
    public static boolean available(HashSet<Integer> seat,int start, int end){
        for (int i=start;i<=end;i++){
            if (seat.contains(i)){
                return false;
            }
        }
        return true;
    }
}
