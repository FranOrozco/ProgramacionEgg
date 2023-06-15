package EjerciciosExtras;
import java.util.Scanner;
public class Extra19 {
    /*
    Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
    comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
    elementos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] vector1, vector2;
        int dim, cont = 0;
        boolean sonIguales = true;

        System.out.println("¿Qué dimensión quiere para los dos vectores?");
        dim = leer.nextInt();
        vector1 = new int[dim];
        vector2 = new int[dim];

        System.out.println("El programa verificará si ambos vectores son iguales.");

        System.out.println("Ingrese los valores que quiere guardar en el vector 1: ");
        for (int i = 0; i < dim; i++) {
            vector1[i] = leer.nextInt();
        }
        System.out.println("Ingrese los valores que quiere guardar en el vector 2: ");
        for (int i = 0; i < dim; i++) {
            vector2[i] = leer.nextInt();
        }

        for (int i = 0; i < dim; i++) {
            if (vector1[i] == vector2[i]) {
                cont++;
            } else {
                System.out.println("Los vectores no son iguales. Difieren en el elemento: " + i);
                break;
            }
            if (cont == dim) {
                System.out.println("Los vectores son iguales");
            }
        }
    }
}
