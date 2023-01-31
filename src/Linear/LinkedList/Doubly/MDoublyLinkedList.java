package Linear.LinkedList.Doubly;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

class MakeDoublyLinkedList {
    Node head;
    Node tail;

    public MakeDoublyLinkedList() {
    }

    ;

    public MakeDoublyLinkedList(Node node) {
        this.head = node;
        this.tail = node;
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    // Head 측으로 데이터 추가
    public void addAtHead(int data) {
        if (this.isEmpty()) {
            this.head = new Node(data, null, null);
            this.tail = this.head;
        } else {
            Node cur = this.head;

            this.head = new Node(data, null, cur);
            cur.prev = this.head;
        }
    }

    // Tail 측으로 데이터 추가
    public void addAtTail(int data) {
        if (this.isEmpty()) {
            this.tail = new Node(data, null, null);
            this.head = this.tail;
        } else {
            Node cur = this.tail;

            this.tail = new Node(data, cur, null);
            cur.next = this.tail;

        }
    }

    // 원하는 인덱스 번호의 데이터 추가
    public void addAtIndex(int data, int targetIdx) {
        int location = -1;

        if (this.isEmpty()) {
            this.head = new Node(data, null, null);
            this.tail = this.head;
        } else {
            Node cur = this.head;
            Node pre = cur;

            while (cur.next != null && location != targetIdx - 1) {
                pre = cur;
                cur = cur.next;
                location++;
            }

            pre.next = new Node(data, pre, pre.next);
            cur.prev = pre.next;
        }

    }

    // 원하는 인덱스 번호의 데이터 삭제
    public void removeIndex(int targetIdx) {
        int location = -1;

        if(this.isEmpty()){
            System.out.println("[Error] : The list is empty");
            return;
        } else {

            Node cur = this.head;
            Node pre = cur;

            while (cur.next != null && location != targetIdx - 1) {
                pre = cur;
                cur = cur.next;
                location++;
            }

            if(cur.next == null && cur.prev == null){
                this.tail = null;
                this.head = null;
            } else if(cur.next == null) {
                pre.next = null;
                this.tail = pre;
            } else {
                pre.next = cur.next;
                cur.next.prev = cur.prev;
            }
        }
    }


    public void showFromHead() {
        if (isEmpty()) {
            System.out.println("[Error] : The list is empty");
            return;
        }

        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void showFromTail() {
        if (isEmpty()) {
            System.out.println("[Error] : The list is empty");
            return;
        }

        Node cur = this.tail;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.prev;

        }
        System.out.println();
    }
}

public class MDoublyLinkedList {
    public static void main(String[] args) {
        MakeDoublyLinkedList dList = new MakeDoublyLinkedList();

        dList.addAtHead(5);
        dList.showFromHead();
        dList.showFromTail();

        dList.addAtHead(8);
        dList.showFromHead();
        dList.showFromTail();

        dList.addAtTail(3);
        dList.showFromHead();
        dList.showFromTail();

        dList.addAtIndex(1, 1);
        dList.showFromHead();
        dList.showFromTail();

        dList.removeIndex(1);
        dList.showFromHead();
        dList.showFromTail();

        dList.removeIndex(2);
        dList.showFromHead();
        dList.showFromTail();

        dList.removeIndex(1);
        dList.showFromHead();
        dList.showFromTail();

        dList.removeIndex(0);
        dList.showFromHead();
        dList.showFromTail();
    }
}