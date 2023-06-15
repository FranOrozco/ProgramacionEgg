package EjerciciosExtras;

import java.util.Scanner;

public class Extra7 {

    /*
    Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
    de n números (n>0). El valor de n se solicitará al principio del programa y los números
    serán introducidos por el usuario. Realice dos versiones del programa, una usando el
    bucle “while” y otra con el bucle “do - while”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, cantidadNumeros, valorMaximo = 0, valorMinimo = 999999999, suma = 0, contador = 0;

        System.out.println("¿Cuántos números desea comparar?");
        cantidadNumeros = leer.nextInt();

        // Bucle utilizando while.
        System.out.println("Ingrese números mayores que 0, por favor.");
        calculador(cantidadNumeros);

        System.out.println("¿Desea volver a realizar el programa pero con otros números? (si/no)");
        String respuesta = leer.next();
        respuesta = respuesta.toLowerCase();
        System.out.println("");
        
        // Bucle utilizando do - while.
        if ("si".equals(respuesta)) {
            System.out.println("¿Cuántos números desea comparar?");
            cantidadNumeros = leer.nextInt();
            System.out.println("Ingrese números mayores que 0, por favor.");
            do {
                numero = leer.nextInt();
                suma += numero;
                if (numero < valorMinimo) {
                    valorMinimo = numero;
                }
                if (numero > valorMaximo) {
                    valorMaximo = numero;
                }

                contador++;

            } while (contador < cantidadNumeros);

            System.out.println("El promedio de los " + cantidadNumeros + " números introducidos es: " + (suma / cantidadNumeros) + ".");
            System.out.println("El valor mínimo ingresado es: " + valorMinimo + ".");
            System.out.println("El valor máximo ingresado es: " + valorMaximo + ".");
        }

    }

    public static void calculador(int cantidad) {
        Scanner leer1 = new Scanner(System.in);
        int contador1 = 0, numero1, valorMinimo1 = 999999999, valorMaximo1 = 0, suma1 = 0;
        while (contador1 < cantidad) {
            numero1 = leer1.nextInt();
            suma1 += numero1;
            if (numero1 < valorMinimo1) {
                valorMinimo1 = numero1;
            }
            if (numero1 > valorMaximo1) {
                valorMaximo1 = numero1;
            }
            contador1++;
        }
        System.out.println("El promedio de los " + cantidad + " números introducidos es: " + (suma1 / cantidad) + ".");
        System.out.println("El valor mínimo ingresado es: " + valorMinimo1 + ".");
        System.out.println("El valor máximo ingresado es: " + valorMaximo1 + ".");
    }
}
