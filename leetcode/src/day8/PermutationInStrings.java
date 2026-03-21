package day8;

public class PermutationInStrings {
    static void main() {
        String s1="ab";
        String s2="eiboaghi";
        System.out.println(checkInclusion(s1,s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] count1 = new int[30];
        int[] count2 = new int[30];
        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }
        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            count2[s2.charAt(right) - 'a']++;
            if (right - left + 1 > s1.length()) {
                count2[s2.charAt(left) - 'a']--;
                left++;
            }
            if (matches(count1, count2)) {
                return true;
            }
        }
        return false;
    }
    private static boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}