package linear.LinkedList.Circular;

class Node {
    int data;
    Node prev;
    Node next;

    Node() {
    }

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

class MakeCircularLinkedList {
    Node head;
    Node tail;

    MakeCircularLinkedList() {
    }

    MakeCircularLinkedList(Node node) {
        this.head = node;
        this.tail = node;
        node.prev = this.head;
        node.next = this.head;
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    public void addData(int data, Integer beforeData) {
        if (this.head == null) {
            Node newNode = new Node(data, null, null);
            this.head = newNode;
            this.tail = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else if (beforeData == null) {
            Node newNode = new Node(data, this.head, this.tail);
            this.tail.next = newNode;
            this.head.prev = newNode;
            this.tail = newNode;
        } else {
            Node cur = this.head;
            Node pre = cur;
            do {
                if (cur.data == beforeData) {
                    if (cur == this.head) {
                        Node newNode = new Node(data, this.head, this.tail);
                        this.tail.next = newNode;
                        this.head.prev = newNode;
                        this.head = newNode;
                    } else {
                        Node newNode = new Node(data, cur, pre);
                        pre.next = newNode;
                        cur.prev = newNode;
                    }
                    break;
                }
                pre = cur;
                cur = cur.next;
            } while (cur != this.head);
        }
    }

    // 연결 리스트에서 특정 값을 가진 노드 삭제
    public void removeData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is Empty");
            return;
        }

        Node cur = this.head;
        Node pre = cur;

        while (cur != null) {
            if (cur.data == data) {
                if(cur == this.head && cur == this.tail) {
                    this.head = null;
                    this.tail = null;
                } else if ( cur == this.head){
                    cur.next.prev = this.head.prev;
                    this.head = cur.next;
                    this.tail.next = this.head;
                } else if ( cur == this.tail) {
                    pre.next = this.tail.next;
                    this.tail = pre;
                    this.head.prev = this.tail;
                } else {
                    pre.next = cur.next;
                    cur.next.prev = pre;
                }
                break;
            }

            pre = cur;
            cur = cur.next;
        }
    }

    public void showData() {
        if(this.isEmpty()){
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        while(cur.next != this.head){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println(cur.data);
    }
}

public class MCircularLinkedList {
    public static void main(String[] args) {
        MakeCircularLinkedList mList = new MakeCircularLinkedList(new Node(1, null, null));

        mList.addData(2, null);
        mList.addData(3, null);
        mList.addData(4, null);
        mList.addData(5, null);
        mList.showData();

        mList.addData(100, 1);
        mList.addData(200, 2);
        mList.addData(300, 3);
        mList.addData(400, 4);
        mList.addData(500, 5);
        mList.showData();

        mList.removeData(3);
        mList.showData();
        mList.removeData(200);
        mList.showData();
        mList.removeData(500);
        mList.showData();

    }
}
