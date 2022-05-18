package chap02.prob12;

import java.util.Scanner;

public class Main {
    
    public int solution(int numOfStudents, int numOfTests, int[][] testResults) {
        
        int answer  = 0;
        for(int i =1; i<=numOfStudents; i++){
            for(int j = 1; j<=numOfStudents; j++){
                int cnt = 0;
                for (int k = 0; k < numOfTests; k++) {
                    int pi = 0, pj = 0;
                    for(int s = 0; s<numOfStudents; s++){
                        if(testResults[k][s]==i) pi = s;
                        if(testResults[k][s]==j) pj = s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt == numOfTests) answer++;
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int numOfStudents = kb.nextInt();
        int numOfTests = kb.nextInt();
        int[][] testResults = new int[numOfTests][numOfStudents];
        for (int i = 0; i<numOfTests; i++) {
            for (int j=0; j<numOfStudents; j++) {
                testResults[i][j] = kb.nextInt();
            }
        }
    
        System.out.println(T.solution(numOfStudents, numOfTests, testResults));
    
    }
}
