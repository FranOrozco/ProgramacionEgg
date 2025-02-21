package com.egg.news.repositorios;

import com.egg.news.entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository // Extendemos con JpaRepository<ObjetoAManejar, TipoDeLlavePrimaria(id)>
public interface NoticiaRepositorio extends JpaRepository<Noticia, Long>{
    // Buscar noticia mediante titulo
    @Query("SELECT n FROM Noticia n WHERE n.titulo = :titulo")
    public Noticia buscarPorTitulo(@Param("titulo") String titulo);
    
    
}
