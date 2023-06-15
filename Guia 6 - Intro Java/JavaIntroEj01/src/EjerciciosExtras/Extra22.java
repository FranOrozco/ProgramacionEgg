package EjerciciosExtras;
import java.util.Scanner;
public class Extra22 {
    /*
    Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
    muestre la suma de sus elementos.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n, m;

        System.out.println("Una matriz es de tamaño NxM. ");
        System.out.print("Ingrese N: ");
        n = leer.nextInt();
        System.out.print("Ingrese M: ");
        m = leer.nextInt();
        int[][] matriz = new int[n][m];

        rellenarMatriz(matriz, n, m);
        
        System.out.println("");
        System.out.println("La matriz formada es: ");
        imprimirMatriz(matriz, n, m);
        
        System.out.println("");
        System.out.println("La suma de todos sus elementos da como resultado: " + sumarMatriz(matriz, n, m));
        
    }
    public static int[][] rellenarMatriz(int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        return matriz;
    }
    public static int sumarMatriz(int [][] matriz, int n, int m) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
    public static void imprimirMatriz(int[][] matriz, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
