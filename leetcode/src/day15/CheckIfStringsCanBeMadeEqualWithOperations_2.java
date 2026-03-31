package day15;

public class CheckIfStringsCanBeMadeEqualWithOperations_2 {
    static void main() {
        String s1="abcdba";
        String s2="cabdab";
        System.out.println(checkIfString_2(s1,s2));
    }
    public static boolean checkIfString_2(String s1,String s2){
        int[] even=new int[26];
        int[] odd=new int[26];
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                even[s1.charAt(i)-'a']++;//[1,0,0,0,0..]
                even[s2.charAt(i)-'a']--;//[1,0,-1,0,0..]
            }
            else {
                odd[s1.charAt(i)-'a']++;//[0,1,0,]
                odd[s2.charAt(i)-'a']--;//[0,0,0,..]
            }
        }
        for(int i=0;i<26;i++){
            if(even[i]!=0 || odd[i]!=0){
                return false;
            }
        }
        return true;
    }
}
