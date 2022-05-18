package chap01.prob10;

import java.util.Scanner;

public class Main {
    
    public int[] solution(String s, char t){
    
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==t){
                p=0;
                answer[i]= p;
            } else {
                p++;
                answer[i]=p;
            }
        }
        
        p=1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i)==t){
                p=0;
            } else {
                p++;
                answer[i]=Math.min(answer[i],p);
            }
        }
        
//        Arrays.fill(answer, Integer.MAX_VALUE);
//        for(int i = 0; i<answer.length; i++){
//            for (int j = 0; j < s.length(); j++) {
//                int distance = s.indexOf(t, j) - i;
//                int temp;
//                if(distance <0){
//                    temp= -distance;
//                } else {
//                    temp = distance;
//                }
//                if(temp<answer[i]) {
//                    answer[i] = temp;
//                }
//            }
//        }
        
        return answer;
       
    }
    
    public static void main(String[] args) {
    
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String word = kb.next();
        char c = kb.next().charAt(0);
        int[] distance = T.solution(word, c);
        for (int i : distance) {
            System.out.print(i+" ");
        }
    }
}
