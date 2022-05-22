package chap06.prob06;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int[] solution(int[] arr){
        int[] answer = new int[2];
        int[] clone = arr.clone();
        Arrays.sort(clone);
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            
            if(clone[i]!=arr[i]){
                answer[j]=i+1;
                j++;
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = kb.nextInt();
        }
        int[] solution = T.solution(arr);
        for (int i : solution) {
            System.out.print(i+" ");
        }
    }
}
