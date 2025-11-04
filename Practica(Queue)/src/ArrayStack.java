import java.util.Arrays;

public class ArrayStack<T> implements MyStack<T> {

    private Object[] data;
    private int top;

    public ArrayStack() {
        this(10);
    }

    public ArrayStack(int capacity) {
        data = new Object[capacity];
        top = 0;
    }

    @Override
    public void push(T value) {
        ensureCapacity();
        data[top++] = value;
    }

    @Override
    public T pop() {
        if (isEmpty()) return null;
        T value = (T) data[--top];
        data[top] = null;
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()) return null;
        return (T) data[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    private void ensureCapacity() {
        if (top == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
    }

    @Override
    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }
}