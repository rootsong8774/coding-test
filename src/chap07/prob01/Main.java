package chap07.prob01;

public class Main {
    
    public void DFS(int n) {
    
        if (n == 0) {
            return;
        } else {
            DFS(n - 1);
            System.out.print(n+" ");
        }
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(3);
    }
}
