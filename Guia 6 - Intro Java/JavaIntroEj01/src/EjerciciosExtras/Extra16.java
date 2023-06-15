package EjerciciosExtras;
import java.util.Scanner;
public class Extra16 {
    /*
    Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
    las personas ingresadas por teclado e indique si son mayores o menores de edad.
    Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
    mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
    */
    public static void main(String[] args) {
        programita();
    }
    public static void programita(){
        Scanner leer = new Scanner(System.in);
        String nombre;
        String resp;
        int edad;
        do{
            System.out.print("Ingrese su nombre: ");
            nombre = leer.next();
            System.out.print("Ingrese su edad: ");
            edad = leer.nextInt();
            if (edad >= 18){
                System.out.println("Su nombre es: " + nombre +
                        "\nSu edad es " + edad + " y es mayor de edad");
            }else{
                System.out.println("Su nombre es: " + nombre +
                        "\nSu edad es: " + edad + " y es menor de edad");
            }
            System.out.println("¿Desea continuar si o no?");
            resp = leer.next();
        }while(!resp.equals("no"));
    }
}
