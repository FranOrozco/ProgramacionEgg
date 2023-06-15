package EjerciciosExtras;

import java.util.Scanner;

public class Extra3 {
    /*
    Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String. 
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String letra;
        do {            
            System.out.println("Ingrese una SOLA letra: ");
            letra = leer.next();
        } while (letra.length() != 1);
        
        letra = letra.toLowerCase();
        
        switch (letra){
            case "a":
                System.out.println("Es una vocal.");
                break;
            case "e":
                System.out.println("Es una vocal.");
                break;
            case "i":
                System.out.println("Es una vocal.");
                break;
            case "o":
                System.out.println("Es una vocal.");
                break;
            case "u":
                System.out.println("Es una vocal.");
                break;
            default:
                System.out.println("No es una vocal.");
        }
    }
}
