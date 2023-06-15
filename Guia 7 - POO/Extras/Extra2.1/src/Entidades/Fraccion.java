package Entidades;

/**
 * Crear una clase llamada fracción que contenga 4 atributos (denominador y
 * numerador de cada fracción). Crear la clase servicio que contenga métodos
 * para sumar, restar, multiplicar y dividir fracciones. Mostrar por pantalla un
 * menú de opciones para que el usuario decida que ver.
 */
public class Fraccion {

    private int numerador1;
    private int numerador2;
    private int denominador1;
    private int denominador2;
    private double fraccion1;
    private double fraccion2;

    public Fraccion() {
        this.numerador1 = (int) (Math.random() * 10);
        this.denominador1 = (int) (Math.random() * 10) + 1;
        this.numerador2 = (int) (Math.random() * 10);
        this.denominador2 = (int) (Math.random() * 10) + 1;
        this.fraccion1 = ((double) numerador1 / (double) denominador1);
        this.fraccion2 = ((double) numerador2 / (double) denominador2);
    }

    public Fraccion(int numerador1, int numerador2, int denominador1, int denominador2, double fraccion1, double fraccion2) {
        this.numerador1 = numerador1;
        this.numerador2 = numerador2;
        this.denominador1 = denominador1;
        this.denominador2 = denominador2;
        this.fraccion1 = fraccion1;
        this.fraccion2 = fraccion2;
    }

    public int getNumerador1() {
        return numerador1;
    }

    public void setNumerador1(int numerador1) {
        this.numerador1 = numerador1;
    }

    public int getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(int numerador2) {
        this.numerador2 = numerador2;
    }

    public int getDenominador1() {
        return denominador1;
    }

    public void setDenominador1(int denominador1) {
        this.denominador1 = denominador1;
    }

    public int getDenominador2() {
        return denominador2;
    }

    public void setDenominador2(int denominador2) {
        this.denominador2 = denominador2;
    }

    public double getFraccion1() {
        return fraccion1;
    }

    public void setFraccion1(double fraccion1) {
        this.fraccion1 = fraccion1;
    }

    public double getFraccion2() {
        return fraccion2;
    }

    public void setFraccion2(double fraccion2) {
        this.fraccion2 = fraccion2;
    }

}
