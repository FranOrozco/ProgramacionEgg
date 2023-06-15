package EjerciciosExtras;

import java.util.Scanner;

public class Extra8 {
    
    /* 
    Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
    detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
    la cantidad de números impares. Al igual que en el ejercicio anterior los números
    negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
    */
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int contador = 0, contPar = 0, contImpar = 0, num;
        System.out.println("Ingrese valores: ");
        do {        
            num = leer.nextInt();
            if (num % 5 == 0){
                break;
            }
            contador++;
            
            if (num % 2 == 0){
                contPar++;
            } else {
                contImpar++;
            }
        } while (!(num % 5 == 0));
        System.out.println("La cantidad de números ingresados fueron: " + contador + ".");
        System.out.println("De estos, " + contPar + " son pares.");
        System.out.println("Además, " + contImpar + " son impares.");
    }    
}
