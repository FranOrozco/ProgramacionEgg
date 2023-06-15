package Guia6;
import java.util.Scanner;
/**
 *Realizar un programa que complete un vector con los N primeros números de la
 * sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión
 * de los siguientes números:
 * 
 Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
 */
public class Extra24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Elija hasta que posicion de la sucesion de Fibonacci quiere ver: ");
        int pos = leer.nextInt();
        int[] vector = new int[pos];
        
        
        for (int i = 0 ; i < pos ; i++){
            vector[i] = nroFibo(i);
        }
        
        System.out.println("Los numeros de Fibonacci hasta la posicion " + pos + " son :");
        for (int i = 0 ; i < pos ; i++){
            System.out.print(vector[i] + " ");
            System.out.println("");
        }
    }
    
    public static int nroFibo(int n){
        int suma = 0;
           if (n <=1){
               suma += 1;
           } else {
               suma = nroFibo(n-2) + nroFibo(n - 1); 
           }
        return suma;
    }
    
    
}
