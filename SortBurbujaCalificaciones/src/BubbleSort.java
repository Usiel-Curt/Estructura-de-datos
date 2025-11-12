import java.util.Arrays;

public class BubbleSort {
    

    public void sort(int [] arr){
        int n = arr.length;
       boolean swapped = false;
        for (int u = 0; u < n-1; u++) {
            swapped = false;
            for (int s = 0; s < n-1-u; s++) {
                if (arr[s] > arr[s +1]) {
                    //se realiza el intercambio
                    int temp = arr[s];
                    arr[s] = arr[s+1]; //hace el intercarbio, pero tiene el mismo valor
                    arr[s + 1] = temp; // se pone el nuevo valor en la otra posicion
                    swapped = true;
                }
            } 
            if (!swapped) {
                break;
            }
        }
        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(arr));
    }

}