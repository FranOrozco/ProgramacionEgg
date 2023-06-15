package main;

import entidades.Autor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import servicios.ServicioAutor;
import servicios.ServicioEditorial;
import servicios.ServicioLibro;

public class Ejercicio1 {

    public static void main(String[] args) {
        ServicioAutor SAutor = new ServicioAutor();
        ServicioLibro SLibro = new ServicioLibro();
        ServicioEditorial SEditorial = new ServicioEditorial();

//        Autor autor = new Autor(37640491, "Franco Orozco", true);
//        SAutor.crearAutor(autor);
        // 8. Busqueda de un autor por NOMBRE
        Autor autor = SAutor.traerAutorPorNombre("Franco Orozco");
        System.out.println("El autor tiene id " + autor.getId());
    }
}
