package structure.list;

public interface SelfList<T> {
    // 리스트의 크기를 반환하는 size(), 동적으로 배열을 변경하기 위한 newCapacity()
     int size();

    // add Method
     boolean add(T t);
     void add(int idx, T t);
     void addFirst(T t);

    T get(int idx);
    T set(int idx, T t);
    boolean contains(Object o);
    int indexOf(Object o);

    T remove(int idx);
    boolean remove(Object o);

    boolean isEmpty();
    void clear();
}
