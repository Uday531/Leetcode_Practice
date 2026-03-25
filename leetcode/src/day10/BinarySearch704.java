package day10;

public class BinarySearch704 {
    static void main() {
        int[] a = {2, 4, 5, 6, 8, 9};
        int target = 3;
        System.out.println(binarySearch(a, target));
    }

    public static int binarySearch(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return a[i];
            }
        }
        return -1;
    }
}
