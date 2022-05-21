package chap05.prob03;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public int solution(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                int pick = board[i][pos - 1];
                if (pick > 0) {
                    board[i][pos - 1] = 0;
                    if (stack.isEmpty() || stack.peek() != pick) {
                        stack.push(pick);
                    } else {
                        stack.pop();
                        answer += 2;
                    }
                    break;
                }
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for(int row = 0; row < board.length; row++){
            for(int cell = 0; cell<board[row].length; cell++){
                board[row][cell] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i< moves.length; i++){
            moves[i] = kb.nextInt();
        }
    
        System.out.println(T.solution(board, moves));
    }
}
