package extra2.pkg1;

import Entidades.Fraccion;
import Servicios.ServicioFraccion;
import java.util.Scanner;

public class Extra21 {

    /*
    - Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
    fracción). 
    - Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
    fracciones. 
    - Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioFraccion s = new ServicioFraccion();

        Fraccion f = s.crearFraccion();

        int decision;
        do {
            System.out.println("¿Qué quiere hacer?");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            decision = leer.nextInt();

            switch (decision) {
                case 1:
                    s.sumar(f);
                    break;
                case 2:
                    s.restar(f);
                    break;
                case 3:
                    s.multiplicacion(f);
                    break;
                case 4:
                    s.division(f);
                    break;
            }
            System.out.println("");
        } while (decision != 5);
    }

}
