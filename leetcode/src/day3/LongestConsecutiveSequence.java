package day3;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    static void main() {
        int[] a = {100,4,200,1,3,2};
        int r = longestConsecutive(a);
        System.out.println(r);
    }

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longest = 0;

        for(int num : set){

            if(!set.contains(num - 1)){ // start of sequence
                int current = num;
                int length = 1;

                while(set.contains(current + 1)){
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
