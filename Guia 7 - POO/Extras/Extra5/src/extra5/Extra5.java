/**
 * Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
 * los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
 * de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
 * programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
 * un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
 * ejemplo de ejecución del programa podría ser este:
 * Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
 * No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
 * ¡Ha acertado!
 */
package extra5;

import Entidades.Mes;
import java.util.Scanner;

public class Extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Mes m = new Mes();
        m.setMesSecreto(m.getMes()[(int) (Math.random() * 12)]);
        String eleccion;

        System.out.println("Adivine el mes: ");
        System.out.println(m.getMesSecreto());
        eleccion = leer.next();
        while (!eleccion.equalsIgnoreCase(m.getMesSecreto())) {
            System.out.println("Erró. Ingrese otro mes: ");
            eleccion = leer.next();
        }
        System.out.println("Adivinaste! el mes era " + m.getMesSecreto());

    }

}
