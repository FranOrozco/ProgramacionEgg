package ejercicio6;

import Entidades.Cafetera;
import java.util.Scanner;

public class Ejercicio6 {

    /*PROBLEMA
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
     */
    public static void main(String[] args) {
        int decision, taza, cafe;
        Scanner leer = new Scanner(System.in);
        Cafetera c1 = new Cafetera();

        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1 - Llenar la cafetera");
            System.out.println("2 - Servir taza");
            System.out.println("3 - Vaciar cafetera");
            System.out.println("4 - Agregar café");
            System.out.println("5 - Salir");
            decision = leer.nextInt();
            switch (decision) {
                case 1:
                    c1.llenarCafetera();
                    break;
                case 2:
                    c1.servirTaza();
                    break;
                case 3:
                    c1.vaciarCafetera();
                    break;
                case 4:
                    c1.agregarCafe();
                    break;
                case 5: 
                    break;
            }
        } while (decision != 5);
    }

}
