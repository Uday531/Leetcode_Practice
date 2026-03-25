package day10;

public class SearchInRotatedSortedArray {
    static void main() {
        int[] a = {5, 1, 3};
        int target = 0;
        System.out.println(searchinArray(a, target));
    }

    public static int searchinArray(int[] a, int target) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == target)
                return mid;
            if (a[left] <= a[mid]) {
                if (target >= a[left] && target < a[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > a[mid] && target <= a[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

