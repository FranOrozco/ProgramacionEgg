package servicios;

import entidades.Baraja;
import entidades.Carta;
import enumeradores.EnumPalos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Las operaciones que podrá realizar la baraja son:
 *
 * • barajar(): cambia de posición todas las cartas aleatoriamente.
 *
 * • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando
 * no haya más o se haya llegado al final, se indica al usuario que no hay más
 * cartas.
 *
 * • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
 *
 * • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
 * número de cartas. En caso de que haya menos cartas que las pedidas, no
 * devolveremos nada, pero debemos indicárselo al usuario.
 *
 * • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha
 * salido ninguna indicárselo al usuario
 *
 * • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se
 * saca una carta y luego se llama al método, este no mostrara esa primera
 * carta.
 *
 * @author Franco Orozco
 */
public class ServicioBaraja {

    private ServicioCarta sc;
    private ArrayList<Carta> baraja;
    private ArrayList<Carta> cartasMesa;
    private Scanner leer;

    public ServicioBaraja() {
        this.sc = new ServicioCarta();
        this.baraja = new ArrayList();
        this.cartasMesa = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void llenarMazo() {
        for (EnumPalos palo : EnumPalos.values()) {
            for (int i = 1; i < 13; i++) {
                Carta carta;
                if (i != 8 && i != 9) {
                    carta = sc.crearCarta(i, palo.name());
                    baraja.add(carta);
                }
            }
        }
    }

    /**
     * • mostrarBaraja():
     *
     * muestra todas las cartas hasta el final. Es decir, si se saca una carta y
     * luego se llama al método, este no mostrara esa primera carta.
     */
    public void mostrarBaraja() {
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
    }

    public void barajar() {
        Collections.shuffle(baraja);
    }

    /**
     * • siguienteCarta():
     *
     * devuelve la siguiente carta que está en la baraja, cuando no haya más o
     * se haya llegado al final, se indica al usuario que no hay más cartas.
     */
    public Carta siguienteCarta() {
        Carta carta = new Carta();

        carta = baraja.get(baraja.size() - 1);
        System.out.println("La carta mostrada es: " + carta);
        cartasMesa.add(carta);
        baraja.remove(carta);
        return carta;
    }

    /**
     * • cartasDisponibles():
     *
     * indica el número de cartas que aún se puede repartir.
     */
    public void cartasDisponible() {
        System.out.println(baraja.size());
    }

    /**
     * darCartas():
     *
     * dado un número de cartas que nos pidan, le devolveremos ese número de
     * cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
     * nada, pero debemos indicárselo al usuario.
     */
    public void darCartas() {
        System.out.println("¿Cuántas cartas quiere sacar?");
        int eleccion = leer.nextInt();

        if (eleccion > baraja.size()) {
            System.out.println("No puede sacar esa cantidad de cartas, al mazo le quedan " + baraja.size());
        } else {
            for (int i = 0; i < eleccion; i++) {
                siguienteCarta();
            }
        }
    }

    /**
     * • cartasMonton():
     *
     * mostramos aquellas cartas que ya han salido, si no ha salido ninguna
     * indicárselo al usuario
     */
    public void mostrarCartasMesa() {
        for (Carta carta : cartasMesa) {
            System.out.println(carta);
        }
    }

    // MENÚ
    public void menu() {
        int decision;
        do {
            System.out.println("-------------------------");

            System.out.println("¿Qué quiere hacer?");
            System.out.println("1. Rellenar mazo");
            System.out.println("2. Mostrar baraja");
            System.out.println("3. Barajar");
            System.out.println("4. Sacar una carta del mazo");
            System.out.println("5. Consultar cuántas cartas quedan en el mazo");
            System.out.println("6. Sacar múltiples cartas del mazo");
            System.out.println("7. Mostrar las cartas que están en la mesa");
            System.out.println("8. Salir");
            decision = leer.nextInt();
            while (decision < 1 && decision > 7) {
                System.out.println("Ingrese un número correcto, por favor. ");
                decision = leer.nextInt();
            }

            switch (decision) {
                case 1:
                    llenarMazo();
                    break;
                case 2:
                    mostrarBaraja();
                    break;
                case 3:
                    barajar();
                    break;
                case 4:
                    siguienteCarta();
                    break;
                case 5:
                    cartasDisponible();
                    break;
                case 6:
                    darCartas();
                    break;
                case 7:
                    mostrarCartasMesa();
                    break;
                case 8:
                    break;
            }
        } while (decision != 8);

    }

}
