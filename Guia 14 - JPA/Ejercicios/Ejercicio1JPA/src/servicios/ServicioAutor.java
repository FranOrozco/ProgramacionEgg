package servicios;

import entidades.Autor;
import entidades.AutorJpaController;
import entidades.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServicioAutor {

    AutorJpaController AutorJPA = new AutorJpaController();

    public void crearAutor(Autor autor) {
        try {
            AutorJPA.create(autor);
        } catch (Exception ex) {
            Logger.getLogger(ServicioAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarAutor(Integer id) {
        try {
            AutorJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ServicioAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarAutor(Autor autor) {
        try {
            AutorJPA.edit(autor);
        } catch (Exception ex) {
            Logger.getLogger(ServicioAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Autor> traerAutores() {
        List<Autor> listaAutor = AutorJPA.findAutorEntities();
        return listaAutor;
    }

    public Autor traerAutor(Integer id) {
        Autor autor = AutorJPA.findAutor(id);
        return autor;
    }
    
    public Autor traerAutorPorNombre(String nombre) {
        Autor autor = AutorJPA.findAutorPorNombre(nombre);
        return autor;
    }


}
