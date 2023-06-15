package Guia6;
import java.util.Scanner;
public class Extra23LeoCRACK {
    /*
    Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
    que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
    20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
    será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
    rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
    por pantalla la sopa de letras creada.
    Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
    de Java substring(), Length() y Math.random().
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String[][] palabras ;
        String[][] sopa;
        String palabra, vacio = "-";

        sopa = crearSopa(20, 20);
        palabras = crearSopa(5,5);
        mostrarMatriz(20, 20, sopa);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la palabra " + (i + 1) + ": ");
            palabra = leer.nextLine();
            while (palabra.length() > 5 || palabra.length() < 3) {
                System.out.println("Por favor asegurese de que la palabra tiene al menos 3 letras y maximo 5: ");
                palabra = leer.nextLine();
            }
            for (int j = 0; j < palabra.length(); j++) {
                    palabras[i][j] = palabra.substring(j, j+1).toUpperCase();
            }
        }
        System.out.println("Las palabras son: ");

        mostrarMatriz(5, 5, palabras);

        for (int k = 0; k < 5; k++) {
            int posF, posC;
            do {
                posF = (int) (Math.random() * 20);
                posC = (int) (Math.random() * 16);
            } while (!((sopa[posF][posC].equals(vacio)) && (sopa[posF][posC + 1].equals(vacio))
                    && (sopa[posF][posC + 2].equals(vacio)) && (sopa[posF][posC + 3].equals(vacio)) && (sopa[posF][posC + 4].equals(vacio))));

            for (int l = 0; l < 5; l++) {
                sopa[posF][posC + l] = palabras[k][l];
            }
        }

        System.out.println("Solución: ");

        mostrarMatriz(20, 20, sopa);

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j].equals(vacio)) {
                    int rdm = (int) (Math.random() * 26) + 65;
                    sopa[i][j] = Character.toString((char) rdm);
                }
            }
        }

        System.out.println("La sopa quedó: ");

        mostrarMatriz(20, 20, sopa);
    }

    public static String[][] crearSopa(int filas, int columnas) {
        String[][] matriz = new String[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = "-";
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(int filas, int columnas, String[][] matriz) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println("");
        }
    }
}
