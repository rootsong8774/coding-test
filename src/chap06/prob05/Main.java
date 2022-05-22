package chap06.prob05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public boolean solution( int[] arr){
        
        boolean answer = true;
        Arrays.sort(arr);
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                answer = false;
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }
        boolean solution = T.solution(arr);
        if(solution) {
            System.out.println('U');
        } else {
            System.out.println('D');
        }
    }
}
