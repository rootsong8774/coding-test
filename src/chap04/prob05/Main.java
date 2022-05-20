package chap04.prob05;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public int solution(int n, int k, int[] numArray) {
        int answer = -1;
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    tSet.add(numArray[i] + numArray[j] + numArray[l]);
                }
            }
        }
        int cnt = 0;
        for (Integer integer : tSet) {
            cnt++;
            if (cnt == k)
                answer = integer;
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] numArrays = new int[n];
        for(int i = 0; i<n; i++){
            numArrays[i] = kb.nextInt();
        }
    
        System.out.println(T.solution(n, k, numArrays));
    
    }
}
