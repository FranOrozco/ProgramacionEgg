package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

    /*
    Crea una aplicación que a través de una función nos convierta una cantidad de euros
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
    función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será
    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
    (void).
    El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor en Euros que quiere convertir: ");
        int valor = leer.nextInt();
        
        System.out.println("¿A qué moneda quiere convertirlo?");
        System.out.println(" - libras");
        System.out.println(" - dolar");
        System.out.println(" - yenes");
        String moneda = leer.next();
        
        transformar(valor, moneda);
    }
    
    public static void transformar(int num, String moneda){
        double retorno = 0;
        switch (moneda){
            case "dolar":
                retorno = num * 1.28611;
                System.out.println(num + " Euros equivale a " + retorno + " Dolares");
                break;
            case "libras":
                retorno = num * 0.86;
                System.out.println(num + " Euros equivale a " + retorno + " Libras");
                break;
            case "yenes":
                retorno = num * 129.852;
                System.out.println(num + " Euros equivale a " + retorno + " Yenes");
                
        }
    }
}

