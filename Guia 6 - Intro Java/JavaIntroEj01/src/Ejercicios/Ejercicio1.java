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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    
    /* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
       El programa deberá después mostrar el resultado de la suma*/
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Definimos las dos variables:
        System.out.println("Ingrese el valor que quiere guardar en la variable 1");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el valor que quiere guardar en la variable 2");
        int numero2 = leer.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma de los dos valores ingresados es: " + suma);
    }
    
}
