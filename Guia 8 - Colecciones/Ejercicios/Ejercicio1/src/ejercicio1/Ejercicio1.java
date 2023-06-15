package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {

    /**
     * Diseñar un programa que lea y guarde razas de perros en un ArrayList de
     * tipo String. El programa pedirá una raza de perro en un bucle, el mismo
     * se guardará en la lista y después se le preguntará al usuario si quiere
     * guardar otro perro o si quiere salir. Si decide salir, se mostrará todos
     * los perros guardados en el ArrayList.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> razas = new ArrayList();

        String aux, eleccion;
        do {
            System.out.println("Ingrese una raza de perro: ");
            aux = leer.next();
            razas.add(aux);

            System.out.println("¿Quiere agregar otra raza de perro? s/n");
            eleccion = leer.next();

            switch (eleccion) {
                case "s":
                    break;
                case "n":
                    break;
            }
            System.out.println("");
        } while (!"n".equals(eleccion));

        System.out.println("La/s raza/s de perros ingresados son: ");
        for (String raza : razas) {
            System.out.println(raza);
        }

        // EJERCICIO 2
        System.out.println("Ingrese una raza de perro que quiera sacar");
        String razaSacar = leer.next();

        Iterator<String> iterador = razas.iterator();
        while (iterador.hasNext()) {
            if (iterador.next().equalsIgnoreCase(razaSacar)) {
                iterador.remove();
            }
        }

        System.out.println("Ahora la lista de perros quedaría de la forma: ");
        razas.forEach((raza) -> {
            System.out.println(raza);
        });

    }

}
