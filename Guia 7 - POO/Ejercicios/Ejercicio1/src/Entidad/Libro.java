package Entidad;
//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,

import java.util.Scanner;
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.

public class Libro {

    public int isbn;
    public String titulo;
    public String autor;
    public int nroPag;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int nroPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPag = nroPag;
    }

    public void cargaLibro() {
        System.out.println("Ingrese el ISBN: ");
        isbn = leer.nextInt();
        System.out.println("Ingrese el titulo: ");
        titulo = leer.next();
        System.out.println("Ingrese el autor: ");
        autor = leer.next();
        System.out.println("Ingrese el nroPag: ");
        nroPag = leer.nextInt();
    }

    public void mostrarLibro() {
        System.out.println("El ISBN es " + isbn);
        System.out.println("El titulo es " + titulo);
        System.out.println("El autor es " + autor);
        System.out.println("El número de pags es " + nroPag);

    }
}
