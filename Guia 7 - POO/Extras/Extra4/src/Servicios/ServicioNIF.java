/**
 * Dígito Verificador.
 * Crear una clase NIF que se usará para mantener DNIs con su
 * correspondiente letra (NIF).
 * Los atributos serán el número de DNI (entero largo) y la letra
 * (String o char) que le corresponde. Dispondrá de los siguientes métodos:
 * • Métodos getters y setters para el número de DNI y la letra.
 * • Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
 * corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
 * resultado del calculo.
 * • Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
 * mayúscula; por ejemplo: 00395469-F).
 * La letra correspondiente al dígito verificador se calculará a traves de un método que
 * funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
 * de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
 * un array (vector) de caracteres la posición que corresponda al resto de la división para
 * obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package Servicios;

import Entidades.NIFs;
import java.util.Scanner;

public class ServicioNIF {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
     * letra que le corresponderá. Una vez calculado, le asigna la letra que le
     * corresponde según el resultado del calculo.
     *
     * @return
     */
    public NIFs crearNif() {
        NIFs objeto = new NIFs();
        System.out.println("Ingrese el número de DNI: ");
        objeto.setNumeroDNI(leer.nextLong());
        
        double posicion = objeto.getNumeroDNI()%23;
        String letras = "trwagmyfpdxbnjzsqvhlcke";
        objeto.setLetra(letras.substring((int) posicion, (int)posicion + 1));
        
//        String[] vectorLetras = new String[letras.length()];
//        for (int i = 0; i < letras.length(); i++) {
//            vectorLetras[i] = letras.substring(i, i + 1).toUpperCase();
//        }
        
        return objeto;
    }

    /**
     * Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion
     * y la letra en mayúscula; por ejemplo: 00395469-F).
     * @param objeto
     */
    public void mostrar(NIFs objeto){
        System.out.println("Su NIF es: " + objeto.getNumeroDNI() + "-" + objeto.getLetra().toUpperCase());
    }
}
