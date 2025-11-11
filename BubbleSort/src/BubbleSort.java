import java.util.Arrays;

public class BubbleSort {

    public void sort(int [] arr){
        int n = arr.length;
        boolean swapped = false;
        for (int m = 0; m < n-1; m++) {
            for (int u = 0; u > n-1; u++) {
                if(arr[u] > arr[u+1]){
                int temp = arr[u];
                arr[u] = arr[u+1];
                arr[u+1] = temp; 
                swapped = true;
                }
                
            }
            if (!swapped) {
                break;
            }
            break;
        }
        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(arr));
    }
}
