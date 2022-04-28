package chap02.sec02;

import java.util.Scanner;

public class Main {
    
    public int solution(int numOfStudent, int[] heightOfStudents) {
        
        int answer = 1, max = heightOfStudents[0];
//        String[] heights = heightOfStudents.split(" ");
//        for (int i = 1; i < numOfStudent; i++) {
//            if(Integer.parseInt(heights[i-1]) < Integer.parseInt(heights[i])){
//                answer++;
//
//            } else {
//                heights[i] = heights[i-1];
//            }
//        }
        for(int i = 1; i< numOfStudent; i++){
            if(heightOfStudents[i]>max){
                answer++;
                max = heightOfStudents[i];
            }
        }
    
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int numOfStudent = kb.nextInt();
        int[] studentsArray = new int[numOfStudent];
        for(int i = 0; i<numOfStudent; i++){
            studentsArray[i]= kb.nextInt();
        }
        System.out.println(T.solution(numOfStudent, studentsArray));
    }
    
}
