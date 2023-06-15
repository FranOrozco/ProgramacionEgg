package Utilidades;

import Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> ordenarDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracionPelicula().compareTo(p1.getDuracionPelicula());
        }
    };

    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };

    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
