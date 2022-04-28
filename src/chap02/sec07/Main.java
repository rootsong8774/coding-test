package chap02.sec07;

import java.util.Scanner;

public class Main {
    
    public int solution(int n, int[] answerArray){
        int totalPoint = 0;
        int currentPoint =1;
        for(int i = 0; i<n; i++){
            
            if(answerArray[i]==1){
                totalPoint+=currentPoint;
                currentPoint++;
            } else {
                currentPoint =1;
            }
           
        }
        
        return totalPoint;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] answerArray = new int[n];
        for (int i = 0; i < n; i++) {
            answerArray[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, answerArray));
    }
}
