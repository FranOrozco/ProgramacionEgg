package EjerciciosExtras;

import java.util.Scanner;

public class Extra10 {

    /*
    Realice un programa para que el usuario adivine el resultado de una multiplicación entre
    dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
    si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
    al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
    utilizar la función Math.random() de Java.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        int aleatorio = (int) (Math.random() * 11), aleatorio1 = (int) (Math.random() * 11);
        int resultado = aleatorio * aleatorio1;
        
        do {
            System.out.print("Ingrese el valor que cree que dará la multiplicación: ");        
            opcion = leer.nextInt();
            if (resultado == opcion){
                System.out.println("Su respuesta es correcta");
            }
        } while (resultado != opcion);
    }
    
}
