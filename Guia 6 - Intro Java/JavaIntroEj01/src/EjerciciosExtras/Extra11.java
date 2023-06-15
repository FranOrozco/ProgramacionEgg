package EjerciciosExtras;

import java.util.Scanner;

public class Extra11 {
    /*
    Escribir un programa que lea un número entero y devuelva el número de dígitos que
    componen ese número. 
    Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
    Calcular la cantidad de dígitos matemáticamente utilizando el operador
    de división. 
    Nota: recordar que las variables de tipo entero truncan los números o
    resultados.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, resultado = 0, contador = 0;
        
        System.out.println("Ingrese un número entero y el programa se encargará de ver cuántos dígitos tiene este");
        num = leer.nextInt();
        
        while (num != 0){
            num = Math.abs(num/10);
            contador++;
        }
        System.out.println("Tiene " + contador + " Digitos");
    }
    
}
