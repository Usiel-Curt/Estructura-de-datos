public class SongList {
    private Node head;

    public void addSong(String nombre, int duracion){
        Node newNode = new Node(nombre, duracion);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
    public void removeSong(String nombre){
        if (head== null) {
            return;  
        }if (head.nombre==nombre) {
            head=head.next;
        }
           Node current = head;
           while (current.next != null && current.next.nombre != nombre) {
                current = current.next;
           }
           if (current.next != null) {
             current.next = current.next.next;
           }
           
    }

    public void printPlayList(){
        Node current = head;
        while (current != null) {
            System.out.println(current.nombre + "(" + current.duracion + "s)");
            current = current.next;
        }
    }

    public void getTotalDuration(){
        int duracion = 0;
        Node current = head;
        while (current != null) {
            duracion = duracion + current.duracion;
            current = current.next;
        }
        System.out.println("Duracion total: " + duracion +"s");
    }
}