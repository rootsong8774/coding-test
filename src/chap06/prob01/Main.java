package chap06.prob01;

import java.util.Scanner;

public class Main {
    
    public int[] solution(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                swap(arr, minIndex, i);
            }
           
        }
        return arr;
    }
    
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
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
