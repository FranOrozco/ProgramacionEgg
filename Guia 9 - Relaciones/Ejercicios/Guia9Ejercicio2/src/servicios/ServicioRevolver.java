package servicios;

import entidades.Revolver;

public class ServicioRevolver {

    public void llenarRevolver(Revolver revolver) {
        revolver.setPosicionActual(1);
        revolver.setPosicionAgua((int) (Math.random() * 6 + 1));
    }

    public Boolean mojar(Revolver revolver) {
        return (revolver.getPosicionActual() == revolver.getPosicionAgua());
    }

    public void siguienteChorro(Revolver revolver) {
        if (revolver.getPosicionActual() >= 1 && revolver.getPosicionActual() < 6) {
            revolver.setPosicionActual(revolver.getPosicionActual() + 1);
        } else {
            revolver.setPosicionActual(1);
        }
    }
}
