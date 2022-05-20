package chap04.prob03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public ArrayList<Integer> solution(int n, int k, int[] sales){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<k-1; i++){
            map.put(sales[i], map.getOrDefault(sales[i],0)+1);
        }
        int lt = 0;
        for(int rt = k-1; rt<n; rt++){
            map.put(sales[rt], map.getOrDefault(sales[rt],0)+1);
            answer.add(map.size());
            map.put(sales[lt],map.get(sales[lt])-1);
            if(map.get(sales[lt])==0) map.remove(sales[lt]);
            lt++;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] sales = new int[n];
        for (int i = 0; i<sales.length; i++) {
            sales[i] = kb.nextInt();
        }
        for (int i : T.solution(n,k,sales)) {
            System.out.print(i+" ");
        }
    
    }
}
