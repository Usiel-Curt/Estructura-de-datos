
public class App {
    public static void main(String[] args) throws Exception {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.mostrar();

        list.buscar(4);
        
    }
}
