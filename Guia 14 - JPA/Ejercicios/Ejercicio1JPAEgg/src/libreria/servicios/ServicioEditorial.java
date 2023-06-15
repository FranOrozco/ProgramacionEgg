package libreria.servicios;

import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class ServicioEditorial {

    private ServicioAutor servicioAutor;
    private ServicioLibro servicioLibro;
    private final EditorialDAO editorialDAO;
    private Editorial editorial;

    public ServicioEditorial() {
        this.editorialDAO = new EditorialDAO();
    }

    public void setServicios(ServicioAutor servicioAutor, ServicioLibro servicioLibro) {
        this.servicioAutor = new ServicioAutor();
        this.servicioLibro = new ServicioLibro();
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
