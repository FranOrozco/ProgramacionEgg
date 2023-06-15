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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese dos números. Si uno o ambos son mayores que 25, el programa se lo va a confirmar."); 
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número 1: ");
        int n1 = leer.nextInt();
        System.out.print("Ingrese el número 2: ");
        int n2 = leer.nextInt();
        
        if ((n1 >= 25) || (n2 >= 25)){
            System.out.println("Uno de los dos números que ingresó o ambos son mayor que 25.");
        }
    }
    
}
