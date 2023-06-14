package legacy.DataStructure.Linear.Stack;

import java.util.ArrayList;
import java.util.List;

class MakeStack {
    List<Integer> list;

    MakeStack() {
        this.list = new ArrayList<Integer>();
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
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        int data = (int) this.list.get(list.size() - 1);
        this.list.remove(list.size() - 1);
        return data;
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return (int) this.list.get(list.size() - 1);
    }

    public void printStack(){
        System.out.println(this.list);
    }
}

public class MStack {
    public static void main(String[] args) {
        MakeStack mStack = new MakeStack();

        mStack.isEmpty();
        mStack.push(1);
        mStack.push(2);
        mStack.push(3);
        mStack.push(4);
        mStack.push(5);
        mStack.printStack();

        System.out.println(mStack.peek());

        System.out.println(mStack.pop());
        System.out.println(mStack.pop());

        mStack.printStack();
    }
}
