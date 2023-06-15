/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color, 
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
 */
package entidades;

import java.util.Scanner;

public abstract class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
        this.precio = 1000d;
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    /*
Los métodos a implementar son:
    • Métodos getters y setters de todos los atributos.
    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, 
    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el 
    objeto y no será visible.
    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, 
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son 
    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en 
    minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
    // Getters y Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Método comprobarConsumoEnergetico(char letra):
     *
     * comprueba que la letra es correcta, sino es correcta usara la letra F por
     * defecto. Este método se debe invocar al crear el objeto y no será
     * visible.
     *
     * @param letra
     */
    public char comprobarConsumoEnergetico(char letra) {
        switch (letra) {
            case 'A':
            case 'a':
                letra = 'A';
                break;
            case 'b':
            case 'B':
                letra = 'B';
                break;
            case 'c':
            case 'C':
                letra = 'C';
                break;
            case 'd':
            case 'D':
                letra = 'D';
                break;
            case 'e':
            case 'E':
                letra = 'E';
                break;
            case 'f':
            case 'F':
                letra = 'F';
                break;
            default:
                letra = 'F';
                break;
        }
        setConsumoEnergetico(letra);
        return letra;
    }

    /**
     * Método comprobarColor(String color):
     *
     * comprueba que el color es correcto, y si no lo es, usa el color blanco
     * por defecto. Los colores disponibles para los electrodomésticos son
     * blanco, negro, rojo, azul y gris. No importa si el nombre está en
     * mayúsculas o en minúsculas. Este método se invocará al crear el objeto y
     * no será visible.
     *
     * @param color
     * @return
     */
    public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("gris") || color.equalsIgnoreCase("blanco")
                || color.equalsIgnoreCase("negro")
                || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul")) {
            setColor(color);
        } else {
            color = "blanco";
            setColor(color);
        }
        return color;
    }

    public abstract Electrodomestico crearElectrodomestico();

    public abstract void precioFinal();

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
