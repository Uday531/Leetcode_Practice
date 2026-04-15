package day31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepetaedDNASequence_187 {
    static void main() {
        String s="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(dnaSequence(s));
    }
    public static List<String> dnaSequence(String s){
        Set<String> seen=new HashSet<>();
        Set<String> rep=new HashSet<>();
        for(int i=0;i<s.length()-9;i++){
            String substr=s.substring(i,i+10);
            if(seen.contains(substr)){
                rep.add(substr);
            }
            seen.add(substr);
        }
        return new ArrayList<>(rep);
    }
}
