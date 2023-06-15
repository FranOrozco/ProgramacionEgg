package EjerciciosExtras;
import java.util.Scanner;
public class Extra15 {
    /*
    Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
    restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
    matemática y deben devolver sus resultados para imprimirlos en el main.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma, resta, multiplicacion;
        double division;

        String decision;
        boolean decisao = true;

        System.out.print("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = leer.nextInt();

        do {
            System.out.println("¿Qué quiere hacer con estos dos números?");
            System.out.println("A - Sumar");
            System.out.println("B - Restar");
            System.out.println("C - Multiplicar");
            System.out.println("D - Dividir");
            System.out.println("X - Salir");

            decision = leer.next();
            decision = decision.toUpperCase();

            switch (decision) {
                case "A":
                    System.out.println("La suma entre " + num1 + " y " + num2 + " es: " + sumador(num1, num2));
                    break;
                case "B":
                    System.out.println("La diferencia entre " + num1 + " y " + num2 + " es: " + diferencia(num1, num2));
                    break;
                case "C":
                    System.out.println("El producto entre " + num1 + " y " + num2 + " es: " + producto(num1, num2));
                    break;
                case "D":
                    System.out.println("La division entre " + num1 + " y " + num2 + " es: " + division(num1, num2));
                    break;
                default:
                    decisao = false;
            }
        } while (decisao);
    }

    public static int sumador(int numero1, int numero2) {
        int suma;
        suma = numero1 + numero2;
        return suma;
    }
    public static int diferencia(int numero1, int numero2) {
        int resta;
        resta = numero1 - numero2;
        return resta;
    }
    public static int producto(int numero1, int numero2) {
        int multiplicacion;
        multiplicacion = numero1 - numero2;
        return multiplicacion;
    }
    public static int division(int numero1, int numero2) {
        int div;
        div = numero1 - numero2;
        return div;
    }
}
