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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    
    
    
    /* 
    Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
    validando que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del segundo, 
    sino informe que no lo son.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("El programa lo que hará es verificar si el primer número es múltiplo del segundo. Éste publicará el resultado.");
        System.out.println("Ingrese un valor para la primer variable.");
        int var1 = leer.nextInt();
        System.out.println("Ingrese un valor para la segunda variable.");
        int var2 = leer.nextInt();
        
        verificador(var1, var2);
    }
    
    public static void verificador(int num1, int num2){
        if (num1 % num2 == 0){
            System.out.println("Es multiplo.");
        } else {
            System.out.println("No es multiplo.");
        }
    }
    
}
