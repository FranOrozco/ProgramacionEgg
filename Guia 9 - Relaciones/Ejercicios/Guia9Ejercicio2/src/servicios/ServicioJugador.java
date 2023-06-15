package servicios;

import entidades.Jugador;
import entidades.Revolver;

public class ServicioJugador {
    public Boolean Disparo(ServicioRevolver sr, Revolver revolver, Jugador jugador) {
        if (sr.mojar(revolver)){
            jugador.setMojado(true);
            return true;
        } else {
            sr.siguienteChorro(revolver);
            return false;
        }
    }
}
