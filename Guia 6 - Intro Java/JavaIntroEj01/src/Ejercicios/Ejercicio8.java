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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
    usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
    pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
    Nota: investigar la función Lenght() en Java.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase.");
        System.out.println("Si la frase o la palabra tiene 8 caracteres de largo, el programa imprimirá Correcto. En caso contrario, imprimirá Incorrecto.");
        String frase = leer.nextLine();
        if (frase.length() == 8){
            System.out.println("Correcto. La frase o palabra tiene 8 carácteres.");
        } else {
            System.out.println("Incorrecto. La frase o palabra NO tiene 8 caracteres");
        }
    }}

