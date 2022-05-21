package chap05.prob08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Patient {
    
    int id;
    int priority;
    
    public Patient(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Main {
    
    public int solution(int m, int[] arr) {
        int answer = 1;
        Queue<Patient> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.offer(new Patient(i, arr[i]));
        }
        while (!queue.isEmpty()) {
            Patient tmp = queue.remove();
            for (Patient x : queue) {
                if(x.priority>tmp.priority){
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                if(tmp.id==m){
                    return answer;
                } else{
                    answer++;
                }
            }
            
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(m, arr));
    }
}
