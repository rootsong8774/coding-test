package chap01.prob09;

import java.util.Scanner;

public class Main {
    
    public int solution(String str) {

//        str = str.replaceAll("[^0-9]", "");
//        return Integer.parseInt(str);
        
        int answer = 0;
        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }

        }
        
        return answer;
        
    }
    
    public static void main(String[] args) {
        
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
    
}
