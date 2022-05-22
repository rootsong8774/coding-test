package chap06.prob04;

import java.util.Scanner;

public class Main {
    public int[] solution(int s, int[] processes){
        int[] cache =new int[s];
        for(int x : processes){
            int pos = -1;
            for(int i = 0; i<s; i++){
                if(x==cache[i]) pos = i;
            }
            if(pos == -1){
                for(int i = s-1; i>=1; i--){
                    cache[i] = cache[i-1];
                }
                
            } else {
                for(int i = pos; i>=1; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] processes = new int[n];
        for (int i = 0; i < processes.length; i++) {
            processes[i] = kb.nextInt();
        }
        int[] solution = T.solution(s, processes);
        for (int i : solution) {
            System.out.print(i+" ");
        }
    
    }
}
