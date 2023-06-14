package legacy.DataStructure.Linear.Queue.Basic;

import java.util.ArrayList;
import java.util.List;

class MakeQueue {
    List list;

    MakeQueue() {
        this.list = new ArrayList();
    }

    public boolean isEmpty() {
        if (this.list.size() == 0) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        this.list.add(data);
    }

    public Integer pop() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }

        int data = (int) this.list.get(0);
        this.list.remove(0);
        return data;
    }

    public Integer peek() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }

        return (int) this.list.get(0);
    }

    public void printQueue() {
        System.out.println(list);
    }
}

public class MQueue {
    public static void main(String[] args) {
        MakeQueue mQueue = new MakeQueue();
    }
}
