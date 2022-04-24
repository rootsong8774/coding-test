package chap01.sec07;

import java.util.Scanner;

public class Main {
    
    public boolean solution(String str) {
//        String reversedString = new StringBuilder(str).reverse().toString();
//
//        return reversedString.equalsIgnoreCase(str);
        
        int len = str.toUpperCase().length();
        for(int i = 0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str) ? "YES" : "NO");
    }
    
}
