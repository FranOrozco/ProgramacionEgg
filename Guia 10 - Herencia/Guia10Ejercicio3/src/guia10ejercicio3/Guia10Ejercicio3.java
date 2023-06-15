package guia10ejercicio3;

import entidades.Circulo;
import entidades.Rectangulo;
import java.util.Scanner;

public class Guia10Ejercicio3 {

    /**
     * Se plantea desarrollar un programa que nos permita calcular el área y el
     * perímetro de formas geométricas, en este caso un círculo y un rectángulo.
     * Ya que este cálculo se va a repetir en las dos formas geométricas, vamos
     * a crear una Interfaz, llamada calculosFormas que tendrá, los dos métodos
     * para calcular el área, el perímetro y el valor de PI como constante.
     * Desarrollar el ejercicio para que las formas implementen los métodos de
     * la interfaz y se calcule el área y el perímetro de los dos. En el main se
     * crearán las formas y se mostrará el resultado final.
     *
     * Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
     *
     * Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) *
     * 2.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Ingrese el radio del círculo que quiere calcular: ");
        double radio = leer.nextDouble();
        circulo.calcularArea(radio, 0d);

        System.out.println("Ingrese el perímetro del circulo: ");
        double perimetro = leer.nextDouble();
        circulo.calcularPerimetro(perimetro, 0d);

        System.out.println("Ingrese la base del rectángulo que quiere calcular: ");
        double base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectángulo: ");
        double altura = leer.nextDouble();
        rectangulo.calcularArea(base, altura);
        rectangulo.calcularPerimetro(base, altura);
    }

}
