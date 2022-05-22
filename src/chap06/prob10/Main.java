package chap06.prob10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int count(int[] arr, int distance){
        int cnt = 1, left = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]-arr[left]>=distance){
                left = i;
                cnt++;
            }
        }
        return cnt;
        
    }
    public int solution(int horses, int[] stables){
        int answer = 0;
        Arrays.sort(stables);
        int[] neighbor = new int[stables.length-1];
        for(int i = 0; i<stables.length-1; i++){
            neighbor[i] = stables[i+1]-stables[i];
        }
        int lt = Arrays.stream(neighbor).min().getAsInt();
        int rt = stables[stables.length-1]-stables[0];
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(stables,mid)>=horses){
                answer = mid;
                lt = mid+1;
                
            } else {
                rt = mid-1;
            }
        }
        
        
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int horses = kb.nextInt();
        int[] stables = new int[n];
        for(int i = 0; i<stables.length; i++){
            stables[i] = kb.nextInt();
        }
        System.out.println(T.solution(horses, stables));
    }
}
