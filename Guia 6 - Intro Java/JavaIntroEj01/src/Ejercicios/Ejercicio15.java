
package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    /* 
    Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
    muestre por pantalla en orden descendente.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vector = new int [100];
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;            
        }
        System.out.println("Los primeros 100 enteros escritos de forma descendente son: ");
        for (int i = 100; i > 0; i--) {
            if(i > 1){
                System.out.print(i + ", ");            
            } else {
                System.out.print(i + ".");
            }
        }
    }
    
}
