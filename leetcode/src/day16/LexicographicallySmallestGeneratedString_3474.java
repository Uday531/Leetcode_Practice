package day16;

import java.util.Arrays;

public class LexicographicallySmallestGeneratedString_3474 {
    static void main() {
        String s1 = "TFTF";
        String s2 = "ab";
        System.out.println(lexicographicalString(s1, s2));
    }

    public static String lexicographicalString(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        char[] c = new char[n + m - 1];
        Arrays.fill(c, 'a');
        boolean[] fix = new boolean[n + m - 1];
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == 'T') {
                for (int j = 0; j < m; j++) {
                    if (fix[i + j] && c[i + j] != s2.charAt(j)) {
                        return "";
                    }
                    c[i + j] = s2.charAt(j);
                    fix[i + j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == 'F') {
                boolean eq = true;
                for (int j = 0; j < m; j++) {
                    if (c[i + j] != s2.charAt(j)) {
                        eq = false;
                        break;
                    }
                }
                if (eq) {
                    boolean fixed_ = false;
                    for (int j = m - 1; j >= 0; j--) {
                        if (!fix[i+j]){
                                c[i+j]=(char)(s2.charAt(j)+1);
                                fixed_=true;
                                break;
                        }
                    }
                    if(!fixed_){
                        return "";
                    }
                }
            }
        }
        return new String(c);
    }
}

