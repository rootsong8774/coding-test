package chap01.sec06;

import java.util.Scanner;

public class Main {
    
    public String solution(String str) {
        String answer = "";
//        String[] stringArray = str.split("");
//        for (String s : stringArray) {
//            if(!answer.contains(s)){
//                answer += s;
//            }
//        }
    
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i))==i){
                answer+=str.charAt(i);
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
