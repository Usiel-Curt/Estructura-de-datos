public class ArrayQueue<T> implements Queue<T> {

    private Object[] data;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue() {
        this(10);
    }

    public ArrayQueue(int capacity) {
        data = new Object[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public void offer(T element) {
        if (size == data.length) {
            System.out.println("Queue llena");
            return;
        }
        data[rear] = element;
        rear = (rear + 1) % data.length;
        size++;
    }

    @Override
    public T poll() {
        if (isEmpty()) {
            System.out.println("La queue esta vacia");
            return null;
        }

        T value = (T) data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return value;  
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return (T) data[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[(front + i) % data.length] + " ");
        }
        System.out.println("]");
    }
    //metodo para invertir el orden de la cola
    public void reverse() {
        ArrayStack<T> stack = new ArrayStack<>(size);

        while (!isEmpty()) {
            stack.push(poll());
        }

        while (!stack.isEmpty()) {
            offer(stack.pop());
        }
    }
}