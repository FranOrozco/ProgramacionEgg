package EjerciciosExtras;

import java.util.Scanner;

public class Extra9 {
    /*
    Simular la división usando solamente restas. Dados dos números enteros mayores que
    uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
    Método:
    Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
    resultado es el residuo, y el número de restas realizadas es el cociente.
    Por ejemplo: 50 / 13:
    50 – 13 = 37 una resta realizada
    37 – 13 = 24 dos restas realizadas
    24 – 13 = 11 tres restas realizadas
    dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, auxiliar = 0, contador = 0;
        System.out.println("Ingrese el número a dividir");
        num1 = leer.nextInt();
        System.out.println("Ingrese el divisor.");
        num2 = leer.nextInt();
        
        do {            
            auxiliar = num1 - num2;
            num1 = auxiliar;
            contador++;
        } while (num1 >= num2);
        System.out.println("El residuo es " + auxiliar + " y el cociente es " + contador + ".");
        
    }   
}
