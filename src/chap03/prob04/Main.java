package chap03.prob04;

import java.util.Scanner;

public class Main {
    
    public int solution(int n, int m, int[] seq){
        int answer = 0;
        int sum = 0;
        int left = 0;
        int right = 0;
        
        while(right<n){
            if(sum<m){
                sum+=seq[right++];
            } else if(sum >= m){
                sum-=seq[left];
                left++;
            }
            if(sum == m ){
                answer++;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = kb.nextInt();
        }
    
        System.out.println(T.solution(n,m, seq));
    
    }
}
