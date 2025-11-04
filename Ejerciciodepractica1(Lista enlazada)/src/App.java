public class App {
    public static void main(String[] args) throws Exception {
    SinglyLinkedList list = new SinglyLinkedList();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    System.out.println("-----------Lista Original-----------");
    list.printList();
     System.out.println("-----------Pares-----------");
    list.Pares();
     System.out.println("-----------Impares-----------");
    list.Impares();
    }
}
