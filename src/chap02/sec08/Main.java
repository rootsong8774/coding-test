package chap02.sec08;

import java.util.Scanner;

public class Main {
    
    public int[] solution(int n, int[] scores) {
        
        int[] answer = new int[n];
        return answer;
    }
    
    public static void main(String[] args) {
    
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] scoresArray = new int[n];
        for (int i = 0; i<n; i++) {
            scoresArray[i] = kb.nextInt();
        }
        int[] solution = T.solution(n, scoresArray);
        for (int i : solution) {
            System.out.print(i+" ");
        }
    }
    
}
