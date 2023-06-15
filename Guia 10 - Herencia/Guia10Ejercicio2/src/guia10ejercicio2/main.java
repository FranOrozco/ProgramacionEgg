package guia10ejercicio2;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();

        Lavadora lavadora1 = new Lavadora(); // 2500$
        Televisor televisor1 = new Televisor(); // 1900$
        Lavadora lavadora2 = new Lavadora(); // 3500$
        Televisor televisor2 = new Televisor(); // 

        electrodomesticos.add(lavadora1.crearElectrodomestico());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        electrodomesticos.add(televisor1.crearElectrodomestico());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        electrodomesticos.add(lavadora2.crearElectrodomestico());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        electrodomesticos.add(televisor2.crearElectrodomestico());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");

        int i = 0, j = 0;
        double sumatoria = 0;
        for (Electrodomestico aux : electrodomesticos) {
            if (aux instanceof Televisor) {
                Televisor object = (Televisor) aux;
                i++;
                System.out.println("El precio del televisor " + i + " es de $" + object.getPrecio());
                sumatoria = sumatoria + object.getPrecio();
            }
            if (aux instanceof Lavadora) {
                Lavadora object = (Lavadora) aux;
                j++;
                System.out.println("El precio de la lavadora " + j + " es de $" + object.getPrecio());
                sumatoria = sumatoria + object.getPrecio();
            }
        }
        System.out.println("El precio total de los electrodomésticos es de: " + sumatoria);

    }

}
