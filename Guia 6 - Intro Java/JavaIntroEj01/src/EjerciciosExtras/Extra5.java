package EjerciciosExtras;

import java.util.Scanner;

public class Extra5 {
/*
Una obra social tiene tres clases de socios:
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
    todos los tipos de tratamientos.
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
    los mismos tratamientos que los socios del tipo A.
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
    tratamientos.
    o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
    real que represente el costo del tratamiento (previo al descuento) y determine el
    importe en efectivo a pagar por dicho socio.
*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String socio;
        double costoTratamiento;
        
        System.out.println("¿Qué clase de socio es usted?");
        System.out.println(" - A");
        System.out.println(" - B");
        System.out.println(" - C");
        do {
            socio = leer.next();
            socio = socio.toUpperCase();
            if (!"A".equals(socio) && !"B".equals(socio) && !"C".equals(socio)){
                System.out.println("Por favor ingrese un valor del menú.");
            }
        } while (!"A".equals(socio) && !"B".equals(socio) && !"C".equals(socio));
        
        System.out.print("¿Cuánto cuesta el tratamiento que quiere realizar? ");
        costoTratamiento = leer.nextDouble();
        
        calculador(socio, costoTratamiento);
    }
    
    public static void calculador(String tipoSocio, double costoTratamiento){
        switch(tipoSocio){
            case "A":
                System.out.println("Su tratamiento cuesta $" + costoTratamiento + " pero como es socio Tipo A, tiene un %50 de descuento.");
                System.out.println("Usted solamente tendrá que pagar $" + costoTratamiento * 0.5);
                break;
            case "B":
                System.out.println("Su tratamiento cuesta $" + costoTratamiento + " pero como es socio Tipo B, tiene un %35 de descuento.");
                System.out.println("Usted solamente tendrá que pagar $" + costoTratamiento * 0.65);
                break;
            case "C":
                System.out.println("Usted es socio Tipo C entonces no tiene ningún tipo de descuento.");
                System.out.println("Tendrá que pagar $" + costoTratamiento + ".");
                
        }
    }
    
}
