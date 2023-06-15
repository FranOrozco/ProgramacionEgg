package EjerciciosExtras;

import java.util.Scanner;

public class Extra4 {
    /*
    Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
    equivalente en romano.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número del 1 al 10 y el programá devolverá su valor en Romano");
        
        do {
            num = leer.nextInt();
            if (num < 0 || num > 10){
                System.out.println("Por favor ingrese un valor entre 1 y 10");
            }
        } while (num < 0 || num > 10);
        enteroARomano(num);
        
    }
    public static void enteroARomano (int numeroAConvertir){
        switch (numeroAConvertir){
            case 1:
                System.out.println("El número " + numeroAConvertir + " en Romano es: I");
                break;
            case 2:
                System.out.println("El número " + numeroAConvertir + " en Romano es: II");
                break;
            case 3:
                System.out.println("El número " + numeroAConvertir + " en Romano es: III");
                break;
            case 4:
                System.out.println("El número " + numeroAConvertir + " en Romano es: IV");
                break;
            case 5:
                System.out.println("El número " + numeroAConvertir + " en Romano es: V");
                break;
            case 6:
                System.out.println("El número " + numeroAConvertir + " en Romano es: VI");
                break;
            case 7:
                System.out.println("El número " + numeroAConvertir + " en Romano es: VII");
                break;
            case 8:
                System.out.println("El número " + numeroAConvertir + " en Romano es: VIII");
                break;
            case 9:
                System.out.println("El número " + numeroAConvertir + " en Romano es: IX");
                break;
            case 10:
                System.out.println("El número " + numeroAConvertir + " en Romano es: X");
                break;
        }
    }
}
