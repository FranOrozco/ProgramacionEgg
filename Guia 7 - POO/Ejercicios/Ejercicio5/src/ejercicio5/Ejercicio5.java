package ejercicio5;

import Entidad.Cuenta;
import java.util.Scanner;

public class Ejercicio5 {
    /* 
    Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
    numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
    operaciones asociadas a dicha clase son: 
            a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
            b) Agregar los métodos getters y setters correspondientes 
            c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
            d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
            y se la sumara a saldo actual.
            e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la 
            restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
            saldo actual en 0. 
            f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
            usuario no saque más del 20%.
            g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
            h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Cuenta pobre = new Cuenta();
        
        pobre.crearCuenta();
        
        int eleccion;
        do {  
            System.out.println("");
            System.out.println("¿Qué acción quiere realizar?");
            System.out.println("1 - Ingresar dinero");
            System.out.println("2 - Retirar dinero");
            System.out.println("3 - Extracción rápida");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Consultar datos de la cuenta");
            System.out.println("6 - Salir");
            eleccion = leer.nextInt();
            switch (eleccion) { 
                case 1:
                    pobre.ingresarDinero();
                    break;
                case 2:
                    pobre.retirarDinero();
                    break;
                case 3:
                    pobre.extraccionRapida();
                    break;
                case 4:
                    pobre.consultarSaldo();
                    break;
                case 5: 
                    pobre.consultarDatos();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("No es una opción válida.");
                    break;
            }
        } while (eleccion != 6);
    }
    
}
