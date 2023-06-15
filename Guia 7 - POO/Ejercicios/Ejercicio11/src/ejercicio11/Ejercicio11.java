package ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    /**
     * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar
     * solo con la clase Date. En este ejercicio deberemos instanciar en el
     * main, una fecha usando la clase Date, para esto vamos a tener que crear 3
     * variables, dia, mes y anio que se le pedirán al usuario para poner el
     * constructor del objeto Date. Una vez creada la fecha de tipo Date,
     * deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha
     * actual, que se puede conseguir instanciando un objeto Date con
     * constructor vacío. 
     * 
     * Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
     * Ejemplo fecha actual: Date fechaActual = new Date();
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Date fechaActual = new Date();
        int dia, mes, anio;
        
        System.out.println("Ingrese el día: ");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = leer.nextInt();
        System.out.println("Ingrese el año: ");
        anio = leer.nextInt();
        
        // Parámetros: Año - 1900; mes - 1 y dia. 
        Date fechaIngresada = new Date(anio - 1900, mes - 1, dia);
        
        System.out.println("Fecha ingresada: " + fechaIngresada.toString());
        System.out.println("Fecha actual: " + fechaActual.toString());
        
        System.out.println("La diferencia de años es: " + (fechaActual.getYear() - fechaIngresada.getYear()) + " años.");
        
    }

}
