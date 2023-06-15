package Entidad;

import java.util.Scanner;

/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Rectangulo {

    Scanner leer = new Scanner(System.in);
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {

        System.out.println("meté un numero pa la base: ");
        base = leer.nextInt();

        System.out.println("ahora poné la altura: ");
        altura = leer.nextInt();

    }

    public int calculoArea() {
        int area = base * altura;
        return area;
    }

    public int calculoPerimetro() {
        int perimetro = (base + altura) * 2;
        return perimetro;

    }

    public void dibujoRectangulo() {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 || j == 0 || i == base - 1 || j == altura - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

    }

}
