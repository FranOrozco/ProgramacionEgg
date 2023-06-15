package guia9ejercicio1;

import entidades.Perro;
import entidades.Persona;
import java.util.Scanner;

public class Guia9Ejercicio1 {

    /**
     * Realizar un programa para que una Persona pueda adoptar un Perro.
     *
     * Vamos a contar de dos clases. Perro, que tendrá como atributos: nombre,
     * raza, edad y tamaño;
     *
     * y la clase Persona con atributos: nombre, apellido, edad, documento y
     * Perro.
     *
     * Ahora deberemos en el main crear dos Personas y dos Perros.
     *
     * Después, vamos a tener que pensar la lógica necesaria para asignarle a
     * cada Persona un Perro y por ultimo, mostrar desde la clase Persona, la
     * información del Perro y de la Persona.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Persona p1 = new Persona();
        Persona p2 = new Persona();

        Perro perro1 = new Perro();
        Perro perro2 = new Perro();

        System.out.println("------ PRIMER PERSONA ------");
        System.out.println("Ingrese el nombre: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el apellido: ");
        p1.setApellido(leer.next());
        System.out.println("Ingrese la edad: ");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el n° de DNI: ");
        p1.setDocumento(leer.next());
        System.out.println("Ingrese el nombre de su perro: ");
        perro1.setNombre(leer.next()); // Le doy nombre al perro guardando su valor en el atributo del perro 1
        p1.setPerro(perro1); // Le seteo ese mismo perro a la persona 1
        System.out.println("");

        System.out.println("------ SEGUNDA PERSONA ------");
        System.out.println("Ingrese el nombre: ");
        p2.setNombre(leer.next());
        System.out.println("Ingrese el apellido: ");
        p2.setApellido(leer.next());
        System.out.println("Ingrese la edad: ");
        p2.setEdad(leer.nextInt());
        System.out.println("Ingrese el n° de DNI: ");
        p2.setDocumento(leer.next());
        System.out.println("Ingrese el nombre de su perro: ");
        perro2.setNombre(leer.next());
        p2.setPerro(perro2);
        System.out.println("");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

}
