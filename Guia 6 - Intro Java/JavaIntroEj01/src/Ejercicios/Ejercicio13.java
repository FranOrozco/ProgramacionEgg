/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        double decimal = 1.7;
        System.out.println(decimal);
        decimal = (int) decimal;
        System.out.println(decimal);
        Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el tamaño ");
            
            int tam = leer.nextInt();
      // int[] vector = new int[tam];
      // int[][] matriz = new int[tam][tam];
            for (int i = 0; tam > i; i++) {
                for (int j = 0; tam > j; j++) {
                    if (i == 0 || i == tam-1 || j == 0 || j == tam-1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("");    }
    
}}
