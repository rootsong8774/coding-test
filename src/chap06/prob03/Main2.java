package chap06.prob03;

import java.util.Scanner;

public class Main2 {
    
    public int[] solution(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int tmp = arr[i], j;
            for(j = i-1; j>=0; j--){
                if(arr[j]>tmp){
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
        
        return arr;
    }
    
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }
        int[] solution = T.solution(arr);
        for (int i : solution) {
            System.out.print(i+" ");
        }
    }
}
