package Entidad;

import java.util.Scanner;

/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo.
 */
public class Persona {

    Scanner leer = new Scanner(System.in);

    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private int condicionIMC;

    public int getCondicionIMC() {
        return condicionIMC;
    }

    public void setCondicionIMC(int condicionIMC) {
        this.condicionIMC = condicionIMC;
    }

    // Un constructor por defecto.
    public Persona() {
    }

    // Un constructor con todos los atributos como parámetro.
    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos getters y setters de cada atributo.
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
