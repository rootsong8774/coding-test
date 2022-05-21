package chap05.prob04;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public int solution(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (char x : exp.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x-48);
            } else {
                int secondInteger = stack.pop();
                int firstInteger = stack.pop();
                int result =0;
                switch (x) {
                    case '+':
                        result = firstInteger + secondInteger;
                        break;
                    case '-':
                        result = firstInteger - secondInteger;
                        break;
                    case '*':
                        result = firstInteger * secondInteger;
                        break;
                    case '/':
                        result = firstInteger / secondInteger;
                        break;
                }
                stack.push(result);
            }
        }
        
        return stack.pop();
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String exp = kb.next();
        System.out.println(T.solution(exp));
    }
}
