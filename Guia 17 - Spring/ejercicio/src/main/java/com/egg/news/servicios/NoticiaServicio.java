package com.egg.news.servicios;

import com.egg.news.entidades.Noticia;
import com.egg.news.excepciones.MiException;
import com.egg.news.repositorios.NoticiaRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiaServicio {

    @Autowired
    /* Indicar al servidor de aplicaciones que esta variable será inicilizada por él.
    No hace falta inicializar la variable para poder utilizarla. Esto es lo que se llama "inyección de dependencias". */
    private NoticiaRepositorio noticiaRepositorio;

    @Transactional
    /* Si el método se lanza sin largar excepciones, se realiza un commit a la base de datos y se aplican los cambios.
    En cambio, si el método lanza una excepción y NO es atrapada, se vuelve atrás con la transacción, es decir, se hace un rollback y no se aplica nada en la base de datos.
    Por lo tanto, podemos decir, que todos aquellos métodos que generen modificaciones permanentes en la base de datos DEBEN ser anotados como @Transactional*/
    public void crearNoticia(Long id, String titulo, String cuerpo) throws MiException {
        validar(id, titulo, cuerpo);
        Noticia noticia = new Noticia();
        noticia.setId(id);
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);

        /* Una vez instanciado el noticiaRepositorio, podemos llamar a todos los 
        métodos que tiene de manera intrinseca por JpaRepository */
        noticiaRepositorio.save(noticia); // Recibe una entidad por parámetro, la guarda y la persiste en la base de datos. 
    }

    public void buscarNoticia(Long id) {
        Noticia noticia = noticiaRepositorio.findById(id).get(); // El get es para "traerlo" y poder guardarlo en el objeto noticia
    }

    public List<Noticia> listarNoticias() {
        List<Noticia> noticias = new ArrayList<>();
        noticias = noticiaRepositorio.findAll(); // Buscamos todos los libros y los guardamos
        return noticias;
    }

    public void modificarNoticia(Long id, String titulo, String cuerpo) throws MiException{
        validar(id, titulo, cuerpo);
        /* El optional es un objeto contenedor que puede o no, contener un valor no nulo. Si el valor está presente, devuelve True.*/
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();
            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);
            noticiaRepositorio.save(noticia);
        }
    }

    private void validar(Long id, String titulo, String cuerpo) throws MiException {
        if (id == null) {
            throw new MiException("El id No puede ser nulo.");
        }
        if (titulo.isEmpty() || titulo == null) {
            throw new MiException("El titulo no puede ser nulo o estar vacío.");
        }
        if (cuerpo.isEmpty() || cuerpo == null) {
            throw new MiException("El cuerpo no puede ser nulo o estar vacío.");
        }
    }

}
