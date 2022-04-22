package chap01.sec03;

import java.util.Scanner;

public class Main {
    
    public String solution(String str) {
        
        String answer = "";
        /*String[] s = str.split(" ");
        for (String s1 : s) {
            if(s1.length()>answer.length()){
                answer=s1;
            }
        }*/
        
        int m = Integer.MIN_VALUE, pos;
        while((pos= str.indexOf(' '))!=-1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            str = str.substring(pos+1); //확인된 단어는 제거
        }
        if(str.length()>m){
            answer = str; //마지막 단어 처리
        }
        return answer;
    }
    
    public static void main(String[] args) {
    
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    
    }
    
}
