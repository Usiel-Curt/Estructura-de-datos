public class App {

    static int potencia(int num, int pot){
        if(pot == 0){
            return 1;
        }else {
            return num * potencia(num, pot-1);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(potencia(4, 4));
    }
}
