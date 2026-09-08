package day71;

public class CountCommasInRange_3870 {
    static void main() {
        int n=1098;
        System.out.println(countCommas(n));
    }
    public static int countCommas(int n) {
        int ans = 0;
        for (long start=1000,commas=1;start<=n;start*=1000,commas++) {
            long end = Math.min(n,start*1000-1);
            ans+= (int) ((end-start+1)*commas);
        }
        return ans;
    }

}
