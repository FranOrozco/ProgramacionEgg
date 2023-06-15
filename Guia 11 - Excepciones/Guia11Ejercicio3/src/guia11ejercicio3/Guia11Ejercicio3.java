package guia11ejercicio3;

import entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Guia11Ejercicio3 {

    /**
     * Defina una clase llamada DivisionNumero. En el método main utilice un
     * Scanner para leer dos números en forma de cadena. A continuación, utilice
     * el método parseInt() de la clase Integer, para convertir las cadenas al
     * tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
     * una división con los dos numeros y mostrar el resultado.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {
            System.out.println("Ingrese el numero A");
            String numeroA = leer.next();
            System.out.println("Ingrese el numero B");
            String numeroB = leer.next();

            DivisionNumero division = new DivisionNumero();

            division.setNumero1(Integer.parseInt(numeroA));
            division.setNumero2(Integer.parseInt(numeroB));
            System.out.println("La división entre " + numeroA + " y " + numeroB + ""
                    + " es " + division.getNumero1() / division.getNumero2());

        } catch (ArithmeticException a) {
            System.out.println("Error. " + a.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error. " + e.getMessage());
        } catch (NumberFormatException n) {
            System.out.println("Error. Uno de los números ingresados no se pudo convertir en un número. " + n.getMessage());
        } finally {

        }
    }
}
