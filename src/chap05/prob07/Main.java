package chap05.prob07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public boolean solution(String required, String plan){
        
        Queue<Character> requiredQueue = new LinkedList<>();
        
        for(char x : required.toCharArray()){
           requiredQueue.offer(x);
        }
        for(char x: plan.toCharArray()){
            if(requiredQueue.isEmpty()){
                return true;
            }
            if(requiredQueue.peek()==x){
                requiredQueue.remove();
            }
        }
        return requiredQueue.size()==0;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String required = kb.next();
        String plan = kb.next();
        boolean solution = T.solution(required, plan);
        if(solution){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
