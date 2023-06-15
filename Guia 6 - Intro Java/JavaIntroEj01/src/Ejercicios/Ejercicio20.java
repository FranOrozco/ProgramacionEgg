/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejerciciosdeaprendizaje;

import java.util.Scanner;


/**
 *
 * @author pablo
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[] fila0 = new int[3];
        int[] fila1 = new int[3];
        int[] fila2 = new int[3];
        int[] columna0 = new int[3];
        int[] columna1 = new int[3];
        int[] columna2 = new int[3];
        int sumafila0 = 0;
        int sumafila1 = 0;
        int sumafila2 = 0;
        int sumacolumna0 = 0;
        int sumacolumna1 = 0;
        int sumacolumna2 = 0;
        int sumadiag1 = 0;
        int sumadiag2 = 0;
        String aux = null;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la matriz a comprobar: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                do {
                    System.out.println("Matriz {" + i + "}{" + j + "} = ");
                    matriz[i][j] = leer.nextInt();
                } while (matriz[i][j] < 0 || matriz[i][j] > 9);

            }
        }
        for (int[] fila : matriz) {
            aux = "";
            for (int elemento : fila) {
                aux += "  " + elemento;
                System.out.print(" |" + elemento + "| ");
            }
            System.out.println("");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i == j) {
                    sumadiag1 += matriz[i][j];

                }
                if (i + j == (matriz.length - 1)) {
                    sumadiag2 += matriz[i][j];
                }
                switch (i) {
                    case 0:
                        fila0[j] = matriz[i][j];
                    case 1:
                        fila1[j] = matriz[i][j];
                    case 2:
                        fila2[j] = matriz[i][j];
                        switch (j) {
                            case 0:
                                columna0[i] = matriz[i][j];
                            case 1:
                                columna1[i] = matriz[i][j];
                            case 2:
                                columna2[i] = matriz[i][j];
                        }
                }

            }

        }
        for (int elefila0 : fila0) {
            sumafila0 += +elefila0;
        }
        for (int elefila1 : fila1) {
            sumafila1 += +elefila1;
        }
        for (int elefila2 : fila2) {
            sumafila2 += +elefila2;
        }
        for (int elecol0 : columna0) {
            sumacolumna0 += +elecol0;
        }
        for (int elecol1 : columna1) {
            sumacolumna1 += +elecol1;
        }
        for (int elecol2 : columna2) {
            sumacolumna2 += +elecol2;
        }
        if (sumafila0 == sumafila1 && sumafila1 == sumafila2 && sumafila2 == sumacolumna0 && sumacolumna0 == sumacolumna1
                && sumacolumna1 == sumacolumna2 && sumacolumna2 == sumadiag1 && sumadiag1 == sumadiag2) {
            System.out.println("La matriz es MAGICA LPM!!");
        } else {
            System.out.println("La matriz NO ES MAGICA Y UD NO SABE NADA");

        }

    }
}
