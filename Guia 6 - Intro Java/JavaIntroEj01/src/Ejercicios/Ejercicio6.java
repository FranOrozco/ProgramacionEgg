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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Crear un programa que dado un numero determine si es par o impar.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número y el programa dirá si este es par o impar.");
        int num = leer.nextInt();
        if (num % 2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        
    }
    
}
