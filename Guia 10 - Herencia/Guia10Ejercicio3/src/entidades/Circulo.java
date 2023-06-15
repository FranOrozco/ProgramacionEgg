package entidades;

import interfaces.CalculosFormas;

public class Circulo implements CalculosFormas {

    /**
     * Área circulo: PI * radio ^ 2 /
     *
     * Perímetro circulo: PI * diámetro.
     *
     * @param radio
     * @param parametroRandom
     */
    @Override
    public void calcularArea(double radio, double parametroRandom) {
        Double calculo = Math.sqrt((PI * radio) * (PI * radio));
        System.out.println("El area del circulo con radio " + radio + " es de " + calculo + "m2.");
    }

    @Override
    public void calcularPerimetro(double diametro, double parametroRandom) {
        Double calculo = PI * diametro;
        System.out.println("El perímetro del circulo con diámetro " + diametro + " es de " + calculo + ".");
    }

}
