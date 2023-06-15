package entidades;

public class Perro extends Animal {

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
        System.out.println("El perro se alimenta de " + alimento + ".");
    }

}
