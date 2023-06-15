package libreria;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.ServicioAutor;
import libreria.servicios.ServicioEditorial;
import libreria.servicios.ServicioLibro;

public class Menu {
    
    private final ServicioLibro servicioLibro = new ServicioLibro();
    private final ServicioEditorial servicioEditorial = new ServicioEditorial();
    private final ServicioAutor servicioAutor = new ServicioAutor();
    private Scanner leer;
    private Libro libro;
    private Autor autor;
    private Editorial editorial;
    
    public Menu() {
        servicioLibro.setServicios(servicioAutor, servicioEditorial);
        servicioAutor.setServicios(servicioLibro, servicioEditorial);
        servicioEditorial.setServicios(servicioAutor, servicioLibro);
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
            int ejemplaresRestantes = libro.getEjemplares() - libro.getEjemplaresPrestados();
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            System.out.println("Ingrese el nombre del autor:");
            autor = servicioAutor.crearAutor(leer.next());
            libro.setAutor(autor);
            System.out.println("Ingrese el nombre de la editorial:");
            editorial = servicioEditorial.crearEditorial(leer.next());
            libro.setEditorial(editorial);
            servicioLibro.crearLibroManual(libro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ingresarLibros() {
        do {            
            ingresarNuevoLibro();
            System.out.println("¿Desea ingresar otro libro? s/n ");
        } while (leer.next().equalsIgnoreCase("s"));
    }
    
    // ¿Y esto?
    public void limpiarPantalla() throws AWTException {
        Robot pressbot = new Robot();
        pressbot.setAutoDelay(30);
        pressbot.keyPress(17);
        pressbot.keyPress(76);
        pressbot.keyRelease(17);
        pressbot.keyRelease(76);
    }
    
}
