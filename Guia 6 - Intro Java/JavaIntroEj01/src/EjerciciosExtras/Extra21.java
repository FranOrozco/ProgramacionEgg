package EjerciciosExtras;
import java.util.Scanner;
public class Extra21 {
    /*
    Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
    adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
    desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
    prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
    Primer trabajo práctico evaluativo 10%
    Segundo trabajo práctico evaluativo 15%
    Primer Integrador 25%
    Segundo integrador 50%
    Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
    programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
    desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
    igual al 7 de sus notas del curso.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Variables
        int[][] alumnos = new int[10][5];
        int aprobados = 0, desaprobados = 0;

        // Relleno con notas aleatorias hasta la columna 4. La columna 5 la dejo para calcular el promedio. 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                alumnos[i][j] = (int) (Math.random() * 11);
            }
        }

        // Contadores para aprobados y para desaprobados 
        for (int i = 0; i < 10; i++) {
            alumnos[i][4] = (int) (alumnos[i][0] * 0.10 + alumnos[i][1] * 0.15 + alumnos[i][2] * 0.25 + alumnos[i][3] * 0.50);
            if (alumnos[i][4] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        
        // Imprimo la matriz con una función
        System.out.println("La ficha final quedaría de la forma: ");
        imprimirMatriz(alumnos, 10, 5);
        
        // Imprimo cuántos están aprobados y cuántos están desaprobados 
        System.out.println("La cantidad de aprobados son: " + aprobados);
        System.out.println("La cantidad de desaprobados son: " + desaprobados);
    }
    
    // Funcion para imprimir matriz
    public static void imprimirMatriz(int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            System.out.print("Alumno " + i + ": ");
            for (int j = 0; j < m; j++) {
                if (j < 4) {
                    System.out.print(matriz[i][j] + " ; ");
                }
                if (j == 4) {
                    System.out.print("El promedio final es " + matriz[i][j] + ".");
                }
            }
            System.out.println("");
        }
    }
}
