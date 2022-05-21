package chap05.prob02;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public String solution(String str){
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char x: str.toCharArray()){
            if(x=='('){
                stack.push(x);
            } else if(x == ')'){
                stack.pop();
            }
            if(stack.isEmpty() && Character.isLetter(x)){
                stringBuilder.append(x);
            }
        }
        
        
        return stringBuilder.toString();
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
    
}
