package libreria;

import libreria.entidades.Libro;
import libreria.servicios.ServicioLibro;

public class libreria {

    public static void main(String[] args) {
        Menu menu = new Menu();
        ServicioLibro servicioLibro = new ServicioLibro();
        menu.ingresarLibros();
    }
}
