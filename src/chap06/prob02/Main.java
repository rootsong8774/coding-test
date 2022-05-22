package chap06.prob02;

import java.util.Scanner;

public class Main {

    public int[] solution(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j);
                }
            }
        }
        return arr;
    }
    
    public static void swap(int[] arr, int i){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
    
    public static void main(String[] args) {
    
        Main T = new Main();
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
