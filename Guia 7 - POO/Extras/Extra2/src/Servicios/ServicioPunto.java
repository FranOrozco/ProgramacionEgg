/**
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
 * atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
 * usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
 * los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
 * que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
 * calcular la distancia entre dos puntos consulte el siguiente link:
 */
package Servicios;

import Entidades.Punto;
import java.util.Scanner;

public class ServicioPunto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // Método para crear objeto
    public Punto crearPunto() {
        Punto p1 = new Punto();
        System.out.print("Ingrese la coordenada x del punto 1: ");
        p1.setX1(leer.nextInt());
        System.out.print("Ingrese la coordenada y del punto 1: ");
        p1.setY1(leer.nextInt());
        System.out.print("Ingrese la coordenada x del punto 2: ");
        p1.setX2(leer.nextInt());
        System.out.print("Ingrese la coordenada y del punto 2: ");
        p1.setY2(leer.nextInt());

        return p1;
    }

    public void calcularDistancia(Punto p1) {
        double resultado;
        // Calculo de la distancia entre dos puntos
        resultado = Math.sqrt(Math.pow((p1.getX2() - p1.getX1()), 2) + Math.pow((p1.getY2() - p1.getY1()), 2));

        System.out.println("La distancia entre ambos puntos es: " + resultado);
    }

}
