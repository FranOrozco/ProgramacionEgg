package libreria.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

public class ServicioLibro {

    private ServicioAutor servicioAutor;
    private ServicioEditorial servicioEditorial;
    private LibroDAO libroDAO;

    public ServicioLibro() {
        this.libroDAO = new LibroDAO();
    }

    public void setServicios(ServicioAutor servicioAutor, ServicioEditorial servicioEditorial) {
        this.servicioAutor = new ServicioAutor();
        this.servicioEditorial = new ServicioEditorial();
    }

    public Libro crearLibro(String titulo, Autor autor, Editorial editorial, boolean alta, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Integer anio) {
        Libro libro = new Libro();
        try {
            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setAlta(alta);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAnio(anio);
            return libro;
        } catch (Exception e) {
            throw e;
        }
    }

    public Libro crearLibroManual(Libro libro) {
        try {
            libroDAO.guardar(libro);
            System.out.println(libro.toString());
            return libro;
        } catch (Exception e) {
            throw e;
        }
    }

    public Libro buscarPorISBN(String ISBN) {
        try {
            return libroDAO.buscarPorISBN(ISBN);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro buscarPorTitulo(String titulo) {
        try {
            return libroDAO.buscarPorTitulo(titulo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Libro> librosPorAutor(Autor autor) {
        try {
            return libroDAO.listarLibrosPorAutor(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Libro> librosPorEditorial(Editorial editorial) {
        try {
            return libroDAO.listarLibrosPorEditorial(editorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    // ¿Por qué hizo esta colección?
    public Collection<Libro> libros() throws Exception {
        Collection<Libro> libros = new ArrayList<>();
        try {
            libros = libroDAO.listarLibros();
            return libros;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirListaLibros() {
        try {
            ArrayList<Libro> lista = (ArrayList<Libro>) libros();
            for (Libro libro : lista) {
                System.out.println(libro);
            }
        } catch (Exception e) {
        }
    }
}
