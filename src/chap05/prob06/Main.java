package chap05.prob06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    
    public int solution(int n, int k){
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i<=n; i++){
            queue.add(i);
        }
        int count = 1;
        while(!queue.isEmpty()){
            for(int i = 1; i<k; i++){
                queue.add(queue.poll());
            }
            queue.poll();
            if(queue.size()==1){
                answer = queue.poll();
            }
            
        }
       
        
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(T.solution(n, k));
    }
}
