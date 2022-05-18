package chap02.prob09;

import java.util.Scanner;

public class Main {
    
    public int solution(int n, int[][] numGrid){
        
        int answer = Integer.MIN_VALUE;
        int diagonalSum = 0;
        int diagonalSum2 = 0;
        
        
        for(int i = 0; i<n; i++){
            int horizonSum = 0;
            int verticalSum = 0;
            for(int j = 0; j<n; j++){
                horizonSum+=numGrid[i][j];
                verticalSum+=numGrid[j][i];
            }
            answer = Math.max(answer, horizonSum);
            answer = Math.max(answer, verticalSum);
            
        }
    
        for(int i = 0; i<n; i++){
        
            diagonalSum+=numGrid[i][i];
            diagonalSum2+=numGrid[i][n-i-1];
        
        }
        answer = Math.max(answer, diagonalSum);
        answer = Math.max(answer, diagonalSum2);
        
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] numGrid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numGrid[i][j]= kb.nextInt();
            }
        }
    
        System.out.println(T.solution(n, numGrid));
    }
    
}
