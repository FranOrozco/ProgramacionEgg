package guia11ejercicio5;

import java.util.Scanner;

public class Guia11Ejercicio5 {

    /*
Escribir un programa en Java que juegue con el usuario a adivinar un número. 
La computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. 
Para ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el 
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando 
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario 
ha intentado adivinar el número. 
Si el usuario introduce algo que no es un número, se debe controlar esa excepción e indicarlo por pantalla. 
En este último caso también se debe contar el carácter fallido como un intento.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int numeroAleatorio = (int) (Math.random() * 500);
        int numero = 0, contador = 0;
        boolean repetir = true;

        do {
            try {
                System.out.println("Ingrese un número.");
                numero = leer.nextInt();

                if (numero == numeroAleatorio) {
                    System.out.println("El número ingresado coincide con el número random. ");
                    repetir = false;
                } else {
                    if (numero < numeroAleatorio) {
                        System.out.println("El número ingresado es menor al número random. ");
                        contador++;
                    } else if (numero > numeroAleatorio) {
                        System.out.println("El número ingresado es mayor al número random. ");
                        contador++;
                    }
                }
            } catch (Exception e) {
                System.out.println("Ingresó un carácter incorrecto. ");
                contador++;
                leer.nextLine();
            }
        } while (repetir);
        System.out.println("La cantidad de intentos fueron: " + contador);

    }
}
