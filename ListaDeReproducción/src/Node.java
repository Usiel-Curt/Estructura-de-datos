public class Node {
    int duracion;
    String nombre;
    Node next;
    public Node(String nombre, int duracion){
        this.nombre = nombre;
        this.duracion = duracion;
        next = null;
    }
}