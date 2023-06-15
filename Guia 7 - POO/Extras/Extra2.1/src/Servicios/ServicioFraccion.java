package Servicios;

import Entidades.Fraccion;

/**
 * Crear una clase llamada fracción que contenga 4 atributos (denominador y
 * numerador de cada fracción). Crear la clase servicio que contenga métodos
 * para sumar, restar, multiplicar y dividir fracciones. Mostrar por pantalla un
 * menú de opciones para que el usuario decida que ver.
 */
public class ServicioFraccion {

    public Fraccion crearFraccion() {
        Fraccion f = new Fraccion();
        return f;
    }

    public void sumar(Fraccion fraccion) {
        double resultado = fraccion.getFraccion1() + fraccion.getFraccion2();
        System.out.println("La suma entre (" + fraccion.getNumerador1() + " / "
                + fraccion.getDenominador1() + ") + (" + fraccion.getNumerador2() + " / " + fraccion.getDenominador2() + ") da como resultado: " + (double) resultado);
    }

    public void restar(Fraccion fraccion) {
        double resultado = fraccion.getFraccion1() - fraccion.getFraccion2();
        System.out.println("La resta entre (" + fraccion.getNumerador1() + " / "
                + fraccion.getDenominador1() + ") - (" + fraccion.getNumerador2() + " / " + fraccion.getDenominador2() + ") da como resultado: " + (double) resultado);
    }

    public void multiplicacion(Fraccion fraccion) {
        double resultado = fraccion.getFraccion1() * fraccion.getFraccion2();
        System.out.println("La multiplicación entre (" + fraccion.getNumerador1() + " / "
                + fraccion.getDenominador1() + ") * (" + fraccion.getNumerador2() + " / " + fraccion.getDenominador2() + ") da como resultado: " + (double) resultado);
    }

    public void division(Fraccion fraccion) {
        double resultado = fraccion.getFraccion1() / fraccion.getFraccion2();
        System.out.println("La multiplicación entre (" + fraccion.getNumerador1() + " / "
                + fraccion.getDenominador1() + ") / (" + fraccion.getNumerador2() + " / " + fraccion.getDenominador2() + ") da como resultado: " + (double) resultado);
    }
}
