
import Entidades.Pelicula;
import Servicios.ServicioPelicula;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el título, director y duración de
 * la película (en horas). Implemente las clases y métodos necesarios para esta
 * situación, teniendo en cuenta lo que se pide a continuación: En el servicio
 * deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 * todos sus datos y guardándolos en el objeto Pelicula. Después, esa Pelicula
 * se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear
 * otra Pelicula o no. Después de ese bucle realizaremos las siguientes
 * acciones:
 *
 * • Mostrar en pantalla todas las películas.
 *
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 *
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y
 * mostrarlo en pantalla.
 *
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y
 * mostrarlo en pantalla.
 *
 * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
 *
 * • Ordenar las películas por director, alfabéticamente y mostrarlo en
 * pantalla.
 */
public class main4 {

    public static void main(String[] args) {

        // Creo el servicio con el que te voy a trabajar
        ServicioPelicula s = new ServicioPelicula();

        // Creo la variable de ArrayList donde voy a almacenar la lista de películas
        // Y le guardo dentro la lista de películas creadas desde el servicio.
        ArrayList<Pelicula> listaPeliculas = s.CrearListaPeliculas();

        // Muestro las películas ingresadas
        s.mostrarPeliculas(listaPeliculas);

        // Muestro las películas mayores a una hs
        s.peliculaMayor1hora(listaPeliculas);

        // Ordeno las peliculas por duración mayor a menor
        s.ordenarDuracionDesc(listaPeliculas);

        // Ordeno las peliculas por duración menor a mayor
        s.invertirOrdenArrayList(listaPeliculas);

        // Ordeno alfabéticamente según el Título de la película
        s.ordenarPorTitulo(listaPeliculas);
        System.out.println("");

        // Ordeno alfabéticamente según el nombre del Director de la película
        s.ordenarPorDirector(listaPeliculas);

        // Muestro por última vez la lista de películas
        s.mostrarPeliculas(listaPeliculas);
    }

}
