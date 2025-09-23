public class App {

    public static void cadena(String cade, int tam){
        if(tam == 0){
            System.out.println(cade.charAt(tam));
            return;
        }
        System.out.println(cade.charAt(tam));
        cadena(cade, tam-1);
    }

    public static void main(String[] args) throws Exception {
        String cade = "Hola";
        int tem = cade.length() - 1;
        cadena(cade, tem);
    }
}
