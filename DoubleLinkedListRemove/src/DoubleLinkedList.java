public class DoubleLinkedList {
    Node head;
    
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void printForward(){
        if(head == null){
            System.out.println("La lista está vacia");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;

        }

        System.out.println("Null");

    }

    public void printBackward(){
        if(head == null){
            System.out.println("La lista está vacia");
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;

        }

        while (current != null) {
            System.out.println(current.data);
            current = current.prev;

        }

        System.out.println("Null");

    } 

    public void remove(int data){
         if (head== null) {
            return;  
        }if (head.data==data) {
            head=head.next;
            head.prev = null;
        }
           Node current = head;
           while (current.next != null && current.next.data != data) {
                current = current.next;
        }
        if (current.next != null) {
            if (current.next.next != null) {
                current.next.next.prev = current;
            }
             current.next = current.next.next;
           }
    }

}