package libreria.servicios;

import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {

    private LibroServicio libroServicio;
    private EditorialServicio editorialServicio;
    private final AutorDAO autorDAO;

    public AutorServicio() {
        this.autorDAO = new AutorDAO();
    }

    public void setServicios(LibroServicio libroServicio, EditorialServicio editorialServicio) {
        this.libroServicio = new LibroServicio();
        this.editorialServicio = new EditorialServicio();
    }
    
    public Autor crearAutor(String nombre){
            Autor autor = new Autor();
        try {
            autor.setNombre(nombre);
            autorDAO.guardar(autor);
            return autor;
        } catch (Exception e) {
           throw e;
        }
        
    }
    
    public Autor buscarPorTitulo(String nombre){
        try {
            return autorDAO.buscarAutorPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
