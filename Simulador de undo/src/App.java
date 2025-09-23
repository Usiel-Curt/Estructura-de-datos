public class App {
    public static void main(String[] args) throws Exception {
        Historial m = new Historial();

        m.hacer("Escribir hola");
        m.hacer("Borrar palabra");
        m.hacer("Escribir mundo");

        m.deshacer();       
        m.deshacer();

        m.rehacer();

        m.mostrar();
    }
}