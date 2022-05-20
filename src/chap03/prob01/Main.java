package chap03.prob01;

import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] firstArr, int m, int[] secondArr){
        
        int[] answer = new int[n+m];
        int ptr1=0, ptr2=0;
        for(int i = 0; i<answer.length; i++){
            if(firstArr[ptr1]<=secondArr[ptr2]){
                answer[i]=firstArr[ptr1++];
            } else {
                answer[i] = secondArr[ptr2++];
            }
            
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] firstArr = new int[n+1];
        for(int i = 0; i<n; i++){
            firstArr[i] = kb.nextInt();
        }
        firstArr[n] = Integer.MAX_VALUE;
        int m = kb.nextInt();
        int[] secondArr = new int[m+1];
        for(int i = 0; i<m; i++){
            secondArr[i] = kb.nextInt();
        }
        secondArr[m] = Integer.MAX_VALUE;
        int[] solution = T.solution(n, firstArr, m, secondArr);
        for (int i : solution) {
            System.out.print(i+" ");
        }
    
    }
}
