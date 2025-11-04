public interface Queue <T>{
    T poll();
   void offer(T data);
   T peek();
   void print();
   boolean isEmpty();
   int size();
}
