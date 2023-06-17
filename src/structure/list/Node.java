package structure.list;

public class Node<E> {
    Node<E> next;
    E data;

    Node(E data) {
        this.data = data;
        this.next = null;
    }
}
