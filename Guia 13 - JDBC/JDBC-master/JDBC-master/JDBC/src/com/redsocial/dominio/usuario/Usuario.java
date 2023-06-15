package com.redsocial.dominio.usuario;

public class Usuario {

    private Integer id;
    private String correoElectronico;
    private String clave;

    public Usuario(Integer id, String correoElectronico, String clave) {
        this.id = id;
        this.correoElectronico = correoElectronico;
        this.clave = clave;
    }

    public Usuario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "usuario{" + "id=" + id + ", correoElectronico=" + correoElectronico + ", clave=" + clave + '}';
    }

    

}
