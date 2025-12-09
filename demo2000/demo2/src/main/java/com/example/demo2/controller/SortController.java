package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.RequestCadena;
import com.example.demo2.dto.ErrorResponse;
import com.example.demo2.service.SortService;


@RestController //Configuracion del controlador (por tag)
@RequestMapping("/api/sort")//configuracion del endpoint de la API
public class SortController {
      @Autowired
        SortService service;

     @PostMapping("/burbuja")
     public ResponseEntity<?> bubbleSort(@RequestBody RequestCadena request) {
        try{
            if (request== null || request.getCadena().isBlank()) {
            ErrorResponse error = new ErrorResponse();
            error.setError("Peticion incorrecta");
            error.setDetail("La cadena no puede estar vacia");
            return ResponseEntity.badRequest().body(error);
        }
        String [] partes = request.getCadena().split(",");//recibimos el string y lo convertimos en 
        int [] numeros = new int [partes.length];//declaracion de el arreglo numeros
        for (int i = 0; i < partes.length; i++) {
           try{
            numeros[i] = Integer.parseInt(partes[i]);

           }catch(IllegalArgumentException e){
                ErrorResponse error = new ErrorResponse();
                error.setError("Dato incorrecto, tiene que ser numerico: "+numeros[i]);
                error.setDetail(e.getMessage());
                return ResponseEntity.badRequest().body(error);
           }
            
        }

        return ResponseEntity.ok(service.bubbleSort(numeros));
        
            
        }catch(Exception e){
            ErrorResponse error = new ErrorResponse();
            error.setError("Error interno del servidor");
            error.setDetail(e.getMessage());
            return ResponseEntity.internalServerError().body(error);

        }
    }
    

    @PostMapping("/insertion")
     public ResponseEntity<?> insertionSort(@RequestBody RequestCadena request) {
        try{
            if (request== null || request.getCadena().isBlank()) {
            ErrorResponse error = new ErrorResponse();
            error.setError("Peticion incorrecta");
            error.setDetail("La cadena no puede estar vacia");
            return ResponseEntity.badRequest().body(error);
        }
        String [] partes = request.getCadena().split(",");//recibimos el string y lo convertimos en 
        int [] numeros = new int [partes.length];//declaracion de el arreglo numeros
        for (int i = 0; i < partes.length; i++) {
           try{
            numeros[i] = Integer.parseInt(partes[i]);

           }catch(IllegalArgumentException e){
                ErrorResponse error = new ErrorResponse();
                error.setError("Dato incorrecto, tiene que ser numerico: "+numeros[i]);
                error.setDetail(e.getMessage());
                return ResponseEntity.badRequest().body(error);
           }
            
        }

        return ResponseEntity.ok(service.insertionSort(numeros));
        
            
        }catch(Exception e){
            ErrorResponse error = new ErrorResponse();
            error.setError("Error interno del servidor");
            error.setDetail(e.getMessage());
            return ResponseEntity.internalServerError().body(error);

        }
    }


    @PostMapping("/selection")
     public ResponseEntity<?> selectionSort(@RequestBody RequestCadena request) {
        try{
            if (request== null || request.getCadena().isBlank()) {
            ErrorResponse error = new ErrorResponse();
            error.setError("Peticion incorrecta");
            error.setDetail("La cadena no puede estar vacia");
            return ResponseEntity.badRequest().body(error);
        }
        String [] partes = request.getCadena().split(",");//recibimos el string y lo convertimos en 
        int [] numeros = new int [partes.length];//declaracion de el arreglo numeros
        for (int i = 0; i < partes.length; i++) {
           try{
            numeros[i] = Integer.parseInt(partes[i]);

           }catch(IllegalArgumentException e){
                ErrorResponse error = new ErrorResponse();
                error.setError("Dato incorrecto, tiene que ser numerico: "+numeros[i]);
                error.setDetail(e.getMessage());
                return ResponseEntity.badRequest().body(error);
           }
            
        }

        return ResponseEntity.ok(service.selectionSort(numeros));
        
            
        }catch(Exception e){
            ErrorResponse error = new ErrorResponse();
            error.setError("Error interno del servidor");
            error.setDetail(e.getMessage());
            return ResponseEntity.internalServerError().body(error);

        }
    }
    
}