package Entidad;

public class Persona {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(int alturaCm) {
        this.alturaCm = alturaCm;
    }
    
    public String nombre;
    public int edad;
    public int alturaCm;

    public Persona(String nombre, int edad, int alturaCm) {
        this.nombre = nombre;
        this.edad = edad;
        this.alturaCm = alturaCm;
    }
    
}
