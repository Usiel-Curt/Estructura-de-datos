public interface QueueI<T> {
    T poll();
    void offer(T element);
    T peek();
    void print();
    boolean isEmpty();
    int size();

}
