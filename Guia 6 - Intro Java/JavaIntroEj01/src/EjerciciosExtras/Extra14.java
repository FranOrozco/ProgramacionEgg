package EjerciciosExtras;
import java.util.Scanner;
public class Extra14 {

    /*
    Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
    hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
    de hijos para averiguar la media de edad de los hijos de todas las familias.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidadFamilias, HijosPorFamilia, edadHijos;
        double promedio, sumatoria = 0, Hijos = 0; 

        System.out.print("Ingrese la cantidad de familias: ");
        cantidadFamilias = leer.nextInt();

        for (int i = 1; i <= cantidadFamilias; i++) {
            System.out.print("Ingrese cuántos hijos tiene la familia " + i + ": ");
            HijosPorFamilia = leer.nextInt();
            Hijos += HijosPorFamilia;
            for (int j = 1; j <= HijosPorFamilia; j++) {
                System.out.println("¿Cuántos años tiene el hijo " + j + "?" + " de la familia " + i + "?");
                edadHijos = leer.nextInt();
                sumatoria += edadHijos;
            }
            
            System.out.println("");

        }
        promedio = sumatoria / Hijos;
        System.out.println("El promedio de edad de hijos es de: " + promedio);
    }
}
