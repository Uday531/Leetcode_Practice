package day1;

import java.util.HashMap;

public class ValidAnagram {
    static void main() {
        String a = "uday";
        String b = "duay";
        boolean s = validAnagram(a, b);
        System.out.println(s);
    }

    public static boolean validAnagram(String a, String b) {
        HashMap<Character, Integer> h = new HashMap<>();
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (h.containsKey(c)) {
                h.put(c, h.getOrDefault(c, 0) + 1);
            } else {
                h.put(c, 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (!h.containsKey(c)) {
                return false;
            } else {
                h.put(c, h.get(c) - 1);
            }
            if (h.get(c) == 0) {
                h.remove(c);
            }
        }
        return h.isEmpty();
    }
}