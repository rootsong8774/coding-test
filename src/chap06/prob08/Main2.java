package chap06.prob08;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    
    public int solution(int m, int[] arr){
        
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0;
        int rt = arr.length-1;
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(arr[mid]==m){
                answer = mid+1;
                break;
            }
            if(arr[mid]>m){
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }
        return answer;
        
    }
    
    public static void main(String[] args) {
        Main2 T = new Main2();
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
