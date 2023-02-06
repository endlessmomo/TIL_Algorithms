package Data_Structure.Linear.Deque;

class MakeDeque2 {
    int[] deque;
    int front = 0;
    int rear = 0;

    MakeDeque2(int size) {
        deque = new int[size + 1];
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public boolean isFull() {
        return (this.rear + 1) % this.deque.length == this.front;
    }

    public void addFirst(int data) {
        if (this.isFull()) {
            System.out.println("Deque is full!");
            return;
        }
        this.deque[this.front] = data;
        this.front = (this.front - 1 + this.deque.length) % this.deque.length;
    }

    public void addLast(int data) {
        if (this.isFull()) {
            System.out.println("Deque is full!");
            return;
        }
        this.rear = (this.rear + 1) % this.deque.length;
        this.deque[this.rear] = data;
    }

    public Integer removeFirst() {
        if (this.isEmpty()) {
            System.out.println("Deque is empty!");
            return null;
        }

        this.front = (this.front + 1) % this.deque.length;
        return this.deque[this.front];
    }
    public Integer removeLast() {
        if (this.isEmpty()) {
            System.out.println("Deque is empty!");
            return null;
        }

        int data = this.deque[this.rear];
        this.rear = (this.rear - 1 + this.deque.length) % this.deque.length;
        return data;
    }

    public void printDeque() {
        int start = (this.front + 1) % this.deque.length;
        int end = (this.rear + 1) % this.deque.length;

        for (int i = start; i != end; i = (i + 1) % this.deque.length) {
            System.out.print(this.deque[i] + " ");
        }
        System.out.println();
    }
}

public class MDeque2 {
    public static void main(String[] args) {
        MakeDeque2 mDeque = new MakeDeque2(5);

        mDeque.addFirst(1);
        mDeque.addFirst(2);
        mDeque.addLast(3);
        mDeque.printDeque();

        mDeque.addLast(4);
        mDeque.printDeque();
        mDeque.addLast(5);
        mDeque.printDeque();


        mDeque.removeFirst();
        mDeque.printDeque();

        mDeque.removeLast();
        mDeque.printDeque();
    }
}
