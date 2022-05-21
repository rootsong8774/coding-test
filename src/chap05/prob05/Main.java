package chap05.prob05;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public int solution(String parentheses){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<parentheses.length(); i++){
            if(parentheses.charAt(i)=='('){
                stack.push('(');
            } else {
                stack.pop();
                if(parentheses.charAt(i-1)=='('){
                    answer+=stack.size();
                } else {
                    answer++;
                }
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String parentheses = kb.next();
        System.out.println(T.solution(parentheses));
    }
}
