package entidades;

import java.util.ArrayList;

public class Baraja {

    private ArrayList<Carta> baraja;

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "La baraja tiene " + baraja.size() + " cartas" + '}';
    }

}
