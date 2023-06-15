/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioDePrueba;

import java.util.Scanner;

/**
 *
 * @author Franco Orozco
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        int cont = 0;
        int suma = 0;
        
        System.out.println("Ingrese 20 números. Éstos serán sumados. Si ingresa 0, no se pedirán más números.");
        
        do {
            num = leer.nextInt();
            suma += num;
            cont += 1;
            if (cont == 20){
                break;
            }
        } while (num != 0);
        
        if (num == 0){
            System.out.println("Se capturó el número 0.");
        }
        
        System.out.println("La suma total de los números ingresados es: " + suma);
        
    }

}
