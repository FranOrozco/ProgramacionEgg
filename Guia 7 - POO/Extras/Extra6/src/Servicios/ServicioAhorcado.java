/**
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
 * atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
 * jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
 * parámetros que sean necesarios:
 *
 * • Constructores, tanto el vacío como el parametrizado.
 *
 * • Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
 * la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
 * Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
 * palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
 * valor que ingresó el usuario y encontradas en 0.
 *
 * • Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
 * buscar como se usa el vector.length.
 *
 * • Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
 * letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 *
 * • Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
 * cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
 * devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
 * busque una letra que no esté, se le restará uno a sus oportunidades.
 *
 * • Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 *
 * • Método juego(): el método juego se encargará de llamar todos los métodos
 * previamente mencionados e informará cuando el usuario descubra toda la palabra o
 * se quede sin intentos. Este método se llamará en el main.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        Ahorcado a = new Ahorcado();
        System.out.println("Ingrese la palabra: ");
        a.setPalabra(leer.next().toUpperCase());

        a.setLongitud(a.getPalabra().length());
        String[] v = new String[a.getLongitud()];
        for (int i = 0; i < a.getLongitud(); i++) {
            v[i] = a.getPalabra().substring(i, i + 1);
        }
        a.setPalabraVector(v);
        a.setFaltantes(a.getLongitud());
        a.setEncontradas(0);
        
        System.out.println("Ingrese la cantidad de intentos: ");
        a.setIntentos(leer.nextInt());

        return a;
    }

    /**
     * Método longitud(): muestra la longitud de la palabra que se debe
     * encontrar. Nota: buscar como se usa el vector.length.
     *
     * @param objeto
     */
    public void longitud(Ahorcado objeto) {
        System.out.println("La palabra tiene: " + objeto.getLongitud() + " letras.");
    }

    /**
     * Método buscar(letra): este método recibe una letra dada por el usuario y
     * busca sila letra ingresada es parte de la palabra o no. También informará
     * si la letra estaba o no.
     *
     * @param letraBuscar
     * @param objeto
     */
    public void buscar(String letraBuscar, Ahorcado objeto) {
        int contador = 0;

        for (int i = 0; i < objeto.getLongitud(); i++) {
            if (objeto.getPalabraVector()[i].equalsIgnoreCase(letraBuscar)) {
                contador++;
            } else {
            }
        }

        if (contador == 1) {
            System.out.println("La letra está UNA sola vez en la palabra.");
            objeto.setEncontradas(objeto.getEncontradas() + 1);
            objeto.setFaltantes(objeto.getFaltantes() - 1);
        } else if (contador > 1) {
            System.out.println("La letra se encuentra " + contador + " veces.");
            objeto.setEncontradas(objeto.getEncontradas() + contador);
            objeto.setFaltantes(objeto.getFaltantes() - contador);
        } else {
            System.out.println("La letra NO se encuentra en la palabra.");
            objeto.setIntentos(objeto.getIntentos() - 1);
        }

    }

    /**
     * Método encontradas(letra): que reciba una letra ingresada por el usuario
     * y muestre cuantas letras han sido encontradas y cuantas le faltan. Este
     * método además deberá devolver true si la letra estaba y false si la letra
     * no estaba, ya que, cada vez que se busque una letra que no esté, se le
     * restará uno a sus oportunidades.
     *
     * @param letra
     * @param objeto
     */
    public void encontradas(String letra, Ahorcado objeto) {
        System.out.println("Se encontraron " + objeto.getEncontradas() + " letras.\nFaltan " + objeto.getFaltantes() + " letras.");
    }

    /**
     * Método intentos(): para mostrar cuantas oportunidades le queda al
     * jugador.
     *
     * @param objeto
     */
    public void intentos(Ahorcado objeto) {
        System.out.println("Le quedan " + objeto.getIntentos() + " intentos.");
    }

    /**
     * Método juego(): el método juego se encargará de llamar todos los métodos
     * previamente mencionados e informará cuando el usuario descubra toda la
     * palabra o se quede sin intentos. Este método se llamará en el main.
     */
    public void juego() {
        Ahorcado objeto = crearJuego();
        String letra;

        longitud(objeto);

        do {
            System.out.println("Ingrese una letra: ");
            letra = leer.next();
            while (letra.length() != 1) {
                System.out.println("Ingrese una SOLA letra");
                letra = leer.next();
            }

            buscar(letra, objeto);
            encontradas(letra, objeto);
            intentos(objeto);
            
            if (objeto.getEncontradas() == objeto.getLongitud()) {
                System.out.println("Felicidades! has ganao' \nLa palabra era " + objeto.getPalabra());
                break;
            } else if (objeto.getIntentos() == 0) {
                System.out.println("Lo siento, perdiste. La palabra era " + objeto.getPalabra());
            }

        } while (objeto.getIntentos() > 0);
    }
}
