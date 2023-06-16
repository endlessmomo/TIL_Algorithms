package structure.list;

public interface SelfList<T> {
    // 리스트의 크기를 반환하는 size(), 동적으로 배열을 변경하기 위한 newCapacity()
     int size();
     void newCapacity();

    // add Method
     boolean add(T t);
     void add(int idx, T t);
     void addFirst(T t);

    T get(int idx);
    T set(int idx, T t);
    boolean contains(T t);
    int indexOf(T t);

    T remove(int idx);
    boolean remove(T t);

    boolean isEmpty();
    void clear();
}
