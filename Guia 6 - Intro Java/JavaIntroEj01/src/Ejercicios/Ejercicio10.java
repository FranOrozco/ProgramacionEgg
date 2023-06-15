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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    
    
    
    /*
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
    números al usuario hasta que la suma de los números introducidos supere el límite inicial.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor positivo que quiere tener como límite");
        int limite = leer.nextInt();
        int var;
        int suma = 0;
        System.out.println("El programa pedirá números hasta que la suma supere el límite ingresado anteriormente");
        do {
            System.out.println("Ingrese un valor para empezar a sumar.");
            var = leer.nextInt();
            suma += var;
        } while (suma <= limite);
        System.out.println("Has superado el límite. El número final es: " + suma + ".");
    }
    
}
