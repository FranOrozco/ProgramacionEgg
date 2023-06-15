/**
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
 * ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
 * Hay que insertar estos 3 valores para construir el objeto a través de un método
 * constructor. Luego, las operaciones que se podrán realizar son las siguientes:
 * • Método getDiscriminante(): devuelve el valor del discriminante (double). El
 * discriminante tiene la siguiente formula: (b^2)-4*a*c
 * • Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
 * que esto ocurra, el discriminante debe ser mayor o igual que 0.
 * • Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
 * que esto ocurra, el discriminante debe ser igual que 0.
 * • Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
 * soluciones.
 * • Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
 * en el caso en que se tenga una única solución posible.
 * • Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
 * pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
 * obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
 * de no existir solución, se mostrará un mensaje.
 *
 * Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b  *
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class ServicioRaices {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raices rellenarCoeficientes() {
        Raices raiz = new Raices();
        System.out.println("Ingrese a");
        raiz.setA(leer.nextInt());
        System.out.println("Ingrese b");
        raiz.setB(leer.nextInt());
        System.out.println("Ingrese c");
        raiz.setC(leer.nextInt());

        double discriminante;
        discriminante = Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC());
        raiz.setDiscriminante(discriminante);

        return raiz;
    }

    /**
     * Método tieneRaices(): devuelve un booleano indicando si tiene dos
     * soluciones, para que esto ocurra, el discriminante debe ser mayor o igual
     * que 0.
     *
     * @param obj
     * @return
     */
    public boolean tieneRaices(Raices obj) {
        return (obj.getDiscriminante() >= 0);
    }

    /**
     * Método tieneRaiz(): devuelve un booleano indicando si tiene una única
     * solución, para que esto ocurra, el discriminante debe ser igual que 0.
     *
     * @param obj
     * @return
     */
    public boolean tieneRaiz(Raices obj) {
        return (obj.getDiscriminante() == 0);
    }

    /**
     * Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime
     * las 2 posibles soluciones.
     *
     * @param obj
     */
    public void obtenerRaices(Raices obj) {
        if (tieneRaices(obj)) {
            //  (-b±√((b^2)-(4*a*c)))/(2*a)
            double raiz1 = (-obj.getB() + (Math.sqrt(((obj.getB() * obj.getB()) - (4 * obj.getA() * obj.getC())))) / (2 * obj.getA()));
            double raiz2 = (-obj.getB() - (Math.sqrt(((obj.getB() * obj.getB()) - (4 * obj.getA() * obj.getC())))) / (2 * obj.getA()));
            System.out.println("Una solución es: " + raiz1 + "\nY la otra solución es: " + raiz2);
        } else {

        }
    }

    /**
     * Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una
     * única raíz. Es en el caso en que se tenga una única solución posible.
     *
     * @param obj
     */
    public void obtenerRaiz(Raices obj) {
        if (tieneRaiz(obj)) {
            double raiz = (-obj.getB() + (Math.sqrt(((obj.getB() * obj.getB()) - (4 * obj.getA() * obj.getC())))) / (2 * obj.getA()));
            System.out.println("La solucion es: " + raiz);
        }
    }

    /**
     * Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y
     * mostrará por pantalla las posibles soluciones que tiene nuestra ecuación
     * con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan
     * nuestros métodos y en caso de no existir solución, se mostrará un
     * mensaje.
     *
     * @param obj
     */
    public void calcular(Raices obj) {
        if (tieneRaices(obj)) {
            if (tieneRaiz(obj)) {
                obtenerRaiz(obj);
            } else {
                obtenerRaices(obj);
            }
        } else {
            System.out.println("No tiene raíz.");
        }

    }
}
