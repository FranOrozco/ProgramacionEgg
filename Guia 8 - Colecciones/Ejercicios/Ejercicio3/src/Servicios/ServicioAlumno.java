package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas. En el servicio de Alumno deberemos
 * tener un bucle que crea un objeto Alumno. Se pide toda la información al
 * usuario y ese Alumno se guarda en una lista de tipo Alumno y se le pregunta
 * al usuario si quiere crear otro Alumno o no. Después de ese bucle tendremos
 * el siguiente método en el servicio de Alumno: Método notaFinal(): El usuario
 * ingresa el nombre del alumno que quiere calcular su nota final y se lo busca
 * en la lista de Alumnos. Si está en la lista, se llama al método. Dentro del
 * método se usará la lista notas para calcular el promedio final de alumno.
 * Siendo este promedio final, devuelto por el método y mostrado en el main.
 *
 * @param args
 */
public class ServicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alumno alumno;
    ArrayList<Alumno> listaAlumnos = new ArrayList();

    public void crearAlumnos() {
        ArrayList<Integer> notas;
        String decision;
        do {
            alumno = new Alumno();
            System.out.println("Ingrese el nombre del alumno: ");
            alumno.setNombre(leer.next());

            System.out.println("Ingrese la primer nota: ");
            notas = new ArrayList();
            notas.add(leer.nextInt());

            System.out.println("Ingrese la segunda nota: ");
            notas.add(leer.nextInt());

            System.out.println("Ingrese la tercer nota: ");
            notas.add(leer.nextInt());

            alumno.setNotas(notas);

            listaAlumnos.add(alumno);

            System.out.println("¿Quiere ingresar otro alumno? s/n ");
            decision = leer.next();
        } while (decision.equalsIgnoreCase("s"));
    }

    public void mostrarAlumnos() {
        listaAlumnos.forEach((aux) -> {
            System.out.println(aux);
        });
    }

    /**
     * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
     * calcular su nota final y se lo busca en la lista de Alumnos. Si está en
     * la lista, se llama al método. Dentro del método se usará la lista notas
     * para calcular el promedio final de alumno. Siendo este promedio final,
     * devuelto por el método y mostrado en el main.
     */
    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno para ver su nota final");
        String alumnoFinal;
        Boolean llave = false;
        Integer aux = 0;
        do {
            alumnoFinal = leer.next();
            for (int i = 0; i < listaAlumnos.size(); i++) {
                if (listaAlumnos.get(i).getNombre().equalsIgnoreCase(alumnoFinal)) {
                    System.out.println("El nombre es válido. ");
                    llave = true;
                    aux = i;
                    break;
                } else if (i == listaAlumnos.size() - 1) {
                    System.out.println("Intentelo nuevamente. ");
                }
            }
        } while (!llave);

        Integer[] arrayaux = new Integer[3];
        listaAlumnos.get(aux).getNotas().toArray(arrayaux);

        int suma = 0;
        for (int i = 0; i < 3; i++) {
            suma += arrayaux[i];
        }

        System.out.println("El promedio del alumno es: " + suma / 3);

    }
}
