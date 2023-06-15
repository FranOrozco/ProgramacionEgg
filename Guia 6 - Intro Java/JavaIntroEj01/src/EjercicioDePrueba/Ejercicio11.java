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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una secuencia de carácteres. Cuando quiera terminar, ingrese PUNTO ");  
        System.out.println("El programa cambiará las vocales por otros carácteres.");
        String variable;
        String fraseOriginal = "";
        String fraseModificada = "";
        
        do { 
            System.out.println("Ingrese un caracter.");
            variable = leer.nextLine();
            if (".".equals(variable))
                break;
            switch (variable){
                case "a":
                    fraseOriginal = fraseOriginal.concat(variable);
                    variable = "@";
                    fraseModificada = fraseModificada.concat(variable);
                    break;
                case "e":
                    fraseOriginal = fraseOriginal.concat(variable);
                    variable = "#";
                    fraseModificada = fraseModificada.concat(variable);
                    break;
                case "i":
                    fraseOriginal = fraseOriginal.concat(variable);
                    variable = "$";
                    fraseModificada = fraseModificada.concat(variable);
                    break;
                case "o":
                    fraseOriginal = fraseOriginal.concat(variable);
                    variable = "%";
                    fraseModificada = fraseModificada.concat(variable);
                    break;
                case "u":
                    fraseOriginal = fraseOriginal.concat(variable);
                    variable = "*";
                    fraseModificada = fraseModificada.concat(variable);
                    break;
                case " ":
                    fraseOriginal = fraseOriginal.concat(" ");
                    fraseModificada = fraseModificada.concat(" ");
                    break;
                default:
                    fraseOriginal = fraseOriginal.concat(variable);
                    fraseModificada = fraseModificada.concat(variable);
                    break;
                    
            }
        } while (!".".equals(variable));
        System.out.print("Su frase original es: ");
        System.out.println(fraseOriginal);
        System.out.print("Su frase modificada es: ");
        System.out.println(fraseModificada);
    }
    
}
