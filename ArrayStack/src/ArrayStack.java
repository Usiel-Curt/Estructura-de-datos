import java.util.Arrays;

public class ArrayStack<T> implements MyStack<T> {

    private Object[] data;
    private int top;

    public ArrayStack(){
        this(10);
    }

    public ArrayStack(int initialCapacity){
        this.data = new Object[initialCapacity];
    }

    @Override
    public void push(T value) {
        this.data[top++] = value;
    }

    @Override
    public T pop() {
        if(isEmpty()){
            System.out.println("No hay elementos en la stack");
            return null;
        }
        T value = (T) data[--top];
        data[top] = null;
        return value;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            System.out.println("La pila esta vacia, no puedes obtener ningun elemento.");
            return null;
        }
        return (T) data[top];
    }

    @Override
    public boolean isEmpty() {
        if(top==0){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public void clear() {
        
    }

    public void addCapacity(){
        if(top == data.length){
            int newCap = data.length*2;
            data = Arrays.copyOf(data, newCap); 
        }
    }

    @Override
    public void printStack() {

        for(int i = data.length-1; i >= 0; i--){
            if (data[i] != null) {
               System.out.println(data[i]); 
            }
        }
        
    }

}
