package chap03.prob05;

import java.util.Scanner;

public class Main2 {
    
    public int solution(int n){
        int answer=0, cnt = 1;
        n--;
        while(n>0){
            cnt++;
            n-=cnt;
            if(n%cnt==0) answer++;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
