/**
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
 * y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
 * que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
 * través de los métodos set, se guardará la frase y la longitud de manera automática según
 * la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
 * a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
 * ingresada.
 * b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
 * ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
 * c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
 * contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
 * d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
 * e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
 * compone la clase con otra nueva frase ingresada por el usuario.
 * f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
 * una nueva frase ingresada por el usuario y mostrar la frase resultante.
 * g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
 * encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
 * frase resultante.
 * h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
 * ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class ServicioCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena frase = new Cadena();

    public Cadena crearFrase() {
        Cadena frase = new Cadena();
        System.out.println("Ingrese la frase:");
        frase.setFrase(leer.next());
        frase.setLongitud(frase.getFrase().length());
        return frase;
    }

    public void mostrarVocales(Cadena frase) {
        int cantVocales = 0;
        String vocales = "aeiou";

        for (int i = 0; i < frase.getLongitud(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (frase.getFrase().charAt(i) == vocales.charAt(j)) {
                    cantVocales++;
                }
            }
        }
        System.out.println("La frase tiene " + cantVocales + " vocales.");
    }

    /**
     * b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
     * por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     *
     * @param frase
     */
    public void invertirFrase(Cadena frase) {
        StringBuilder inversa = new StringBuilder(frase.getFrase());
        System.out.println("Frase invertida: " + inversa.reverse().toString());
    }

    /**
     * Método vecesRepetido(String letra), recibirá un carácter ingresado por el
     * usuario y contabilizar cuántas veces se repite el carácter en la frase
     *
     * @param frase
     */
    public void vecesRepetido(Cadena frase) {
        int contador = 0;
        String letra = "";

        System.out.println("Ingrese una letra para verificar cuántas veces está en la frase: ");
        letra = leer.next();

        for (int i = 0; i < frase.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(frase.getFrase().substring(i, i + 1))) {
                contador++;
            }
        }

        System.out.println("La letra '" + letra + "' está " + contador + " vez/veces");
    }

    /**
     * Método compararLongitud(String frase), deberá comparar la longitud de la
     * frase que compone la clase con otra nueva frase ingresada por el usuario.
     *
     * @param frase
     */
    public void compararLongitud(Cadena frase) {
        System.out.println("Ingrese una nueva frase para comparar la longitud con la frase original: ");
        String fraseNueva = leer.next();

        System.out.println("¿Las frases tienen la misma longitud?");
        if (fraseNueva.length() == frase.getLongitud()) {
            System.out.println("Si.");
        } else {
            System.out.println("No.");
        }
    }

    /**
     * Método unirFrases(String frase), deberá unir la frase contenida en la
     * clase Cadena con una nueva frase ingresada por el usuario y mostrar la
     * frase resultante.
     */
    public void unirFrases(Cadena frase) {
        System.out.println("Ingrese una frase para concatenar con su frase original: ");
        String fraseNueva = leer.next();

        String fraseCompleta = frase.getFrase().concat(" ").concat(fraseNueva);

        System.out.println("La frase nueva sería: " + fraseCompleta);
    }

    /**
     * Método reemplazar(String letra), deberá reemplazar todas las letras “a”
     * que se encuentren en la frase, por algún otro carácter seleccionado por
     * el usuario y mostrar la frase resultante.
     */
    public void reemplazar(Cadena frase) {
        System.out.println("Ingrese un caracter que quiere cambiar por la letra A de la frase original: ");
        String caracter = leer.next();

        frase.setFrase(frase.getFrase().toLowerCase());
        String nuevaFrase = frase.getFrase().replaceAll("a", caracter);

        System.out.println("La frase nueva con el caracter reemplazado: " + nuevaFrase);
    }

    /**
     * Método contiene(String letra), deberá comprobar si la frase contiene una
     * letra que ingresa el usuario y devuelve verdadero si la contiene y falso
     * si no.
     *
     * @param frase
     */
    public void contiene(Cadena frase) {
        System.out.println("Ingrese una letra que quiere corroborar si está en la frase original: ");
        String letra = leer.next();
        boolean eso = false;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().charAt(i) == letra.charAt(0)) {
                eso = true;
                break;
            } else {
                eso = false;
            }
        }
        System.out.println(eso);
    }
}
