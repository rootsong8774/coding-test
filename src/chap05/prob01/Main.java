package chap05.prob01;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public boolean solution(String parentheses){
        
        boolean answer = false;
        Stack<Character> stringStack = new Stack<>();
        int count = 0;
        char[] chars = parentheses.toCharArray();
        for (int i = chars.length-1; i>=0; i--) {
            stringStack.push(chars[i]);
        }
        if(stringStack.peek()==')'){
            return false;
        }
        while(!stringStack.isEmpty()){
            if(stringStack.pop()=='('){
                count++;
            } else {
                count--;
            }
            if(count<0) {
                return false;
            }
        }
        if(count==0){
            answer = true;
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
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
