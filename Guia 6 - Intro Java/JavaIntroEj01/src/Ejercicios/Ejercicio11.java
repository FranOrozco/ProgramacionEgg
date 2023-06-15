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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        String resp = "";
        int opc;
        do{
        System.out.println("1)- Sumar");
        System.out.println("2)- Restar");
        System.out.println("3)- Multiplicar");
        System.out.println("4)- Dividir");
        System.out.println("5)- Salir");
        System.out.println("");
        System.out.println("Que quiere realizar?");
        opc = leer.nextInt();
        switch (opc) {
            case 1:
                int suma = num1 + num2;
                System.out.println("La suma es: " + suma);
                continue;
            case 2:
                int resta = num1 - num2;
                System.out.println("La resta es: " + resta);
                continue;
            case 3:
                int mult = num1 * num2;
                System.out.println("La multiplicación es: " + mult);
                continue;
            case 4:
                double div = num1 / num2;
                System.out.println("La división es: " + div);
                continue;
            case 5:
                System.out.println("¿Seguro que desea salir del programa? s/n");
                resp = leer.next();
                }
        } while (!"s".equals(resp));   
    }
}
