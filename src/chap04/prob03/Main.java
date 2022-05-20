package chap04.prob03;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public int[] solution(int n, int k, int[] sales){
        int[] answer = new int[n-k+1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<k; i++){
            map.put(sales[i], map.getOrDefault(sales[i],0)+1);
        }
        answer[0] = map.size();
        for(int j = 1; j<n-k+1; j++){
            map.put(sales[j+k-1],map.getOrDefault(sales[j+k-1],0)+1);
            if(map.get(sales[j-1]).equals(1)){
                map.remove(sales[j-1]);
            } else{
                map.put(sales[j-1],map.get(sales[j-1])-1);
            }
            answer[j] = map.size();
            
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] sales = new int[n];
        for (int i = 0; i<sales.length; i++) {
            sales[i] = kb.nextInt();
        }
        int[] solution = T.solution(n, k, sales);
        for (int i : solution) {
            System.out.print(i+" ");
        }
    
    }
}
