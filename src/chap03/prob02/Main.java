package chap03.prob02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public ArrayList<Integer> solution(int n, int[] firstArr, int m, int[] secondArr) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);
        int ptr1 =0, ptr2 = 0;
        while(ptr1<n && ptr2<m) {
            if (firstArr[ptr1] < secondArr[ptr2]) {
                ptr1++;
            } else if (firstArr[ptr1] > secondArr[ptr2]) {
                ptr2++;
            } else {
                answer.add(firstArr[ptr1++]);
                ptr2++;
            }
        }
        
        return answer;
    }
    
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] firstArr = new int[n ];
        for (int i = 0; i < n; i++) {
            firstArr[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] secondArr = new int[m];
        for (int i = 0; i < m; i++) {
            secondArr[i] = kb.nextInt();
        }
        ArrayList<Integer> solution = T.solution(n, firstArr, m, secondArr);
        for (int i : solution) {
            System.out.print(i + " ");
        }
        
    }
    
    
}
