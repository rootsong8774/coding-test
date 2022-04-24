package chap01.sec08;

import java.util.Scanner;

public class Main {
    
    public boolean solution(String str) {
    
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i<str.length();i++) {
//            if(Character.isAlphabetic(str.charAt(i))){
//                stringBuilder.append(str.charAt(i));
//            }
//        }
//        String newString = stringBuilder.toString();
//        String reversedString = stringBuilder.reverse().toString();
//
//        return newString.equalsIgnoreCase(reversedString);
    
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        return str.equals(tmp);
    }
    
    public static void main(String[] args) {
    
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str) ? "YES" : "NO");
    }
    
}
