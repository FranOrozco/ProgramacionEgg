package ejercicio2;

import Entidad.Circunferencia;
import java.util.Scanner;

/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Circunferencia coso = new Circunferencia();

        coso.crearCircunferencia();

        System.out.println("El area es: " + coso.area() + " metros.");
        System.out.println("El perimetro es: " + coso.perimetro() + " metros.");

    }

}
