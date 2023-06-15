/*
La clase Animal tendrá como atributos el nombre, alimento, edad
y raza del Animal.
 */
package entidades;

public abstract class Animal {

    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public abstract void Alimentarse();
}
