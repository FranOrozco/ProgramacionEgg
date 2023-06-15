package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

public class LibroDAO extends DAO<Libro> {

    @Override
    public void guardar(Libro libro) {
        System.out.println("vfcdv");
        super.guardar(libro);
    }

    public void eliminar(String isbn) {
        Libro libro = buscarPorISBN(isbn);
        super.eliminar(libro);
    }

    public Libro buscarPorISBN(String isbn) {
        conectar();
        Libro libro = em.find(Libro.class, isbn);
        desconectar();
        return libro;
    }

    public Libro buscarPorTitulo(String titulo) {
        conectar();
        Libro libro = em.find(Libro.class, titulo);
        desconectar();
        return libro;
    }

    public List<Libro> listarLibros() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> listarLibrosPorAutor(Autor autor) throws Exception {
        conectar();
        List<Libro> libros = (List<Libro>) em.createQuery("SELECT l FROM Libro l, where l.autor.nombre like :autor").setParameter("autor", autor).getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> listarLibrosPorEditorial(Editorial editorial) throws Exception {
        conectar();
        List<Libro> libros = (List<Libro>) em.createQuery("SELECT l FROM Libro l, where l.editorial.nombre like :editorial").setParameter("editorial", editorial).getResultList();
        desconectar();
        return libros;
    }

}
