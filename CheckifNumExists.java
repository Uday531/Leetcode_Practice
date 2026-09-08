public class CheckifNumExists {
    static void main() {
        int[] hv={2,7,34,8,3};
        int k=34;
        String j=exists(hv,k);
        System.out.println(j);
    }
    public static String exists(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return "yes";
            }
        }
        return "no";
    }
}
