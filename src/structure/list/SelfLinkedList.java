package structure.list;

import java.util.NoSuchElementException;

public class SelfLinkedList<E> implements SelfList<E> {
    private Node<E> head;

    private int size;
    SelfLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    private void addLast(E e) {
        if (this.head == null) {
            this.head = new Node<>(e);
            return;
        } else {
            Node<E> cur = this.head;

            while (cur.next != null) {
                cur = cur.next;
            }

            cur.next = new Node<>(e);
        }

        size++;
    }

    private Node<E> search(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> cur = this.head;
        for (int i = 0; i < idx; i++) {
            cur = cur.next;
        }

        return cur;
    }

    // n번째 인덱스의 노드가 무엇인지가 선행되어야 한다.

    @Override
    public void add(int idx, E e) {
        Node<E> prevNode = search(idx - 1);

        Node<E> nextNode = prevNode.next;
        prevNode.next = new Node<>(e);
        prevNode.next.next = nextNode;
        size++;
    }
    @Override
    public void addFirst(E e) {
        Node<E> prev = this.head;
        this.head = new Node<>(e);
        this.head.next = prev;
    }

    @Override
    public E get(int idx) {
        return search(idx).data;
    }

    @Override
    public E set(int idx, E e) {
        Node<E> target = search(idx);
        E oldValue = target.data;
        target.data = e;

        return oldValue;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public int indexOf(Object o) {
        Node<E> cur = this.head;

        int i = 0;
        while (cur != null) {
            if (o.equals(cur.data)) {
                return i;
            }
            cur = cur.next;
            i++;
        }
        return -1;
    }

    public E remove() {
        if (this.head == null) {
            throw new NoSuchElementException();
        }

        Node<E> origin = this.head;
        Node<E> headNext = this.head.next;
        head.next = null;

        this.head = headNext;

        return origin.data;
    }

    @Override
    public E remove(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (idx == 0) {
            return remove();
        }

        Node<E> prev = search(idx - 1);
        Node<E> removed = prev.next;
        Node<E> next = removed.next;

        // 앞 노드와 다음 노드를 연결
        prev.next = next;

        // 기존 노드 삭제
        E removedData = removed.data;
        removed.data = null;
        removed.next = null;
        size--;

        return removedData;
    }

    @Override
    public boolean remove(Object o) {
        Node<E> cur = this.head;
        Node<E> prev = null;

        for (; cur != null; cur = cur.next) {
            if (o.equals(cur.data)) {
                break;
            }
            prev = cur;
        }

        // 해당하는 target이 존재하지 않는 경우
        if (cur == null) {
            return false;
        }

        // 가장 첫번째 노드가 target인 경우
        if (cur.equals(this.head)) {
            remove();
        } else {
            prev.next = cur.next;
            cur.data = null;
            cur.next = null;
            size--;
        }

        return true;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void clear() {
        Node<E> cur = this.head;

        while (cur != null) {
            Node<E> next = cur.next;
            cur.data = null;
            cur.next = null;
            cur = next;
        }
        this.size = 0;
    }

    public void printList() {
        Node<E> cur = this.head;

        int i = 0;
        while (cur != null) {
            System.out.println(i++ + "번재 인덱스 : " + cur.data);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        SelfLinkedList<String> linkedList = new SelfLinkedList<>();

        linkedList.add("안");
        linkedList.add("녕");
        linkedList.add("세");
        linkedList.add(2, "하");
        linkedList.addFirst("좋은 아침입니다.");
        linkedList.printList();

        System.out.println(linkedList.contains("s"));
        System.out.println(linkedList.contains("하"));

        System.out.println(linkedList.remove());
        linkedList.printList();

        System.out.println(linkedList.remove(2));
        linkedList.remove("세");
        linkedList.printList();
    }
}
