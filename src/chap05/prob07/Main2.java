package chap05.prob07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
    public boolean solution(String required, String plan){
        
        Queue<Character> queue = new LinkedList<>();
        for(char x: required.toCharArray()){
            queue.offer(x);
        }
        for(char x: plan.toCharArray()){
            if(queue.contains(x)){
                if(x!= queue.poll()){
                    return false;
                }
            }
        }
        return queue.size()==0;
    }
    
    public static void main(String[] args) {
        Main2 T = new Main2();
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
