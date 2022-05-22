package chap06.prob08;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public int solution(int m, int[] arr){
        
        
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, m)+1;
        
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(m, arr));
    
    }
}
