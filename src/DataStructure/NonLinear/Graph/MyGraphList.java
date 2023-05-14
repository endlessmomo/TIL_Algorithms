package DataStructure.NonLinear.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
    int id;
    Node next;

    public Node(int id, Node next) {
        this.id = id;
        this.next = next;
    }
}

class MGraphList {

    char[] vertices;
    Node[] adjList;
    int elemCnt;

    public MGraphList(int size) {
        this.vertices = new char[size];
        this.adjList = new Node[size];
        this.elemCnt = size;
    }

    public boolean isFull() {
        return this.elemCnt == this.vertices.length;
    }

    public void addVertex(char data) {
        if(isFull()){
            System.out.println("Graph is full");
            return;
        }

        this.vertices[this.elemCnt++] = data;
    }

    public void addEdge(int x, int y){
        this.adjList[x] = new Node(x, this.adjList[x]);
        this.adjList[y] = new Node(y, this.adjList[y]);
    }
}

public class MyGraphList {
    public static void main(String[] args) {
        System.out.println(makePalindrome());
    }

    public static String makePalindrome() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        sb.append(sc.next());
        return sb.toString() + "/" + sb.reverse().toString();
    }
}
