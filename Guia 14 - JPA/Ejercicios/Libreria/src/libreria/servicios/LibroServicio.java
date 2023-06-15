package libreria.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

public class LibroServicio {

    private AutorServicio autorServicio;
    private EditorialServicio editorialServicio;
    private LibroDAO libroDAO;

    public LibroServicio() {
         this.libroDAO = new LibroDAO();
    }

    public void setServicios(AutorServicio autorServicio, EditorialServicio editorialServicio) {
        this.autorServicio = new AutorServicio();
        this.editorialServicio = new EditorialServicio();
    }

    public Libro crearLibro(String titulo, Autor autor, Editorial editorial, Boolean Alta, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Integer Anio) {
//        this.libroDAO = new LibroDAO();
        Libro libro = new Libro();
        try {
            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setAlta(Alta);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAnio(Anio);
            libroDAO.guardar(libro);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
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
            lista.forEach((libro) -> {
                System.out.println(libro);
            });
        } catch (Exception e) {
        }

    }
}
