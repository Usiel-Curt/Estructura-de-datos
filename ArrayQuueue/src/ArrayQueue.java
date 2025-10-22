public class ArrayQueue<T> implements QueueI<T>{

    private Object[] data;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(){
        this(10);
    }

    public ArrayQueue(int size){
        this.data = new Object[size];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    @Override
    public T poll() {
        
        T resultado = (T) data[front];
        data[front] = null;
        front = (front + 1)%data.length;
        size--;
        return null;
    }

    @Override
    public void offer(T element) {
        //Validar si el arreglo esta lleno, aumentar tamaño
        this.data[rear] = element;
        this.rear = (rear + 1)%data.length;
        size++;

    }

    @Override
    public T peek() {
        if(isEmpty()){
            System.out.println("La queue esta vacia.");
            return null;
        }

        return (T) data[front];
    }

    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int m = 0; m < size; m++){
            sb.append(data[(front + m)%data.length]);
            sb.append("->");
        }
        sb.append("]");
        System.out.println(sb.toString());

    }

    @Override
    public boolean isEmpty() {
        return size==0;
        
    }
 
    @Override
    public int size() {
        return this.size;
    }

}
