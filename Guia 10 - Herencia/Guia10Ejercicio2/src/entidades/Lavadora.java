package entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    protected int carga;
    protected Lavadora lavadora;
    protected Scanner leer;

    public Lavadora() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public Electrodomestico crearElectrodomestico() {
        lavadora = new Lavadora();
        System.out.println("Ingrese la carga maxima del Lavarropa: ");
        lavadora.setCarga(leer.nextInt());
        System.out.println("Ingrese el color. Puede ser blanco, negro, rojo, azul y gris.");
        lavadora.setColor(comprobarColor(leer.next()));
        System.out.println("Ingrese el consumo energético. Puede ser una letra de la A hasta la F.");
        char respuesta = leer.next().charAt(0);
        lavadora.comprobarConsumoEnergetico(respuesta);
        System.out.println("Ingrese el peso: ");
        lavadora.setPeso(leer.nextDouble());
        lavadora.precioFinal();
        return lavadora;

    }

    public void mostrarLavadora() {
        System.out.println(lavadora);
    }

    @Override
    public void precioFinal() {
        if (peso < 20) {
            setPrecio(precio + 100);
        } else if (peso < 50) {
            setPrecio(precio + 500);
        } else if (peso < 80) {
            setPrecio(precio + 800);
        } else if (peso > 80) {
            setPrecio(precio + 1000);
        }
        switch (getConsumoEnergetico()) {
            case 'A':
                setPrecio(getPrecio() + 1000);
                break;
            case 'B':
                setPrecio(getPrecio() + 800);
                break;
            case 'C':
                setPrecio(getPrecio() + 600);
                break;
            case 'D':
                setPrecio(getPrecio() + 500);
                break;
            case 'E':
                setPrecio(getPrecio() + 300);
                break;
            case 'F':
                setPrecio(getPrecio() + 100);
                break;
            default:
                break;
        }
        if (carga > 30) {
            setPrecio(getPrecio() + 500);
        }
    }

    @Override
    public String toString() {
        return "Lavadora: " + "\nCarga: " + carga + " Kg"
                + "\nColor: " + color
                + "\nConsumo Electrico: " + consumoEnergetico
                + "\nPeso: " + peso + " Kg"
                + "\nPrecio final: $" + precio;
    }

}
