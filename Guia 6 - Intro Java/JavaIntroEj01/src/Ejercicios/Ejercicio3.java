/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Franco Orozco
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String frase, minusculas,mayusculas;
        System.out.println("Por favor ingrese una frase: ");
        frase = leer.next();
        minusculas = toLowerCase(frase);
        mayusculas = toUpperCase(frase);
        System.out.println("La frase en minúsculas es: " + minusculas);
        System.out.println("La frase en mayúsculas es: " + mayusculas);
    }
    
}
