import java.util.Arrays;

public class ArrayStack<T> implements MyStack<T> {
   private Object[] data;
   private int top;

   public ArrayStack() {
      this(10);
   }

   public ArrayStack(int initialCapacity) {
      this.data = new Object[initialCapacity];
   }

   public void push(T value) {
      this.data[this.top++] = value;
   }

   public T pop() {
      if (this.isEmpty()) {
         System.out.println("No hay elementos en la stack");
         return null;
      } else {
          T value = (T) data[--top];
          data[top] = null;
         return value;
      }
   }

   public T peek() {
      if (this.isEmpty()) {
         System.out.println("La pila esta vacia no puedes obtener ningun elemnto");
      }

      return (T) this.data[this.top - 1];
   }

   public boolean isEmpty() {
      return this.top == 0;
   }

   public int size() {
      return this.top;
   }

   public void clear() {
      for(int u = this.data.length - 1; u >= 0; --u) {
         if (this.data[u] != null) {
            this.data[u] = null;
         }
      }

      System.out.println("Stack vacio");
   }

   public void addCpacity() {
      if (this.top == this.data.length) {
         int newCap = this.data.length * 2;
         this.data = Arrays.copyOf(this.data, newCap);
      }

   }

   public void printStack() {
      for(int u = this.data.length - 1; u >= 0; --u) {
         if (this.data[u] != null) {
            System.out.println(this.data[u]);
         }
      }

   }
}