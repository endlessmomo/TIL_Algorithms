package linear.Deque;

import java.util.ArrayList;
import java.util.List;

class MakeDeque {
    List <Integer> list;

    MakeDeque() {
        this.list = new ArrayList <>();
    }

    public boolean isEmpty() {
        if (this.list.size() == 0) {
            return true;
        }
        return false;
    }

    public void addFirst(int data) {
        this.list.add(0, data);
    }

    public void addLast(int data) {
        this.list.add(data);
    }

    public Integer removeFirst() {
        if (this.isEmpty()) {
            System.out.println("Deque is empty!");
            return null;
        }

        int data = this.list.get(0);
        list.remove(0);
        return data;
    }

    public Integer removeLast() {
        if (this.isEmpty()) {
            System.out.println("Deque is empty!");
            return null;
        }

        int data = this.list.get(this.list.size() - 1);
        list.remove(this.list.size() - 1);
        return data;
    }

    public void printDeque() {
        System.out.println(list);
    }
}

public class MDeque {
    public static void main(String[] args) {
        MakeDeque mDeque = new MakeDeque();

        mDeque.addFirst(1);
        mDeque.addFirst(2);
        mDeque.addFirst(3);
        mDeque.addLast(4);
        mDeque.addLast(5);
        mDeque.addLast(6);

        mDeque.printDeque();

        mDeque.removeLast();
        mDeque.printDeque();

        mDeque.removeFirst();
        mDeque.printDeque();
    }
}
