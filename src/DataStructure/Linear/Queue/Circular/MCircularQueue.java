package DataStructure.Linear.Queue.Circular;

class MakeCircularQueue {
    int[] queue;
    int front = 0;
    int rear = 0;

    MakeCircularQueue(int size) {
        this.queue = new int[size + 1];
    }

    public boolean isEmpty() {
        return this.front == this.rear;
    }

    public boolean isFull() {
        return (this.rear + 1) %  this.queue.length == this.front;
    }

    public void enQueue(int data) {
        if (this.isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        this.rear = (this.rear + 1) % this.queue.length;
        this.queue[this.rear] = data;
    }

    public Integer deQueue() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }

        this.front = (this.front + 1) % this.queue.length;
        return this.queue[this.front];
    }

    public void printQueue() {
        int start = (this.front + 1) % this.queue.length;
        int end = (this.rear + 1) % this.queue.length;

        for (int i = start; i != end; i = (i + 1) % this.queue.length) {
            System.out.print(this.queue[i] + " ");
        }
        System.out.println();
    }
}

public class MCircularQueue {
    public static void main(String[] args) {
        MakeCircularQueue mQueue = new MakeCircularQueue(5);

        mQueue.enQueue(1);
        mQueue.enQueue(2);
        mQueue.enQueue(3);
        mQueue.enQueue(4);
        mQueue.enQueue(5);

        mQueue.printQueue();

        mQueue.deQueue();
        mQueue.printQueue();

        mQueue.deQueue();
        mQueue.printQueue();


        mQueue.enQueue(6);
        mQueue.printQueue();

        mQueue.enQueue(7);
        mQueue.printQueue();

    }
}
