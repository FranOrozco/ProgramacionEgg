package Entidad;

import java.util.Scanner;

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
public class Cuenta {

    Scanner leer = new Scanner(System.in);

    public int numeroCuenta;
    public long dniCliente;
    public int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dniCliente, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta() {
        System.out.println("Ingrese el número de cuenta: ");
        numeroCuenta = leer.nextInt();

        System.out.println("Ingrese el número de DNI: ");
        dniCliente = leer.nextLong();

        System.out.println("Ingrese el saldo actual: ");
        saldoActual = leer.nextInt();
    }

    public void ingresarDinero() {
        System.out.println("¿Cuánto dinero quiere ingresar?");
        saldoActual += leer.nextInt();
    }

    /*
    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la 
        restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
        saldo actual en 0. 
     */
    public void retirarDinero() {
        System.out.println("¿Cuánto dinero quiere retirar?");
        int retirar = leer.nextInt();
        if (retirar > saldoActual) {
            System.out.println("Su saldo es insuficiente para esta transacción.");
        } else {
            saldoActual -= retirar;
        }
    }

    /*
     f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
        usuario no saque más del 20%.
     */
    public void extraccionRapida() {
        System.out.println("¿Cuánto dinero quiere sacar? Solo puede sacar un %20 de su saldo.");
        int rapida = leer.nextInt();

        if (rapida > saldoActual * 0.2) {
            System.out.println("No puede retirar esta cantidad de dinero.");
        } else {
            saldoActual -= rapida;
        }
    }
    
    /*
    g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
    */
    public void consultarSaldo(){
        System.out.println("Su saldo actual es: " + saldoActual);
    }
    
    /*
    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    */
    public void consultarDatos(){
        System.out.println("Su numero de cuenta es: " + numeroCuenta);
        System.out.println("Su DNI es: " + dniCliente);
        System.out.println("Su saldo actual es: " + saldoActual);
    }
}
