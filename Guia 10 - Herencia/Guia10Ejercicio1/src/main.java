
import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

public class main {

    /**
     * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato,
     * Caballo. La clase Animal tendrá como atributos el nombre, alimento, edad
     * y raza del Animal. Crear un método en la clase Animal a través del cual
     * cada clase hija deberá mostrar luego un mensaje por pantalla informando
     * de que se alimenta. Generar una clase Main que realice lo siguiente:
     *
     * @param args
     */
    public static void main(String[] args) {

        Animal perro = new Perro("Tobi", "DogChow", 15, "Caniche");
        perro.Alimentarse();

        Animal gato = new Gato("Taya", "Pedigree", 3, "Pichicaca");
        gato.Alimentarse();

        Animal caballo = new Caballo("Corre como el viento, tiro al blanco", "pasto", 5, "Bestial");
        caballo.Alimentarse();
    }

}
