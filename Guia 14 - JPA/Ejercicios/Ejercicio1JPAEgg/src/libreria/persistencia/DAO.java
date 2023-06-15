package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
// Es un DAO con tipo de objeto <T> como norma general. Así se puede utilizar con
// Libro, autor, editorial, lo que sea. Es un método práctico para trabajar con 
// JPA.
public class DAO<T> {

    protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ejercicio1JPAEgg_PU");
    protected EntityManager em = emf.createEntityManager();

    // Método para conectar a la base de datos. 
    public void conectar() {
        if (!em.isOpen()) {
            emf.createEntityManager();
        }
    }

    public void desconectar() {
        if (!em.isOpen()) {
            emf.close();
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
