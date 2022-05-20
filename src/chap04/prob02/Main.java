package chap04.prob02;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    
    public boolean solution(String str1, String str2){
        boolean answer = true;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(Character x : str1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(Character x: str2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0){
                return false;
            } map.put(x, map.get(x)-1);
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.nextLine();
        String str2 = kb.nextLine();
        
        
        if(T.solution(str1,str2)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
}
