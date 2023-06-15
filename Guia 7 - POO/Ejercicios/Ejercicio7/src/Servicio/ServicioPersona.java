package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo crearPersona(): el método crear persona, le pide los valores de
     * los atributos al usuario y después se le asignan a sus respectivos
     * atributos para llenar el objeto Persona. Además, comprueba que el sexo
     * introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá
     * mostrar un mensaje
     */
    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad: ");
        p1.setEdad(leer.nextInt());

        System.out.println("Ingrese el sexo. H para hombre, M para mujer y O para otros ");
        p1.setSexo(leer.next());
        while (!"H".equalsIgnoreCase(p1.getSexo()) && !"M".equalsIgnoreCase(p1.getSexo()) && !"O".equalsIgnoreCase(p1.getSexo())) {
            System.out.println("Ingrese nuevamente.");
            p1.setSexo(leer.next());
        }

        System.out.println("Ingrese el peso en KG: ");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura en M: ");
        p1.setAltura(leer.nextDouble());

        return p1;
    }

    /**
     * Método calcularIMC(): calculara si la persona está en su peso ideal (peso
     * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor
     * que 20, significa que la persona está por debajo de su peso ideal y la
     * función devuelve un -1. Si la fórmula da por resultado un número entre 20
     * y 25 (incluidos), significa que la persona está en su peso ideal y la
     * función devuelve un 0. Finalmente, si el resultado de la fórmula es un
     * valor mayor que 25 significa que la persona tiene sobrepeso, y la función
     * devuelve un 1.
     */
    public int calcularIMC(Persona p1) {
        double imc = (p1.getPeso() / Math.pow(p1.getAltura(), 2));

        if (imc < 20) {
            return -1;
        } else if (20 <= imc && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    // Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    public boolean esMayorDeEdad(Persona p1) {
        return p1.getEdad() >= 18;
    }
}
