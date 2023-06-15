/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        21. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
        3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
        dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
        se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
        que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
        la matriz M en la cual empieza el primer elemento de la submatriz P.
        Ejemplo:
        
        Matriz 10 x 10                                      Matriz 3 x 3
        
        1   26  36  47  5   6   72  81  95  10              36  5   67
        11  12  13  21  41  22  67  20  10  61              89  90  75  
        56  78  87  90  09  90  17  12  87  67              14  22  26 
        41  87  24  56  97  74  87  42  64  35
        32  76  79  1   |36  5   67|  96  12  11      
        99  13  54  88  |89  90  75|  12  41  76  
        67  78  87  45  |14  22  26|  42  56  78  
        98  45  34  23  32  56  74  16  19  18
        24  67  97  46  87  13  67  89  93  24
        21  68  78  98  90  67  12  41  65  12  
        
        Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
        4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6
         */
        int[][] M1 = new int[10][10];

        Random rnd = new Random();
        int[][] P = new int[3][3];
        boolean igual = false;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Matriz[10][10]");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                M1[i][j] = rnd.nextInt(1 - (0) + 1) - 0;

                System.out.print("|" + M1[i][j] + "|");
            }
            System.out.println("");

        }

        System.out.println("");
        System.out.println("Matriz P[3][3]");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                P[i][j] = rnd.nextInt(1 - (0) + 1) - 0;
                System.out.print("|" + P[i][j] + "|");
            }
            System.out.println("");
        }
        

        boolean bandera = true;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((M1[i][j] == P[0][0]) && (M1[i][j + 1] == P[0][1]) && (M1[i][j + 2] == P[0][2])) {
                    if ((M1[i + 1][j] == P[1][0]) && (M1[i + 1][j + 1] == P[1][1]) && (M1[i + 1][j + 2] == P[1][2])) {
                        if ((M1[i + 2][j] == P[2][0]) && (M1[i + 2][j + 1] == P[2][1]) && (M1[i + 2][j + 2] == P[2][2])) {
                            System.out.println("La matriz P se encuentra dentro de la matriz M1 desde la poscicion " + i + " - " + j);
                            bandera = false;
                        }

                    }

                }

            }

        }

        if (bandera) {
            System.out.println("No se encontro");
        }

    }

}
