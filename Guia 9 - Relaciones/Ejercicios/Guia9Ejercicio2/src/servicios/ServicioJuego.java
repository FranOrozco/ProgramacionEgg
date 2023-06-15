package servicios;

import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioJuego {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Jugador> llenarJugadores() {
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("Ingrese una cantidad de jugadores. Máximo 6.");
        int cantidadJugadores = leer.nextInt();
        while (cantidadJugadores < 0 && cantidadJugadores > 6) {
            System.out.println("Por favor, ingrese un valor entre 1 y 6.");
            cantidadJugadores = leer.nextInt();
        }

        for (int i = 0; i < cantidadJugadores; i++) {
            Jugador jugador = new Jugador();
            System.out.println("Ingrese el nombre del jugador " + i);
            jugador.setNombre(leer.next());
            jugadores.add(jugador);
        }

        return jugadores;
    }

    public Revolver llenarRevolver() {
        return new Revolver();
    }

    public void ronda(ArrayList<Jugador> jugadores, Revolver revolver, ServicioJugador sj, ServicioRevolver sr) {
        System.out.println("Posición Agua: " + revolver.getPosicionAgua());
        System.out.println("---------------");
        Boolean noHayMojado = true;
        int i = 0;
        while (noHayMojado) {
            System.out.println("Juega " + jugadores.get(i).getNombre());
            System.out.println("El rodillo está en la posición " + revolver.getPosicionActual());
            if (sj.Disparo(sr, revolver, jugadores.get(i))) {
                System.out.println("El arma disparó. El jugador " + jugadores.get(i).getNombre() + " se mojó.");
                noHayMojado = false;
            } else {
                System.out.println("Se salvó. El rodillo del arma gira.");
                System.out.println("---------------");
                if (i == jugadores.size() - 1) {
                    i = 0;
                } else {
                    i++;
                }
            }
        }
    }
}
