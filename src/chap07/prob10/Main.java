package chap07.prob10;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    
    int data;
    Node lt, rt;
    
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main {
    
    Node root;
    
    public int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node current = queue.poll();
                if (current.lt == null && current.rt == null) {
                    return L;
                }
                if (current.lt != null) {
                    queue.offer(current.lt);
                }
                if (current.rt != null) {
                    queue.offer(current.rt);
                }
                
            }
            L++;
        }
        return L;
    }
    
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
        
        
    }
}