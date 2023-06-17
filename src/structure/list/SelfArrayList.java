package structure.list;


import java.util.*;

public class SelfArrayList<E> implements SelfList<E> {
    private static final Object[] EMPTY_ELEMENT = {};

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;
    public SelfArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public SelfArrayList(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    public void newCapacity() {
        int cur_capacity = array.length;

        if (size == cur_capacity) {
            array = Arrays.copyOf(array, cur_capacity * 2);
            return;
        }

        if (size < (cur_capacity / 2)) {
            array = Arrays.copyOf(array, Math.max(cur_capacity / 2, DEFAULT_CAPACITY));
            return;
        }
    }

    @Override
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    private void addLast(E e) {
        if (size == array.length) {
            newCapacity();
        }
        array[size++] = e;
    }

    @Override
    public void add(int idx, E e) {
        checkBounds(idx);

        if (idx == size) {
            addLast(e);
        } else {
            if (size == array.length) {
                newCapacity();
            }

            for (int i = size; i > idx; i--) {
                array[i] = array[i - 1];
            }

            array[idx] = e;
            size++;
        }
    }

    private void checkBounds(int idx) {
        if (idx < 0 && idx >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void addFirst(E e) {
        add(0, e);
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int idx) {
        checkBounds(idx);
        return (E) array[idx];
    }

    @Override
    @SuppressWarnings("unchecked")
    public E set(int idx, E e) {
        checkBounds(idx);
        E oldValue = (E) array[idx];
        array[idx] = e;

        System.out.println("prev value : " + oldValue + ", cur value : " + e);
        return oldValue;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E remove(int idx) {
        checkBounds(idx);

        E deleteElement = (E) array[idx];
        for (int i = idx; i < size; i++) {
            array[idx] = array[idx + 1];
        }
        array[size--] = null;
        newCapacity();

        return deleteElement;
    }

    @Override
    public boolean remove(Object o) {
        int idx = indexOf(o);

        if (idx == -1) {
            return false;
        }

        remove(idx);
        return true;
    }

    @Override
    public String toString() {
        return "SelfArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        Arrays.fill(array, null);
        newCapacity();
        this.size = 0;
    }
    public static void main(String[] args) {
        SelfArrayList<String> arr = new SelfArrayList<>();

        arr.add("녕");
        arr.add("하");
        arr.add("하");
        arr.add("요");
        System.out.println(arr.toString());

        arr.addFirst("안");
        System.out.println(arr.toString());

        arr.get(0);

        arr.set(3, "세");
        System.out.println(arr.toString());

        arr.remove(4);
        System.out.println(arr.toString());

        System.out.println(arr.isEmpty());
        arr.clear();
        System.out.println(arr);
    }
}