package chap03.prob03;

import java.util.Scanner;

public class Main {
    
    public int solution(int window, int[] sales){
        
        int sum = 0;
        int answer = 0;
        for (int i = 0; i<sales.length; i++){
            sum+=sales[i];
            if(i>=window){
                sum-=sales[i-window];
            }
            answer = Math.max(answer, sum);
        }
        
        
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int days = kb.nextInt();
        int window = kb.nextInt();
        int[] sales = new int[days];
        for (int i = 0; i < days; i++) {
            sales[i] = kb.nextInt();
        }
    
        System.out.println(T.solution(window, sales));
        
    }
}
