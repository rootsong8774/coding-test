package chap01.prob12;

import java.util.Scanner;

public class Main {
    
    public String solution(int n, String str) {
    
        StringBuilder stringBuilder = new StringBuilder();
//        for(int i = 0; i<7*n; i=i+7){
//            String temp="";
//            temp = str.substring(i,i+7);
//            temp = temp.replace('#','1');
//            temp = temp.replace('*','0');
//            int sum = 0;
//            String[] strArray = temp.split("");
//            for(int j = 0; j< strArray.length; j++){
//                int toBinary = (int) (Integer.parseInt(strArray[j]) * Math.pow(2, strArray.length - j-1));
//                sum+=toBinary;
//            }
//
//            stringBuilder.append((char) sum);
//
//        }
    
        for (int i = 0; i < n; i++) {
            String temp = str.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(temp,2);
            stringBuilder.append((char) num);
            str = str.substring(7);
        }
        
        return stringBuilder.toString();
    }
    
    
    public static void main(String[] args) {
    
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    
    }
    
}
