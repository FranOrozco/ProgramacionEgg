package EjerciciosExtras;

import java.util.Scanner;

public class Extra13 {

    /*
    Crear un programa que dibuje una escalera de números, donde cada línea de números
    comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
    usuario al comenzar. Ejemplo: si se ingresa el número 3:
    1
    12
    123
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamEscalera, i = 1;
        String numerosConcatenados = "", auxiliar;
        
        System.out.print("Ingrese el tamaño de la escalera de números: ");
        tamEscalera = leer.nextInt();
        while(i <= tamEscalera){
            auxiliar = String.valueOf(i);
            numerosConcatenados = numerosConcatenados.concat(auxiliar);
            System.out.println(numerosConcatenados);
            i++;
        }
    }
    
}
