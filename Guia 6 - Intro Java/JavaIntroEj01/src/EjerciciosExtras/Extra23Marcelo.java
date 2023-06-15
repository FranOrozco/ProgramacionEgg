/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Samu Noah
 */
public class Extra23Marcelo {

    /**
     * @param args the command line arguments
     * 
     *   int asciiValue = 65;

        for(int i = asciiValue; i <= 90; i++){
            String convertedChar = Character.toString((char)i);
            System.out.println(i+" => "+convertedChar);
    }
     */
    public static void main(String[] args) {
        /*
        23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
        que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
        20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
        será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
        rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
        por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
        de Java substring(), Length() y Math.random().
         */
        Scanner leerString = new Scanner(System.in);

        String palabra;
        int palabras, a = 0, b = a + 1, n = 0;
        String[][] sopaDeLetras = new String[20][20];
        String[] palabra1 = null,palabra2 = null,palabra3 = null,palabra4 = null,palabra5 = null;
       
        do {
            System.out.println("Ingrese palabras");
            palabra = leerString.nextLine();
            palabra = palabra.toUpperCase();
            palabras = palabra.length();
            n++;
            System.out.println(n);
            if (n == 1) {
                palabra1 = palabra.split("");
            }
            if (n == 2) {
                palabra2 = palabra.split("");
            }
            if (n == 3) {
                palabra3 = palabra.split("");
            }
            if (n == 4) {
                palabra4 = palabra.split("");
            }
            if (n == 5) {
                palabra5 = palabra.split("");
            }
        } while ((palabras > 2 && palabras > 6) || n < 5);
        for (String elem : palabra1) {
            System.out.print("|" + elem + "|");
        }
        System.out.println("");
        for (String elem : palabra2) {
            System.out.print("|" + elem + "|");
        }
        System.out.println("");
        for (String elem : palabra3) {
            System.out.print("|" + elem + "|");
        }
        System.out.println("");
        for (String elem : palabra4) {
            System.out.print("|" + elem + "|");
        }
        System.out.println("");
        for (String elem : palabra5) {
            System.out.print("|" + elem + "|");
        }
        System.out.println("");
        for (int i = 0; i < sopaDeLetras.length; i++) {
            for (int j = 0; j < sopaDeLetras[i].length; j++) {
                int num = (int) (Math.random() * 10);
                String numCad = Integer.toString(num);
                 numCad = Character.toString((char)(num+65));
                sopaDeLetras[i][j] = numCad;
             }
        }
        for (int i = 0; i < sopaDeLetras.length; i++) {
            int rdm = (int) (Math.random() * 10);
            for (int j = 0; j < sopaDeLetras[i].length; j++) {
                 if (i == 0 && j == rdm) {
                    sopaDeLetras[i][j] = palabra1[0];
                    sopaDeLetras[i][j + 1] = palabra1[1];
                    sopaDeLetras[i][j + 2] = palabra1[2];
                    if(palabra1.length > 3){
                    sopaDeLetras[i][j + 3] = palabra1[3];
                    }
                    if(palabra1.length > 4){
                    sopaDeLetras[i][j + 4] = palabra1[4];
                    }
                } else if (i == 3 && j == rdm) {
                    sopaDeLetras[i][j] = palabra2[0];
                    sopaDeLetras[i][j + 1] = palabra2[1];
                    sopaDeLetras[i][j + 2] = palabra2[2];
                    if(palabra2.length > 3){
                    sopaDeLetras[i][j + 3] = palabra2[3];
                    }
                    if(palabra2.length > 4){
                    sopaDeLetras[i][j + 4] = palabra2[4];
                    }
                } else if (i == 5 && j == rdm) {
                    sopaDeLetras[i][j] = palabra3[0];
                    sopaDeLetras[i][j + 1] = palabra3[1];
                    sopaDeLetras[i][j + 2] = palabra3[2];
                    if(palabra3.length > 3){
                    sopaDeLetras[i][j + 3] = palabra3[3];
                    }
                    if(palabra3.length > 4){
                    sopaDeLetras[i][j + 4] = palabra3[4];
                    }
                } else if (i == 15 && j == rdm) {
                    sopaDeLetras[i][j] = palabra4[0];
                    sopaDeLetras[i][j + 1] = palabra4[1];
                    sopaDeLetras[i][j + 2] = palabra4[2];
                   if(palabra4.length > 3){
                    sopaDeLetras[i][j + 3] = palabra4[3];
                    }
                    if(palabra4.length > 4){
                    sopaDeLetras[i][j + 4] = palabra4[4];
                    }
                } else if (i == 19 && j == rdm) {
                    sopaDeLetras[i][j] = palabra5[0];
                    sopaDeLetras[i][j + 1] = palabra5[1];
                    sopaDeLetras[i][j + 2] = palabra5[2];
                    if(palabra5.length > 3){
                    sopaDeLetras[i][j + 3] = palabra5[3];
                    }
                    if(palabra5.length > 4){
                    sopaDeLetras[i][j + 4] = palabra5[4];
                    }
                }
            }
            imprimeMatriz(sopaDeLetras);
        }
    }

    public static void imprimeMatriz(String[][] matriz) {
        System.out.println("");
        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("" + matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
