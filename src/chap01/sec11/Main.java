package chap01.sec11;

import java.util.Scanner;

public class Main {
    
    public String solution(String str) {
        
        StringBuilder answer = new StringBuilder();
        int count = 1;
        str += " ";
        for (int i = 0; i < str.length() - 1; i++) {
            
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else if (count >= 2) {
                answer.append(str.charAt(i));
                answer.append(count);
                count = 1;
            } else {
                answer.append(str.charAt(i));
            }
        }
        
        return answer.toString();
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
