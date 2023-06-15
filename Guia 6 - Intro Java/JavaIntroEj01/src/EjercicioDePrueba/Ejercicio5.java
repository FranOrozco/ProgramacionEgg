/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioDePrueba;

import java.util.Scanner;

/**
 *
 * @author Franco Orozco
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor de verdad:");
        boolean verdadero = leer.nextBoolean();
        System.out.println("Ingrese un número real");
        double real = leer.nextDouble();
        System.out.println("Ingrese un carácter");
        String caracter = leer.next();
        
        System.out.println(verdadero + " " + real + " " + caracter);
         
    }
    
}
