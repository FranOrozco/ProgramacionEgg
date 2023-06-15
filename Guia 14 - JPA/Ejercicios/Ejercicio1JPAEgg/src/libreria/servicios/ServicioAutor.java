package libreria.servicios;

import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class ServicioAutor {

    private ServicioLibro servicioLibro;
    private ServicioEditorial servicioEditorial;
    private final AutorDAO autorDAO;

    // ¿Por qué hace este método?
    public ServicioAutor() {
        this.autorDAO = new AutorDAO();
    }

    // ¿Y éste? 
    public void setServicios(ServicioLibro servicioLibro, ServicioEditorial servicioEditorial) {
        this.servicioLibro = new ServicioLibro();
        this.servicioEditorial = new ServicioEditorial();
    }

    public Autor crearAutor(String nombre) {
        Autor autor = new Autor();
        try {
            autor.setNombre(nombre);
            autorDAO.guardar(autor);
            return autor;
        } catch (Exception e) {
            throw e;
        }
    }

    public Autor buscarPorTitulo(String nombre) {
        try {
            return autorDAO.buscarAutorPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
