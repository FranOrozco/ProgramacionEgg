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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo 
    y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] equipo = new String[7];
        
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Ingrese el nombre del compañero " + i);
            equipo [i] = leer.next();
        }
        
        // Ahora le pedimos al programa que imprima el equipo
        System.out.println("El equipo está formado por los compañeros: ");
        for (int i = 0; i < equipo.length; i++) {
            if (i < (equipo.length - 1)){
                System.out.print(equipo[i] + ", ");
            }
            if (i == (equipo.length - 1)){
                System.out.print(equipo[i] + ".");

            }
    }
    
}}
