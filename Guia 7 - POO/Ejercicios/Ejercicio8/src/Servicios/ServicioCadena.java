/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) 
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase 
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a 
través de los métodos set, se guardará la frase y la longitud de manera automática según 
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos: 

a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase 
ingresada. 
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con 
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la 
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class ServicioCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        Cadena frase = new Cadena();

        // Ingresamos la frase
        System.out.println("Ingrese una frase: ");
        frase.setFrase(leer.next().toLowerCase());

        // Guardamos la longitud 
        frase.setLongitud(frase.getFrase().length());

        return frase;
    }

    /**
     * Método mostrarVocales(), deberá contabilizar la cantidad de vocales que
     * tiene la frase ingresada.
     *
     * @param cadena
     * @return
     */
    public int mostrarVocales(Cadena cadena) {
        int vocales = 0;
        String posicion;

        for (int i = 0; i < cadena.getLongitud(); i++) {
            posicion = cadena.getFrase().substring(i, i + 1);
            if ("A".equalsIgnoreCase(posicion) || "E".equalsIgnoreCase(posicion) || "I".equalsIgnoreCase(posicion) || "O".equalsIgnoreCase(posicion) || "U".equalsIgnoreCase(posicion)) {
                vocales++;
            }
        }
        return vocales;
    }

    /**
     * Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
     * por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     *
     * @param cadenaEjemplo
     */
    public void invertirFrase(Cadena cadenaEjemplo) {
        for (int i = cadenaEjemplo.getLongitud() - 1; i >= 0; i--) {
            System.out.print(cadenaEjemplo.getFrase().substring(i, i + 1));
        }
        System.out.println("");
    }

    /**
     * Método vecesRepetido(String letra), recibirá un carácter ingresado por el
     * usuario y contabilizar cuántas veces se repite el carácter en la frase
     *
     * @param frase
     * @return
     */
    public int vecesRepetido(Cadena frase) {
        String letra;
        int contadorLetra = 0;

        System.out.println("¿Qué letra quiere ver cuántas veces está en la frase?");
        letra = leer.next();

        for (int i = 0; i < frase.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(frase.getFrase().substring(i, i + 1))) {
                contadorLetra++;
            }
        }
        return contadorLetra;
    }

    /**
     * Método compararLongitud(String frase), deberá comparar la longitud de la
     * frase que compone la clase con otra nueva frase ingresada por el usuario.
     *
     * @param objeto
     * @return
     */
    public boolean compararLongitud(Cadena objeto) {
        String frase;
        System.out.println("Ingrese una frase que desea comparar la longitud: ");
        frase = leer.next();
        System.out.println("¿Son iguales?");
        if (objeto.getLongitud() == frase.length()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método unirFrases(String frase), deberá unir la frase contenida en la
     * clase Cadena con una nueva frase ingresada por el usuario y mostrar la
     * frase resultante.
     *
     * @param objeto
     */
    public void unirFrases(Cadena objeto) {
        String fraseIngresada;
        System.out.println("Ingrese una frase que quiere unir a la frase del objeto.");
        fraseIngresada = leer.next().toLowerCase();
        
        System.out.println("La frase final quedaría de la forma: " + objeto.getFrase() + fraseIngresada + ".");
    }

    /**
     * Método reemplazar(String letra), deberá reemplazar todas las letras “a”
     * que se encuentren en la frase, por algún otro carácter seleccionado por
     * el usuario y mostrar la frase resultante.
     *
     * @param objeto
     */
    public void reemplazar(Cadena objeto) {
        String letra;

        System.out.println("Ingrese el caracter que quiere cambiar por la letra 'a' ");
        letra = leer.next().toLowerCase();

        objeto.setFrase(objeto.getFrase().replaceAll("a", letra));
        System.out.println("La frase quedaría de la forma: " + objeto.getFrase());
    }

    /**
     * Método contiene(String letra), deberá comprobar si la frase contiene una
     * letra que ingresa el usuario y devuelve verdadero si la contiene y falso
     * si no.
     *
     * @param objeto
     * @return 
     */
    public boolean contiene(Cadena objeto) {
        String letra;
        System.out.println("Ingrese la letra que quiere corroborar si está en la frase: ");
        letra = leer.next();
        
        System.out.println("¿La frase tiene la letra ingresada?");
        return objeto.getFrase().contains(letra);
    }
}
