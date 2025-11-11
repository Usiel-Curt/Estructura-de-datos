import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] arr){
        int n = arr.length;
        int mainIndex;
        for (int i = 0; i < n-1; i++) {
            mainIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[mainIndex]) {
                    mainIndex = j;
                }
            }
            int temp = arr[mainIndex];
            arr[mainIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(arr));
    }
}
