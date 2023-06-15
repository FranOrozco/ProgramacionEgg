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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en grados Celsius. El programa lo transformará en Fahrenheit.");
    double grados = leer.nextDouble();
    double faren = 32 + (9 * grados / 5);
        System.out.println( grados + " grados Celsius en Fahrenheit son: " + faren);
    }
    
}
