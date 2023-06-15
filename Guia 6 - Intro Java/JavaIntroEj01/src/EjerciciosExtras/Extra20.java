package EjerciciosExtras;
import java.util.Scanner;
public class Extra20 {
    /*
    Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
    parámetro. Después haremos otra función o procedimiento que imprima el vector.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int dim;
        
        System.out.print("Ingrese la dimensión que quiere para su vector: ");
        dim = leer.nextInt();
        int[] vector = new int[dim];
        
        rellenarMatriz(vector, dim);
        imprimirMatriz(vector, dim);
    }
    public static int[] rellenarMatriz(int[] vector, int dimVector){
        for (int i = 0; i < dimVector; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        return vector;
    }
    public static void imprimirMatriz(int[] vector, int dimVector){
        for (int i = 0; i < dimVector; i++) {
            if (i < dimVector - 1){
                System.out.print(vector[i] + ", ");
            } else {
                System.out.println(vector[i] + ".");
            }
        }
    }
}
