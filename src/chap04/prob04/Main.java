package chap04.prob04;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    
    public int solution(String s, String t){
        int answer = 0;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        
        for(char x: t.toCharArray()){
            tMap.put(x, tMap.getOrDefault(x, 0)+1);
        }
        int tLength  = t.length()-1;
        for(int i = 0; i<tLength; i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
        }
        int left = 0;
        for(int right = tLength; right<s.length(); right++){
            sMap.put(s.charAt(right), sMap.getOrDefault(s.charAt(right),0)+1);
            if(sMap.equals(tMap)){
                answer++;
            }
            sMap.put(s.charAt(left), sMap.get(s.charAt(left))-1);
            if(sMap.get(s.charAt(left))==0){
                sMap.remove(s.charAt(left));
            }
            left++;
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        String t = kb.next();
        System.out.println(T.solution(s, t));
    
    }
}
