package servicios;

import entidades.Editorial;
import entidades.EditorialJpaController;
import entidades.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServicioEditorial {

    EditorialJpaController EditorialJPA = new EditorialJpaController();

    public void crearEditorial(Editorial editorial) {
        try {
            EditorialJPA.create(editorial);
        } catch (Exception ex) {
            Logger.getLogger(ServicioEditorial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarEditorial(Integer idEditorial) {
        try {
            EditorialJPA.destroy(idEditorial);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ServicioEditorial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarEditorial(Editorial editorial) {
        try {
            EditorialJPA.edit(editorial);
        } catch (Exception ex) {
            Logger.getLogger(ServicioEditorial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Editorial> traerEditoriales() {
        List<Editorial> listaEditorial = EditorialJPA.findEditorialEntities();
        return listaEditorial;
    }

    public Editorial traerEditorial(Integer id) {
        Editorial editorial = EditorialJPA.findEditorial(id);
        return editorial;
    }
}
