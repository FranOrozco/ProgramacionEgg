package guia11ejercicio8;

public class Guia11Ejercicio8 {

    public static void main(String[] args) {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("w");
            valor++;
            System.out.println("Valor final del try: " + valor);
        } catch (NumberFormatException e) {
            
            // Al catch nunca entra porque no estoy ingresando nada por teclado 
            // Y lo que está dentro del parseInt está bien escrito.
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor final del catch: " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        valor++;
        System.out.println("Valor antes del return: " + valor);
    }
}
