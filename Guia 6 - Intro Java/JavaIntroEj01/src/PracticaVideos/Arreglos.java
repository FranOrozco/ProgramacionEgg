/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaVideos;

import java.util.Scanner;

/**
 *
 * @author Franco Orozco
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    /* 
    Declaración y Creación de un vector:
    tipo [] nombreVector = new tipo[tamañoVector]
    */
    
    // Declarar un arreglo de una sola dimensión
    int [] vector;
    
    // Crear en memoria (construir, dimensionar) con el valor por defecto (cero para los enteros)
    vector = new int [2];
       
    // Los dos pasos en una línea
    int [] producto = new int[3];
    
    /* 
    Declaración y Creación de una matriz:
    tipo [][] nombreMatriz = new tipo[filas][columnas]
    */
    
    // Declaración e iniciación con valores predeterminados:
    
    int[][] matriz = {{4, 8, 6}, {2, 1, 7}};

    // Declaración y creación de arreglos genéricos:
    // tipo [][] ... [] nombreArreglo = new tipo [cardinalidad 1][cardinalidad 2]...[cardinalidad n];

        System.out.println("Ingrese los valores del vector de tamaño 2");
        Scanner leer = new Scanner(System.in);
        
     // int = 0, porque los subíndices de los arreglos en Java inician en cero
     for (int i = 0; i < vector.length; i++){
         System.out.println("Ingrese el valor que se va a guardar en la posición [" + i + "]=");
         // Acceder al valor i del vector:
         vector[i] = leer.nextInt();
     
     }
     // Multiplica vector por Matriz:
     int sum; 
     // ... para cada columna de la matriz...
     for (int j = 0; j < matriz[0].length; j++){
     sum = 0;
        // ... recorro el vector y multiplico 
        for (int i = 0; i < vector.length; i++){
            sum += vector[i] * matriz[i][j];
        }
        producto[j] = sum;
     }
     
     String aux = "";
     
     // Mostrar vector
     System.out.println("  ∗ Vector:");
        
     // Bucle for "mejorado" (enhanced)
     /// for (tipo elemento : arreglo)
     for (int elemento: vector){
         aux += "  " + elemento;
     }
     System.out.println(aux);
     
     // Mostrar matriz
        System.out.println("\n ∗ Matriz:");
     // Para cada fila de la matriz
    for (int[] fila : matriz){
         aux = "";
         // Para cada elemento de la fila
         for (int elemento : fila){
             aux += "  " + elemento;
         }
         System.out.println(aux);
     }
     // Mostrar resultado 
     aux = "";
    System.out.println("\n ∗ Vector x Matriz = ");
     for (int elemento : producto){
         aux += "  " + elemento; 
     }
    System.out.println(aux);
    }}

    
