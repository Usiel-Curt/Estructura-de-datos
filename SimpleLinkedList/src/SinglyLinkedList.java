public class SinglyLinkedList {
    private Node head;

    public void add(int data){
        //creación de un nodo
        Node newNode = new Node(data);
        //Verificando si la lista esta vacia, entonces el nuevo nodo es el head
        if(head == null){
            head = newNode;
            return;
        }
        //En caso de que no este vacia la lista
        //vamos a recorrer todos los nodos hasta encontrar la referecia (next) en null
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        //se agrega el nuevo nodo en la referencia del ultimo nodo
        current.next = newNode;
    }
    
    public boolean contains(int data){

        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void remove(int data){
        if (head== null) {
            return;  
        }if (head.data==data) {
            head=head.next;
        }
           Node current = head;
           while (current.next != null && current.next.data != data) {
                current = current.next;
           }
           if (current.next != null) {
             current.next = current.next.next;
           }
           
    }
    public void printList(){
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("null");
    }

}