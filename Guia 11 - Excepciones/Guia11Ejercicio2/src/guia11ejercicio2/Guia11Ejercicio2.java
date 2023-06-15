package guia11ejercicio2;

public class Guia11Ejercicio2 {

    /**
     * Definir una Clase que contenga algún tipo de dato de tipo array y agregue
     * el código para generar y capturar una excepción
     * ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango)
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            int[] listaNumeros = new int[2];
            listaNumeros[0] = 1;
            listaNumeros[1] = 2;
            listaNumeros[2] = 3;
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Intentó agregar un valor fuera del rango de la lista. ");
        }

    }

}
