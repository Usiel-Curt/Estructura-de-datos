import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BubbleSort sort = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        int[] calificaciones;
        
        int numCalificaciones;

        System.out.println("Ingresa el numero de calificaciones: ");
        numCalificaciones = sc.nextInt();
        calificaciones = new int[numCalificaciones];

        for(int m = 0; m < calificaciones.length; m++){
            System.out.println("Ingresa una calificacion "+ (m+1) +": ");
            calificaciones[m] = sc.nextInt();
        }
        sort.sort(calificaciones);
    }
}
