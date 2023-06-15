package libreria.servicios;

import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialServicio {

    private AutorServicio autorServicio;
    private LibroServicio libroServicio;
    private final EditorialDAO editorialDAO;
    private Editorial editorial;

    public EditorialServicio() {
        this.editorialDAO = new EditorialDAO();
    }

    public void setServicios(AutorServicio autorServicio, LibroServicio libroServicio) {
        this.autorServicio = new AutorServicio();
        this.libroServicio = new LibroServicio();
    }

    public Editorial crearEditorial(String nombre) {
        editorial = new Editorial();
        try {
            editorial.setNombre(nombre);
            editorialDAO.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
