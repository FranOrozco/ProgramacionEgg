
import Entidades.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1: Se requiere un programa que lea y guarde países, y para evitar que se
 * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
 * bucle, se guardará el país en el conjunto y después se le preguntará al
 * usuario si quiere guardar otro país o si quiere salir, si decide salir, se
 * mostrará todos los países guardados en el conjunto. (Recordemos hacer los
 * servicios en la clase correspondiente)
 *
 * 2: Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto
 * recordar cómo se ordena un conjunto.
 *
 * 3: Por último, al usuario se le pedirá un país y se recorrerá el conjunto con
 * un Iterator, se buscará el país en el conjunto y si está en el conjunto se
 * eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el
 * país no se encuentra en el conjunto se le informará al usuario.
 *
 */
public class main5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        TreeSet<Pais> setPaises = new TreeSet();
        String decision;

        // Ingreso países y los guardo en un TreeSet
        do {
            Pais pais = new Pais();
            System.out.println("Ingrese el nombre de un país: ");
            pais.setNombre(leer.next());
            setPaises.add(pais);

            System.out.println("¿Quiere agregar otro país? s/n ");
            decision = leer.next();
        } while (decision.equalsIgnoreCase("s"));

        ArrayList<Pais> listaPaises = new ArrayList(setPaises);

        // Muestro los países ingresados
        for (Pais aux : listaPaises) {
            System.out.println(aux);
        }

        System.out.println("¿Desea eliminar un país del conjunto?");
        decision = leer.next();

        Iterator<Pais> it = listaPaises.iterator();
        Pais aux;
        boolean noEsta = false;
        while (it.hasNext()) {
            aux = it.next();
            if (aux.getNombre().equalsIgnoreCase(decision)) {
                it.remove();
                noEsta = true;
            }
        }

        if (!noEsta) {
            System.out.println("El país ingresado no está en la lista");
        }

        System.out.println("La nueva lista quedaría de la siguiente manera: ");
        for (Pais listaPaise : listaPaises) {
            System.out.println(listaPaise);
        }

    }

}
