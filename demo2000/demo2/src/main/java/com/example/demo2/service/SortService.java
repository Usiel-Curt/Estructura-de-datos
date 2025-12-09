package com.example.demo2.service;

import org.springframework.stereotype.Service;

@Service
public class SortService{
    //BubbleSort+++
    public int [] bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped=false;
        //Condicionamos con un for para que no se desborde que recorrra el arreglo
        for (int i = 0; i < n-1; i++) {
            swapped=false;
            //Con un for recorremos el arreglo y con el otro ordenamos todos
            //Esta vez que sea menor a i ya que ahora i tendra un valor despues de haberse recorrido n veces
            for (int j = 0; j < n-1-i; j++) {
                //Evalua si el valor actual es menor al que sigue
                if(arr[j] > arr[j+1]){
                    //Se realiza el intercambio, pasamos el valor original a una variable temporal
                    int temp=arr[j];
                    //La posición actual equivale a la siguiente
                    arr[j]=arr[j+1];
                    //La posición siguiente vale la posición original guardada en la variable temporal
                    arr[j+1]=temp;
                    swapped=true;
                }

            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }

    //InsertionSort

   public int [] insertionSort(int[] arr) {
      int n = arr.length;

      for(int u = 1; u < n; ++u) {
         int key = arr[u];

         int s;
         for(s = u - 1; s >= 0 && arr[s] > key; --s) {
            arr[s + 1] = arr[s];
         }

         arr[s + 1] = key;
      }

      return arr;
   }
   //SelectionSort

   public int [] selectionSort(int [] arr){
        int n = arr.length;
        int minIndex;
        for (int i = 0; i <n-1; i++) {//Recorremos el arreglo, evitando el desbordamiento
            minIndex = i; //Suponemos que ell minimo es el primero
            for (int j = i+1; j <n; j++) {
                if (arr[j] < arr [minIndex]) {
                    minIndex = j; //Seleccionamos el indice ddel elemento menor
                }
            }
            int temp = arr[minIndex]; //Guardamos el valor del minimo
            arr[minIndex]=arr[i]; //Intercambio, mandamos el valor del actual a la posicion 
            arr[i] = temp;//en la posicion actual, guarddamos el temporal
        }
        return arr;
    }
}
