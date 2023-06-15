package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 * Implemente la clase Persona. Una persona tiene un nombre y una fecha de
 * nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y
 * set. Y los siguientes métodos: 
 * • Agregar un método de creación del objeto que
 * respete la siguiente firma: crearPersona(). Este método rellena el objeto
 * mediante un Scanner y le pregunta al usuario el nombre y la fecha de
 * nacimiento de la persona a crear, recordemos que la fecha de nacimiento debe
 * guardarse en un Date y los guarda en el objeto. 
 * • Escribir un método
 * calcularEdad() a partir de la fecha de nacimiento ingresada. Tener en cuenta
 * que para conocer la edad de la persona también se debe conocer la fecha
 * actual. 
 * • Agregar a la clase el método menorQue(int edad) que recibe como
 * parámetro otra edad y retorna true en caso de que el receptor tenga menor
 * edad que la persona que se recibe como parámetro, o false en caso contrario.
 * • Metodo mostrarPersona(): este método muestra la persona creada en el método
 * anterior.
 */
public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona persona = new Persona();

        System.out.println("Ingrese el nombre de la persona: ");
        persona.setNombre(leer.next());

        System.out.println("Ingrese el día de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        int anio = leer.nextInt();

        // 942634800000L
        // new Date(anio - 1900, mes - 1, dia)
        persona.setFechaNacimiento(new Date(anio - 1900, mes - 1, dia));

        return persona;
    }

    public int calcularEdad(Persona persona) {
        Date fechaActual = new Date();

        Date edad = new Date((fechaActual.getTime() - persona.getFechaNacimiento().getTime()));
        System.out.println("La edad de la persona es de: " + (edad.getYear() - 70));

        return (edad.getYear() - 70);
    }

    /**
     * Agregar a la clase el método menorQue(int edad) que recibe como parámetro
     * otra edad y retorna true en caso de que el receptor tenga menor edad que
     * la persona que se recibe como parámetro, o false en caso contrario
     */
    public boolean menorQue(Persona persona, int edad) {
        if ((calcularEdad(persona) - edad) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo mostrarPersona(): este método muestra la persona creada en el
     * método anterior.
     */
    public void mostrarPersona(Persona persona) {
        System.out.println(persona.toString());
    }
}
