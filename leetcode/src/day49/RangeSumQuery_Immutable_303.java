package day49;

public class RangeSumQuery_Immutable_303 {
    static void main() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery_Immutable_303 obj = new RangeSumQuery_Immutable_303(nums);
        System.out.println(obj.sumRange(0, 2));
        System.out.println(obj.sumRange(2, 5));
        System.out.println(obj.sumRange(0, 5));
    }
    int[] prefix;
    public RangeSumQuery_Immutable_303(int[] nums) {
        prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }
    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}
