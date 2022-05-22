package chap06.prob07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Coordinate implements Comparable<Coordinate>{
    int x;
    int y;
    
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    @Override
    public int compareTo(Coordinate o) {
        if(this.x == o.x) {
            return this.y-o.y;
        } else {
            return this.x - o.x;
        }
        
    }
}

public class Main {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Coordinate> coordinates = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           int x = kb.nextInt();
           int y = kb.nextInt();
           coordinates.add(new Coordinate(x,y));
        }
        Collections.sort(coordinates);
        
        for (Coordinate coordinate : coordinates) {
            System.out.println(coordinate.x+" "+coordinate.y);
        }
        
    }
}
