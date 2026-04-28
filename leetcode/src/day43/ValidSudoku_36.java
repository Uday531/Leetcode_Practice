package day43;

import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku_36 {
    static void main() {
        String[][] a={{"5","3",".",".","7",".",".",".","."}
,{"6",".",".","1","9","5",".",".","."}
,{".","9","8",".",".",".",".","8","."}
,{"8",".",".",".","6",".",".",".","3"}
,{"4",".",".","8",".","3",".",".","1"}
,{"7",".",".",".","2",".",".",".","6"}
,{".","6",".",".",".",".","2","8","."}
,{".",".",".","4","1","9",".",".","5"}
,{".",".",".",".","8",".",".","1","9"}};
        System.out.println(isValidSudoku(a));
    }
    public static boolean isValidSudoku(String[][] s){
        HashMap<Integer,HashSet<String>> row=new HashMap<>();
        HashMap<Integer,HashSet<String>> col=new HashMap<>();
        HashMap<Integer,HashSet<String>> box=new HashMap<>();
        for (int i=0;i<s.length;i++){
            row.put(i,new HashSet<>());
            col.put(i,new HashSet<>());
            box.put(i,new HashSet<>());
        }
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                String num=s[i][j];
                if (num.equals(".")){
                    continue;
                }
                int boxindex=(i/3)*3+(j/3);
                if (row.get(i).contains(num) || col.get(j).contains(num) || box.get(boxindex).contains(num)){
                    return false;
                }
                row.get(i).add(num);
                col.get(j).add(num);
                box.get(boxindex).add(num);
            }
        }
        return true;
    }
}
