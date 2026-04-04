package day20;

public class RemoveDuplicatesFromSortedArray_26 {
    static void main() {
        int[] a={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(a));
    }
    public static int removeDuplicates(int[] a){
        if(a.length==0){
            return 0;
        }
        int i=0;
        for(int j=1;j<a.length;j++){
            if(a[j]!=a[i]){
                i++;
                a[i]=a[j];
            }
        }
        return i+1;
    }
}
