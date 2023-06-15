/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Franco Orozco
 */
public class Ejercicio16 {

    /* 
    Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
    usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String auxiliar = null;
        int contador = 0;
        int pos = 0;
        System.out.println("Ingrese el tamaño que quiere para su vector: ");
        int tamanio = leer.nextInt();
        System.out.println("Ingrese el número que quiere verificar si está dentro del vector.");
        int num = leer.nextInt();

        int[] vector = new int[tamanio];

        // For para rellenar con aleatorios
        for (int i = 0; i < tamanio; i++) {
            int aleatorio = (int) (Math.random() * 10); // Así me va a dar números del 1 al 10. El int del principio es para truncar la parte decimal.

            vector[i] = aleatorio;
            if (vector[i] == num) {
                contador += +1;
            }
        }
        for (int elemento : vector) {
                auxiliar += " " + elemento;
                System.out.println(elemento);
        }
        System.out.println("El num " + num + " está en el vector " + contador + " vez/veces en la posición " + pos);
    }
}
