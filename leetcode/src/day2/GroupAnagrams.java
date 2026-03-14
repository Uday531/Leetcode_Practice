package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    static void main() {
        String[] s=new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> l=groupAnagrams(s);
        System.out.println(l);
    }
    public static List<List<String>> groupAnagrams(String[] s){
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String e:s){
            char[] j=e.toCharArray();
            Arrays.sort(j);
            String key=new String(j);
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<>());
            }
            hm.get(key).add(e);
        }
        return new ArrayList<>(hm.values());
    }
}
