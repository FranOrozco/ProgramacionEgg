package servicios;

import entidades.Carta;

public class ServicioCarta {

    public Carta crearCarta(int numeroCarta, String palo) {
        Carta carta = new Carta();
        carta.setNumero(numeroCarta);
        carta.setPalo(palo);
        
        return carta;
    }
}
