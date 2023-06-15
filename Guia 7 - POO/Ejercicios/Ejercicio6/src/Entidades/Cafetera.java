package Entidades;

import java.util.Scanner;

/*
 * PROBLEMA Programa Nespresso. Desarrolle una clase Cafetera con los atributos
 * capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
 * cantidadActual (la cantidad actual de café que hay en la cafetera).
 * Implemente, al menos, los siguientes métodos: 
 * • Constructor predeterminado o vacío 
 * • Constructor con la capacidad máxima y la cantidad actual 
 * • Métodos
 * getters y setters. 
 * • Método llenarCafetera(): hace que la cantidad actual sea
 * igual a la capacidad máxima. 
 * • Método servirTaza(int): se pide el tamaño de
 * una taza vacía, el método recibe el tamaño de la taza y simula la acción de
 * servir la taza con la capacidad indicada. Si la cantidad actual de café “no
 * alcanza” para llenar la taza, se sirve lo que quede. El método le informará
 * al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó
 * la taza. 
 * • Método vaciarCafetera(): pone la cantidad de café actual en cero.
 * • Método agregarCafe(int): se le pide al usuario una cantidad de café, el
 * método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class Cafetera {

    Scanner leer = new Scanner(System.in);
    public int capacidadMaxima;
    public int cantidadActual;

    // Constructor vacío
    public Cafetera() {
        capacidadMaxima = 1000;
    }

    // Constructor con Parámetros
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    // Gett y Sett
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    // Método llenarCafetera()
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    /**
     * Método servirTaza(int): se pide el tamaño de una taza vacía, el método
     * recibe el tamaño de la taza y simula la acción de servir la taza con la
     * capacidad indicada. Si la cantidad actual de café “no alcanza” para
     * llenar la taza, se sirve lo que quede. El método le informará al usuario
     * si se llenó o no la taza, y de no haberse llenado en cuanto quedó la
     * taza.
     *
     * @param cantidadTaza
     */
    public void servirTaza() {
        System.out.println("¿De cuántos ml es la taza?");
        int cantidadTaza = leer.nextInt();
        if (cantidadActual < cantidadTaza) {
            cantidadTaza = cantidadActual;
            System.out.println("No se pudo llenar la taza. Solo se le agregaron " + cantidadActual + " de café.");

            cantidadActual = 0;
        } else {
            cantidadActual -= cantidadTaza;
            cantidadTaza = cantidadActual;

            System.out.println("Se llenó la taza con café.");
        }
    }

    // Método vaciarCafetera()
    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    /**
     * Método agregarCafe(int): se le pide al usuario una cantidad de café, el
     * método lo recibe y se añade a la cafetera la cantidad de café indicada.
     *
     * @param cantidadAgregar
     */
    public void agregarCafe() {
        System.out.println("Indique cuántos ml de café quiere agregar la cafetera: ");
        int cantidadAgregar = leer.nextInt();
        if (cantidadAgregar < capacidadMaxima) {
            cantidadActual = cantidadAgregar;
        }
    }
}
