package legacy.DataStructure.Linear.LinkedList.Singly;

class Node {
    int data;
    Node next;

    Node() {
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class MakeSinglyLinkedList {
    Node head;

    MakeSinglyLinkedList() {
    }

    MakeSinglyLinkedList(Node node) {
        this.head = node;
    }

    // 연결 리스트 비어있는지 확인
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    // 연결 리스트의 맨 뒤에 데이터를 추가
    public void addData(int data) {
        if (this.head == null) {
            this.head = new Node(data, null);
        } else {
            Node cur = this.head;

            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        }
    }

    // 원하는 인덱스에 데이터를 추가
    public void addData(int idx, int data) {
        int location = -1;

        if (this.head == null) {
            this.head = new Node(data, null);
        } else {
            Node cur = this.head;
            Node prev = cur;

            while (cur.next != null && location != idx - 1) {
                prev = cur;
                cur = cur.next;
                location++;
            }

            if (idx == 0) {
                this.head = new Node(data, cur);
            } else {
                prev.next = new Node(data, cur);
            }
        }
    }

    // 연결 리스트의 맨 뒤의 데이터를 삭제
    public void deleteData() {
        if (this.isEmpty()) {
            System.out.println("[Error] : Linked-List is Empty");
        } else {
            Node cur = this.head;
            Node prev = cur;

            while (cur.next != null) {
                prev = cur;
                cur = cur.next;
            }

            if (cur == this.head) {
                this.head = null;
            } else {
                prev.next = null;
            }
        }
    }

    // 타겟 데이터를 삭제하기
    public void deleteData(int targetIdx) {
        if (this.isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }

        boolean isDelete = false;
        int location = -1;

        Node cur = this.head;
        Node prev = cur;

        while (cur.next != null && location != targetIdx - 1) {
            prev = cur;
            cur = cur.next;
            location++;
        }

        if (targetIdx == 0 && this.head.next == null) {
            this.head = null;
        } else if (targetIdx == 0 && this.head.next != null) {
            this.head = this.head.next;
        } else {
            prev.next = cur.next;
        }
    }

    /*
     * 원하는 데이터 값의 존재 여부 확인
     * 해당 데이터가 존재하면 해당 데이터의 인덱스 번호 반환
     * 해당 데이터가 존재하지 않으면 -1을 반환
     * */
    public void findFirstTarget(int data) {
        int targetIdx = -1;
        if (this.isEmpty()) {
            System.out.println("[Error] : Linked-List is Empty");
        }

        Node cur = this.head;

        while (cur != null) {
            targetIdx++;
            if (cur.data == data) {
                System.out.printf("데이터가 %d번째 인덱스에 존재합니다.\n", targetIdx);
                return;
            }
            cur = cur.next;
        }
        System.out.println("데이터가 리스트에 존재하지 않습니다.");
    }

    // 연결 리스트의 모든 데이터 출력
    public void showList() {
        if (this.isEmpty()) {
            System.out.println("[Error] : Linked-List is Empty");
        }

        Node cur = this.head;

        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}


public class MSinglyLinkedList {
    public static void main(String[] args) {
        MakeSinglyLinkedList list = new MakeSinglyLinkedList();

        list.addData(1);
        list.showList();
        list.addData(2);
        list.showList();
        list.addData(3);
        list.showList();
        list.addData(4);
        list.showList();

        list.addData(0, 100);
        list.showList();

        list.findFirstTarget(3);
        list.findFirstTarget(5);
        list.deleteData();
        list.showList();

        list.deleteData(2);
        list.showList();
        list.deleteData(0);
        list.showList();
    }
}
