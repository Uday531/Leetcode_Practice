package day40;

public class FurthestPointFromOrigin_2833 {
    static void main() {
        String a="LR__L";
        System.out.println(furthestDistanceFromOrigin(a));
    }
    public static int furthestDistanceFromOrigin(String moves) {
        int left=0,right=0,blank=0;
        for(char c:moves.toCharArray()){
            if(c=='L' ){
                left++;
            }
            else if(c=='R'){
                right++;
            }
            else{
                blank++;
            }
        }
        return Math.abs(right-left)+blank;
    }
}

