package Ejercicios;

import java.util.Scanner;

public class Ejercicio19grupito {

    /*
    Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
    matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
    signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
    denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dim = 3;
        
        // Creación de Matriz
        int [][] matrizA = new int [dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (i == j){
                    matrizA [i][j] = 0;
                } else {
                    System.out.println("Ingrese un valor para la posición [" + i + "][" + j + "]");
                    matrizA[i][j] = leer.nextInt();
                }
            }
        }
        
        if(esAntisimetrica(matrizA, dim)){
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz NO es antisimétrica.");
        }
    }
    
    public static boolean esAntisimetrica(int[][] matriz, int tamanioMatriz){
        boolean retorno = true;
        for (int i = 0; i < tamanioMatriz; i++) {
            for (int j = 0; j < tamanioMatriz; j++) {
                if(matriz[i][j] != - matriz[j][i]){
                    retorno = false;
                    break;
                }
            }
        }
        return retorno;
    }}

    

