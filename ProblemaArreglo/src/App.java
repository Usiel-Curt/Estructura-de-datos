public class App {
    public static void main(String[] args) throws Exception {
    int[][] arrExample={
        {2,5,0,1},
        {5,1,9,5},
        {9,5,2,8},
        {4,0,0,4},
        {7,5,1,2}
    };

    int resul = 0;
    
    for(int m=0; m < arrExample.length; m++){
        for(int u=0; u < arrExample.length-1; u++){
            resul = resul + arrExample[m][u];
        }
    }


    System.out.println("La suma de todo es: " + resul);

    }
}
