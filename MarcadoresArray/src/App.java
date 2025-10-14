import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int primero;
        int ultimo;
        int suma;
        
        int[][] arregloEntrada = { 
            {1},           // impar -> agrega 0
            {6,3,1},       // impar -> agrega 0
            {1,2,3,4},     // par   -> agrega (1+4)=5
            {0,5,3,0},     // par   -> agrega (0+0)=0
            {2,5,9},       // impar -> agrega 0
            {2,4,8,9,10}   // impar -> agrega 0};
        };

        int  ok[][]=new int[arregloEntrada.length][];

    for(int i=0; i<arregloEntrada.length;i++){
       
            if(arregloEntrada[i].length%2 == 0){

                ok[i] = Arrays.copyOf(arregloEntrada[i], arregloEntrada[i].length+1);

                primero= arregloEntrada[i][0];
                ultimo = arregloEntrada[i][arregloEntrada[i].length-1];
                suma = primero + ultimo;

                ok[i][ok[i].length-1] = suma;
           
            }else{
                ok[i] = Arrays.copyOf(arregloEntrada[i], arregloEntrada[i].length+1);//pondria ceros al resto
            }

    }

    
    for(int m = 0; m < ok.length; m++){
         System.out.println(Arrays.toString(ok[m]));
    }

    }
}
