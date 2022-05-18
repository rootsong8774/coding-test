package chap02.prob03;

import java.util.Scanner;

public class Main {
    
    public char[] solution(int n, int[] rspOfA, int[] rspOfB) {
        
        char[] answer = new char[n];
        for (int i = 0; i < n; i++) {
            int diff = (rspOfA[i]- rspOfB[i]);
            if(diff==0){
                answer[i]='D';
            } else if(diff==1 || diff == -2){
                answer[i] = 'A';
            } else {
                answer[i] = 'B';
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] rspOfA = new int[n];
        int[] rspOfB = new int[n];
        for (int i = 0; i<n; i++){
            rspOfA[i] = kb.nextInt();
        }
        for (int i = 0; i<n; i++){
            rspOfB[i] = kb.nextInt();
        }
        char[] solution = T.solution(n, rspOfA, rspOfB);
        for (char c : solution) {
            System.out.println(c);
        }
    
    
    }
}
