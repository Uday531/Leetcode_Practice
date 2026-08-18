package day68;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams_49 {
    static void main() {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String,List<String>> h=new HashMap<>();
        for (String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            if (!h.containsKey(key)){
                h.put(key,new ArrayList<>());
            }
            h.get(key).add(s);
        }
        return new ArrayList<>(h.values());
    }
}
