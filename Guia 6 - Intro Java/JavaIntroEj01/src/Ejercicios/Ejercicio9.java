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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    
    
    /* 
    Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
    es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
    diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
    Nota: investigar la función Substring y equals() de Java.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase. "
        + "Si esta comienza con A, el programa devolverá 'Correcto'. De otra forma, devolverá 'Incorrecto.");
        String frase = leer.nextLine();
        if ("A".equalsIgnoreCase(frase.substring(0,1))){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
/* 
Otra forma de hacerlo es: 
    frase.substring(0,1).equalsIgnoreCase("a")
*/
