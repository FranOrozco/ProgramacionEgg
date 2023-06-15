/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaVideos;

import java.util.Scanner;

/**
 *
 * @author Franco Orozco
 */
public class CondicionalesEnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int opinion;
    Scanner leer = new Scanner(System.in);
    System.out.println("Clasifique la película del 1 al 5 estrellas");
    opinion = leer.nextInt();
    
    if (opinion >= 1 && opinion <= 5){
        switch(opinion){
            case 1: 
            case 2:
                System.out.println("Nos sentimos apenados de que no hayas disfrutado la película");
                break;
            case 3:
                System.out.println("Has calificado la película como buena");
                break;
            case 4:
                System.out.println("Has clasificado la película como muy buena!");
                break;
            case 5: 
                System.out.println("Fantástico de que hayas disfrutado un excelente entretenimiento!");
                break;
                
            /*default: 
                System.out.println("pucha, qué pasó?");
                */
        }
    } else if (opinion < 0){
            System.out.println("¿Una opinión negativa? ¿tan mala fue la película?");      
        }
      else if (opinion == 0){
            System.out.println("El valor " + opinion + " no es válida y no se tomará en cuenta :( ");
} else {
          System.out.println(opinion + "! wow! se te fue de la mano con la puntuación!");
      }
}
}

