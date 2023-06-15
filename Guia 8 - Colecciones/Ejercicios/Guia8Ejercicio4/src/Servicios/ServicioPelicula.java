/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
 * tendremos una clase Pelicula con el título, director y duración de la película (en horas).
 * Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
 * que se pide a continuación:
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 * todos sus datos y guardándolos en el objeto Pelicula.
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
 * crear otra Pelicula o no.
 * Después de ese bucle realizaremos las siguientes acciones:
 * • Mostrar en pantalla todas las películas.
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
 * pantalla.
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
 * pantalla.
 * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
 * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//    ArrayList<Pelicula> listaPeliculas = new ArrayList();

    // Creo el método para crear cada película
    public Pelicula crearPelicula() {

        Pelicula pelicula = new Pelicula();

        System.out.println("Ingrese el título de la película: ");
        pelicula.setTitulo(leer.next());

        System.out.println("Ingrese el nombre del director: ");
        pelicula.setDirector(leer.next());

        System.out.println("Ingrese la duración en HORAS de la pelicula: ");
        pelicula.setDuracionPelicula(leer.nextInt());

        return pelicula;
    }

    // Creo el método donde voy a almacenar la lista de películas y voy a retornar
    public ArrayList<Pelicula> CrearListaPeliculas() {
        ArrayList<Pelicula> listaPeliculas = new ArrayList();
        String decision;
        do {
            listaPeliculas.add(crearPelicula());
            System.out.println("¿Desea ingresar otra película? s/n ");
            decision = leer.next();
        } while (decision.equalsIgnoreCase("s"));
        return listaPeliculas;
    }

    // Método para mostrar las películas
    public void mostrarPeliculas(ArrayList<Pelicula> listaPelicula) {
        System.out.println("Las películas ingresadas son: ");
        for (Pelicula aux : listaPelicula) {
            System.out.println(aux.toString());
        }
    }

    public void peliculaMayor1hora(ArrayList<Pelicula> listaPelicula) {
        System.out.println("Las películas con duración MAYOR a 1 hora son: ");
        for (Pelicula aux : listaPelicula) {
            if (aux.getDuracionPelicula() >= 1) {
                System.out.println(aux.toString());
            }
        }
    }

    public void ordenarDuracionDesc(ArrayList<Pelicula> p1) {
        p1.sort(Comparadores.ordenarDuracionDesc);
    }

    public void invertirOrdenArrayList(ArrayList<Pelicula> p1) {
        Collections.reverse(p1);
    }

    public void ordenarPorTitulo(ArrayList<Pelicula> p1) {
        p1.sort(Comparadores.ordenarPorTitulo);
    }

    public void ordenarPorDirector(ArrayList<Pelicula> p1) {
        p1.sort(Comparadores.ordenarPorDirector);
    }

}
