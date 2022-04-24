package chap01.sec05;

import java.util.Scanner;

public class Main {
    
    public String solution(String str) {
        
        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;
        
        while (lt < rt) {
            
            if (!Character.isAlphabetic(chars[lt]) ) {
                lt++;
            }
            if(!Character.isAlphabetic(chars[rt])){
               rt--;
            }
            if (Character.isAlphabetic(chars[lt]) && Character.isAlphabetic(chars[rt])) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
            
        }
        
        return String.valueOf(chars);
    }
    
    public static void main(String[] args) {
        
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
        
    }
    
}
