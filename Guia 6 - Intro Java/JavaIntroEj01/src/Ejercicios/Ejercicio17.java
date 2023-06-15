/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
 de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de numeros ");
        int n = leer.nextInt(); 
        
        int[] vector = new int[n];
        
        
        
        int unid = 0, dec = 0, cent = 0, unidmil = 0, decmil = 0;
        
        for (int i = 0; i < n; i++) {
           
        vector[i] = leer.nextInt();
        
           if (vector[i] < 10) {
            unid++;
        } else if (vector[i] < 100) {
            dec++;
        } else if (vector[i] < 1000) {
            cent++;
        } else if (vector[i] < 10000) {
            unidmil++;
        } else if (vector[i] < 100000) {
            decmil++;
        }
           
        }
        
        System.out.println("La cantidad de numeros de 1 digito son " + unid);
        System.out.println("La cantidad de numeros de 2 digitos son " + dec);
        System.out.println("La cantidad de numeros de 3 digitos son " + cent);
        System.out.println("La cantidad de numeros de 4 digitos son " + unidmil);
        System.out.println("La cantidad de numeros de 5 digitos son " + decmil);
    }
    
}
