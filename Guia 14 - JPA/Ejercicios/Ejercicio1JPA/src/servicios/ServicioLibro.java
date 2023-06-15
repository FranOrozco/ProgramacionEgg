package servicios;

import entidades.Libro;
import entidades.LibroJpaController;
import entidades.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServicioLibro {

    LibroJpaController LibroJPA = new LibroJpaController();

    public void crearLibro(Libro libro) {
        try {
            LibroJPA.create(libro);
        } catch (Exception ex) {
            Logger.getLogger(ServicioLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarLibro(Long isbn) {
        try {
            LibroJPA.destroy(isbn);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ServicioLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarLibro(Libro libro) {
        try {
            LibroJPA.edit(libro);
        } catch (Exception ex) {
            Logger.getLogger(ServicioLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Libro> traerLibros() {
        List<Libro> listaLibro = LibroJPA.findLibroEntities();
        return listaLibro;
    }
    
    public Libro traerLibro(Long isbn) {
        Libro libro = LibroJPA.findLibro(isbn);
        return libro;
    }
}
