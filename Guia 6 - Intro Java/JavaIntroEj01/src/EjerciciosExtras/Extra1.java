/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Extra1 {

    /*
    Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un tiempo en minutos: ");
        double tiempo = leer.nextInt();
        convertorDeMinutos(tiempo);
    }
    
    public static void convertorDeMinutos(double tiempo){
        double dia = tiempo / 1440;
        double horas = (dia % 1) * 24;
        double minutos = (horas % 1) * 60;
        System.out.println("Su equivalente en días es: " + (int) dia + " día/s, " + (int) horas + " horas y " + (int) minutos + " minutos.");
       
    }
}
