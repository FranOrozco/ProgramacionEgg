package EjerciciosExtras;

import java.util.Scanner;

public class Extra6 {
/*
    Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
    debajo de 1.60 mts. y el promedio de estaturas en general
*/
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int altura, sumaEnanos = 0, suma170 = 0, suma180 = 0, suma190 = 0, suma200 = 0;

    System.out.println("¿El promedio de cuántas personas desea cálcular?");
    int cantidad = leer.nextInt();

    for (int i = 1; i <= cantidad; i++) {
        System.out.println("¿Cuánto mide la persona " + i + "? (en centímetros)");
        altura = leer.nextInt();
        if (altura < 160) {
            sumaEnanos++;
        } else if (160 <= altura && altura < 170) {
            suma170++;
        } else if (170 <= altura && altura < 180) {
            suma180++;
        } else if (180 <= altura && altura < 190) {
            suma190++;
        } else if (190 <= altura && altura < 200) {
            suma200++;
        }
    }
    System.out.println("");
    System.out.println("El promedio de personas que miden menos de 160cm son el %" + (100 * sumaEnanos / cantidad) + ".");
    System.out.println("El promedio de personas que miden menos de 170cm pero más (o igual) que 160 son el %" + (100 * suma170 / cantidad) + ".");
    System.out.println("El promedio de personas que miden menos de 180cm pero más (o igual) que 170 son el %" + (100 * suma180 / cantidad) + ".");
    System.out.println("El promedio de personas que miden menos de 190cm pero más (o igual) que 180 son el %" + (100 * suma190 / cantidad) + ".");
    System.out.println("El promedio de personas que miden menos de 200cm pero más (o igual) que 190 son el %" + (100 * suma200 / cantidad) + ".");
}
    
}
