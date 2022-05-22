package chap06.prob03;

import java.util.Scanner;

public class Main {
    
    public int[] solution(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int targetIdx = i;
            while(targetIdx>0&& arr[targetIdx]<arr[targetIdx-1] ){
                swap(arr, targetIdx);
                targetIdx--;
            }
        }
        
        return arr;
    }
    
    public static void swap(int[] arr, int i){
        int temp = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] =temp;
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
