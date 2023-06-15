package EjerciciosExtras;

import java.util.Scanner;

public class Extra18 {

    /*
    Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
    N, con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("¿Cuántos números quiere sumar?");
        int dimension = leer.nextInt();
        int[] vector = new int[dimension];
        int suma = 0;

        System.out.println("Ingrese valores que quiere guardar dentro del vector: ");
        for (int i = 0; i < dimension; i++) {
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        
        System.out.println("La suma total de los números ingresados es: " + suma);

    }

}
