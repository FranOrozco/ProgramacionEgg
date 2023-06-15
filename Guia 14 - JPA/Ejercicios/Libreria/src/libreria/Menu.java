package libreria;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class Menu {

    private final LibroServicio libroServicio = new LibroServicio();
    private final EditorialServicio editorialServicio = new EditorialServicio();
    private final AutorServicio autorServicio = new AutorServicio();
    private Scanner leer;
    private Libro libro;
    private Autor autor;
    private Editorial editorial;

    
    public Menu() {
        libroServicio.setServicios(autorServicio, editorialServicio);
        autorServicio.setServicios(libroServicio, editorialServicio);
        editorialServicio.setServicios(autorServicio, libroServicio);
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    private void ingresarNuevoLibro() {
        try {
            
        libro = new Libro();

        System.out.println("Ingrese el título del libro:");
        libro.setTitulo(leer.next());
        System.out.println("Ingrese el año de publicación:");
        libro.setAnio(leer.nextInt());
        System.out.println("Ingrese la cantidad de ejemplares:");
        libro.setEjemplares(leer.nextInt());
        int ejemplaresPrestados = (int) (Math.random() * libro.getEjemplares());
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        int ejemplaresRestantes = libro.getEjemplares() - ejemplaresPrestados;
        libro.setEjemplaresRestantes(ejemplaresRestantes);
        System.out.println("Ingrese el nombre del autor:");
        autor = autorServicio.crearAutor(leer.next());
        libro.setAutor(autor);
        System.out.println("Ingrese el nombre de la editorial:");
        editorial = editorialServicio.crearEditorial(leer.next());
        libro.setEditorial(editorial);
        libroServicio.crearLibroManual(libro);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        libroServicio.imprimirListaLibros();
//        try {
////            limpiarPantalla();
//        } catch (AWTException ex) {
//            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public void ingresarLibros() {
        do {
            ingresarNuevoLibro();
            System.out.println("Desea ingresar un nuevo libro?");
        } while (leer.next().equalsIgnoreCase("s"));
    }

    public void limpiarPantalla() throws AWTException {

        Robot pressbot = new Robot();
        pressbot.setAutoDelay(30);
        pressbot.keyPress(17);
        pressbot.keyPress(76);
        pressbot.keyRelease(17);
        pressbot.keyRelease(76);
    }
}
