package day66;

public class SubsetSumonGeneratedSequence {
    public static boolean isPossible(int[] arr, int s, int x) {
        // code here
        int[] res = new int[arr.length + 1];
        res[0] = s;
        int total = s;
        for (int i = 0; i < arr.length; i++) {
            int newnum = total + arr[i];
            res[i + 1] = newnum;
            total += newnum;

        }
        return SubsetSum(res, 0, 0, x);
    }

    public static boolean SubsetSum(int[] res, int index, int sum, int x) {
        if (sum == x) {
            return true;
        }
        if (index == res.length) {
            return false;
        }
        if (SubsetSum(res, index + 1, sum + res[index], x)) {
            return true;
        }
        if (SubsetSum(res, index + 1, sum, x)) {
            return true;
        }
        return false;
    }

    static void main() {
        int[] arr={1,2,4,2};
        int s=1;
        int x=7;
        System.out.println(isPossible(arr,s,x));
    }
}
