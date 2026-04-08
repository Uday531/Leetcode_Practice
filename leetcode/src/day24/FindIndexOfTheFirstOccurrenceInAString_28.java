package day24;

public class FindIndexOfTheFirstOccurrenceInAString_28 {
    static void main() {
        String a="sadbutbad";
        String b="bad";
        System.out.println(firstOccurrence(a,b));
    }
    public static int firstOccurrence(String a,String b){
        for(int i=0;i<a.length()-b.length()+1;i++){
            if(a.charAt(i)==b.charAt(0)){
                if(a.startsWith(b, i)){
                    return i;
                }
            }
        }
        return -1;
    }
}
