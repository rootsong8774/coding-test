package chap02.prob06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public List<Integer> solution(int n, int[] nums){
    
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i<n; i++) {
//            String s = new StringBuilder().append(nums[i]).reverse().toString();
//            int reversedNum = Integer.parseInt(s);
//            nums[i] = reversedNum;
            int tmp = nums[i];
            int res = 0;
            while(tmp>0){
                int t = tmp%10;
                res = res*10 + t;
                tmp/=10;
            }
            nums[i] = res;
            
        }
        for (Integer integer : nums) {
            if(isPrime(integer)){
                isPrime(integer);
                answer.add(integer);
            }
        }
        return answer;
        
    }
    
    public boolean isPrime(int n) {
        if(n==1){
            return false;
        }
        for(int i = 2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
    
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] numArray = new int[n];
        for(int i = 0; i<n; i++){
            numArray[i] = kb.nextInt();
        }
        List<Integer> solution = T.solution(n, numArray);
        for (Integer integer : solution) {
            System.out.print(integer+ " ");
        }
    
    }
}
