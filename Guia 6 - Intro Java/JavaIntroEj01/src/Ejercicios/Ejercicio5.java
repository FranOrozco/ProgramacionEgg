/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Franco Orozco
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Escribir un programa que lea un número entero por teclado y muestre por pantalla el
    doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero = leer.nextInt();
        int doble = numero * 2;
        int triple = numero * 3;
        double raiz = sqrt(numero);
        
        System.out.println("El número que ingresó es: " + numero);
        System.out.println("Su doble es: " + doble);
        System.out.println("Su triple es: " + triple);
        System.out.println("Su raíz cuadrada es: " + raiz);
    }
    
}
