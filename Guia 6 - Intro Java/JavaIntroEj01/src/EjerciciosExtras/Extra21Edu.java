/*EJERCICIO 21
 Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package guia6ejerciciosdeaprendizaje;

import java.util.Scanner;
import java.util.Random;
/**
  * @author Usuario
 */
public class Extra21Edu {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Random numAleatorio= new Random();
        int matrizM[][], matrizP[][];
        matrizM = new int[10][10];
        matrizP = new int[3][3];
        System.out.println("Indique el valor entrero positivo máximo con que se rellenarán las matrices: ");
        int valMax= leer.nextInt();
        //relleneamos la matriz 10x10 con valores aleatorios
        for (int i=0;i<10; i++){
            for (int j=0;j<10; j++){
                matrizM[i][j]=numAleatorio.nextInt(valMax-0+1) + 0;
            }
        }
        //relleneamos la matriz 3x3 con valores aleatorios (decomentar y comentar de la linea 48 a la 53)
        /*for (int i=0;i<3; i++){
            for (int j=0;j<3; j++){
                matrizP[i][j]=numAleatorio.nextInt(valMax-0+1) + 0;
            }
        }*/
        System.out.println("*-*-*-Matriz M-*-*-*");
        for (int i=0;i<10; i++){
            for (int j=0;j<10; j++){
                System.out.print(matrizM[i][j]+ ",");
            }
            System.out.println("");
        }
        System.out.println("");
         //relleneamos la matriz 3x3 con valores ingresados por el usuario
        for (int i=0;i<3; i++){
            for (int j=0;j<3; j++){
                matrizP[i][j]= leer.nextInt();
            }
        }
        System.out.println("*-*-*-Matriz P-*-*-*");
        for (int i=0;i<3; i++){
            for (int j=0;j<3; j++){
                System.out.print(matrizP[i][j]+ ",");
            }
            System.out.println("");
        }
        System.out.println("");
        buscarMatriz (matrizM, matrizP);
    }
    public static void buscarMatriz(int matrizM[][], int matrizP[][]){
        boolean contiene= false;
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                if (matrizP[0][0]==matrizM[i][j] && matrizP[0][1]==matrizM[i][j+1] && matrizP[0][2]==matrizM[i][j+2]){
                    if (matrizP[1][0]==matrizM[i+1][j] && matrizP[1][1]==matrizM[i+1][j+1] && matrizP[1][2]==matrizM[i+1][j+2]){
                        if (matrizP[2][0]==matrizM[i+2][j] && matrizP[2][1]==matrizM[i+2][j+1] && matrizP[2][2]==matrizM[i+2][j+2]){
                            System.out.println("La matriz P está contenida dentro de la matriz M.");
                            System.out.println("El primer elemento empieza dentro de la fila " + i + ", columna " + j + "." );
                            contiene = true;
                        }
                    }
                }
            }
        }
        if (contiene==false){
            System.out.println("La matriz P no se encuentra dentro de la matriz M.");
        }
    }
}
