package chap05.prob01;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    
    public boolean solution(String parentheses){
        
        Stack<Character> stack = new Stack<>();
        for(char x: parentheses.toCharArray()){
            if(x=='('){
                stack.push(x);
            } else {
                if(stack.isEmpty()){
                    return false;
                } else {
                    stack.pop();
                }
                
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String parentheses = kb.next();
        boolean solution = T.solution(parentheses);
        if(solution){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}
