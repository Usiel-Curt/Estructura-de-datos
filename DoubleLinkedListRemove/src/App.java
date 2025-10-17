public class App {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList doubleList = new DoubleLinkedList();

        doubleList.printForward();

        doubleList.add(1);
        doubleList.add(2);
        doubleList.add(3);
        doubleList.add(4);
        doubleList.add(6);
        doubleList.add(5);

        doubleList.printForward();
        System.out.println("----------------------");

        doubleList.remove(1);
        doubleList.remove(3);    
        doubleList.remove(5);

        doubleList.printBackward();
        doubleList.printForward();

    }
}