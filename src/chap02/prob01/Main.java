package chap02.prob01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public ArrayList<Integer> solution(int n, int[] input) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(input[0]);
        for (int i = 1; i < n; i++) {
            if(input[i]>input[i-1]){
                answer.add(input[i]);
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        int[] input = new int[n];
        for(int i = 0; i<input.length; i++){
            input[i]=kb.nextInt();
        }
        for (Integer x : T.solution(n, input)) {
            System.out.print(x+ " ");
        }
    }
    
}
