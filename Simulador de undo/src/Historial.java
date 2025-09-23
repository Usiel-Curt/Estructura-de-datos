import java.util.Stack;

public class Historial {

    protected Stack<String> acciones;
    protected Stack<String> deshacer;

    public Historial() {
        this.acciones = new Stack<>();
        this.deshacer = new Stack<>();
    }

    public void hacer(String accion){
        acciones.push(accion);
    }

    public void deshacer(){
        deshacer.push(acciones.peek());
        acciones.pop();
    }

    public void rehacer(){
        acciones.push(deshacer.peek());
        deshacer.pop();
    }

    public void mostrar(){
        System.out.println(acciones);
    }
}