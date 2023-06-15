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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre: ");
        Scanner leer = new Scanner(System.in);
        
        String nombre = leer.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = leer.nextInt();
        System.out.println("Su nombre es "+nombre+" y su edad es "+edad);
        
    }
    
}
