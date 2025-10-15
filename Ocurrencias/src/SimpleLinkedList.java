public class SimpleLinkedList {
    private Node head;

    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null){
           current = current.next;
        }

        current.next = newNode;
 
    }

    public boolean contains(int data){

        Node current = head;

        while (current != null) {
            if(current.data == data) return true;
            current = current.next;
        }

        return false;
    }

    public void remove(int data){
        if(head == null){
            return;
        }if(head.data == data){
            head = head.next;
        }
            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }
            if(current.next != null){
                current.next = current.next.next;
            }
    }

    public void mostrar(){
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("Null");
    }

    public void buscar(int num){
        Node current = head;
        int contador = 0;
        while (current != null) {
            if(current.data == num){
                contador++;
            }
            current = current.next;
        }
        System.out.println("Las veces que se encontro el numero " + num  + " fueron: " + contador);
    }
}
