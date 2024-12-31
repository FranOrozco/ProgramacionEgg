package com.egg.news.excepciones;

public class MiException extends Exception {

    /* Construimos esta clase para diferenciar los errores que tengamos en 
    nuestra lógica de negocio de los errores, bugs propios del sistema.*/
    public MiException(String msg) {
        super(msg);
    }

}
