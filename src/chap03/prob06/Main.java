package chap03.prob06;

import java.util.Scanner;

public class Main {
    
    public int solution(int n, int k, int[] binaryArray) {
        int answer = 0, cnt = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (binaryArray[rt] == 0) {
                cnt++;
            }
            while (cnt > k) {
                if (binaryArray[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] binaryArray = new int[n];
        for (int i = 0; i < n; i++) {
            binaryArray[i] = kb.nextInt();
        }
        
        System.out.println(T.solution(n, k, binaryArray));
        
    }
    
}
