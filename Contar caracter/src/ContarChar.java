public class ContarChar {
    public ContarChar(){}

    public static int contar(String texto, char objetivo){

        if(objetivo == texto.charAt(texto.length()-1)){
            return 1;
        }

        return 1 + contar(texto.substring(0, texto.length()-1), objetivo);
    }

    

}
