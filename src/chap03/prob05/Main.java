package chap03.prob05;

import java.util.Scanner;

public class Main {
    
    public int solution(int n){
        int answer = 0;
        int sum = 0;
        int left = 0;
        int m = n/2+1;
        int[] arr = new int[m];
        for(int i=0; i<m; i++){
            arr[i] = i+1;
        }
        for (int right = 0; right < m; right++) {
            sum+=arr[right];
            if(sum==n) answer++;
            while(sum>=n){
                sum-=arr[left++];
                if(sum==n) answer++;
            }
        }
       
        return answer;
    }
    
    public static void main(String[] args) {
    
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
