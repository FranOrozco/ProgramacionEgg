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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un valor que esté entre 0 y 10.");
        Scanner leer = new Scanner(System.in);
        
        int num = leer.nextInt();
        
        while (num > 10 || num < 0){
            System.out.println("Ingrese por favor un número que esté entre 0 y 10");
            num = leer.nextInt();
            ;
        }
        if (num >= 0 && num <= 10){
            System.out.println("Ingresó un número válido.");
        }
    }
    
}
