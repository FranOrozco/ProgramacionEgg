/**
 * Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
 * además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
 * otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
 * definir los métodos getters y setters correspondientes.
 */
package Servicios;

import Entidades.Cancion;
import java.util.Scanner;

public class ServicioCancion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cancion crearCancion(){
        Cancion cancion = new Cancion();
        System.out.println("¿Cómo es el título de la canción?");
        cancion.setTitulo(leer.next());
        System.out.println("¿Quién es el autor de la canción?");
        cancion.setAutor(leer.next());
        
        return cancion;
    }
    
    public void mostrarCancion(Cancion cancion){
        System.out.println("El título de la canción es: " + cancion.getTitulo());
        System.out.println("El/los autor/res de la canción es: " + cancion.getAutor());
        
    }
}
