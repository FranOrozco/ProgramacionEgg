package libreria.persistencia;

import libreria.entidades.Autor;

public class AutorDAO extends DAO<Autor> {

    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }

    public Autor buscarAutorPorNombre(String nombre) {
        conectar();
        Autor autor = em.find(Autor.class, nombre);
        desconectar();
        return autor;
    }

}
