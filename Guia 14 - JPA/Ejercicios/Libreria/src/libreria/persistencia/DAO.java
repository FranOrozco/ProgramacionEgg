package libreria.persistencia;

/**
 * e) Tareas a realizar Al alumno le toca desarrollar, las siguientes
 * funcionalidades: * 1) Crear base de datos Librería
 *
 * 2) Crear unidad de persistencia
 *
 * 3) Crear entidades previamente mencionadas (excepto Préstamo) * 4) Generar
 * las tablas con JPA
 *
 * 5) Crear servicios previamente mencionados.
 *
 * 6) Crear los métodos para persistir entidades en la base de datos librería
 *
 * 7) Crear los métodos para dar de alta/bajo o editar dichas entidades.
 *
 * 8) Búsqueda de un Autor por nombre.
 *
 * 9) Búsqueda de un libro por ISBN.
 *
 * 10) Búsqueda de un libro por Título. 11) Búsqueda de un libro/s por nombre de
 * Autor.
 *
 * 12) Búsqueda de un libro/s por nombre de Editorial.
 *
 * 13) Agregar las siguientes validaciones a todas las funcionalidades de la
 * aplicación: • Validar campos obligatorios.
 *
 * • No ingresar datos duplicados.
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO<T> {

    protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    protected EntityManager em = emf.createEntityManager();

    public void conectar() {
        if (!em.isOpen()) {
            emf.createEntityManager();
        }
    }

    public void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }

    public void guardar(T objeto) {
        System.out.println(objeto.toString());
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    public void editar(T objeto) {
        conectar();
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    public void eliminar(T objeto) {
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
    }

}
