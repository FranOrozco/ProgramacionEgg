package entidades;

import interfaces.CalculosFormas;

public class Rectangulo implements CalculosFormas {

    /**
     * Área rectángulo: base * altura
     *
     * Perímetro rectángulo: (base + altura) * 2.
     *
     * @param base
     * @param altura
     */
    @Override
    public void calcularArea(double base, double altura) {
        double calculo = base * altura;
        System.out.println("El area del circulo con base " + base + " y altura " + altura + " es de " + calculo + ".");
    }

    @Override
    public void calcularPerimetro(double base, double altura) {
        double calculo = (base + altura) * 2;
        System.out.println("El perímetro del círculo con base " + base + " y altura " + altura + " es de " + calculo + ".");

    }

}
