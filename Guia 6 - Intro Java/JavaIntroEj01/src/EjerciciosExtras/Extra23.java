package EjerciciosExtras;

import java.util.Scanner;

public class Extra23 {

    /*
    Construya un programa que lea 5 palabras, de mínimo 3 y hasta 5 caracteres y, a medida
    que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
    20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
    será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
    rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
    por pantalla la sopa de letras creada.
    Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
    de Java substring(), Length() y Math.random().
     */
    public static void main(String[] args) {
        String[][] matriz = new String[20][20];
        String[] palabra1 = null, palabra2 = null, palabra3 = null, palabra4 = null, palabra5 = null;
        String palabra, cadenaNumeros;
        int i = 1, n = 0, numRandom, random;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese la palabra " + i);
            palabra = leer.next();
            if (palabra.length() > 5 || palabra.length() < 3) {
                while (palabra.length() > 6 || palabra.length() < 3) {
                    System.out.println("Por favor, ingrese para la palabra " + i + " entre 3 y 5 carácteres");
                    palabra = leer.next();
                }
            }
            palabra = palabra.toUpperCase();
            i++;
            n++;
            switch (n) {
                case 1:
                    palabra1 = palabra.split("");
                    break;
                case 2:
                    palabra2 = palabra.split("");
                    break;
                case 3:
                    palabra3 = palabra.split("");
                    break;
                case 4:
                    palabra4 = palabra.split("");
                    break;
                case 5:
                    palabra5 = palabra.split("");
                    break;
            }
        } while ((palabra.length() > 2 && palabra.length() < 6) && i <= 5);

        for (int j = 0; j < matriz.length; j++) {
            for (int k = 0; k < matriz[j].length; k++) {
                numRandom = (int) (Math.random() * 10);
                cadenaNumeros = Integer.toString(numRandom);
                matriz[j][k] = cadenaNumeros;
            }
        }
        for (int j = 0; j < matriz.length; j++) {
            random = (int) (Math.random() * 16);
            for (int k = 0; k < matriz[j].length; k++) {
                if (j == 2 && k == random) {
                    matriz[j][k] = palabra1[0];
                    matriz[j][k + 1] = palabra1[1];
                    matriz[j][k + 2] = palabra1[2];
                    if (palabra1.length > 3) {
                        matriz[j][k + 3] = palabra1[3];
                    }
                    if (palabra1.length > 4) {
                        matriz[j][k + 4] = palabra1[4];
                    }
                } else if (j == 13 && k == random) {
                    matriz[j][k] = palabra2[0];
                    matriz[j][k + 1] = palabra2[1];
                    matriz[j][k + 2] = palabra2[2];
                    if (palabra1.length > 3) {
                        matriz[j][k + 3] = palabra2[3];
                    }
                    if (palabra1.length > 4) {
                        matriz[j][k + 4] = palabra2[4];
                    }
                } else if (j == 17 && k == random) {
                    matriz[j][k] = palabra3[0];
                    matriz[j][k + 1] = palabra3[1];
                    matriz[j][k + 2] = palabra3[2];
                    if (palabra1.length > 3) {
                        matriz[j][k + 3] = palabra3[3];
                    }
                    if (palabra1.length > 4) {
                        matriz[j][k + 4] = palabra3[4];
                    }
                } else if (j == 10 && k == random) {
                    matriz[j][k] = palabra4[0];
                    matriz[j][k + 1] = palabra4[1];
                    matriz[j][k + 2] = palabra4[2];
                    if (palabra1.length > 3) {
                        matriz[j][k + 3] = palabra4[3];
                    }
                    if (palabra1.length > 4) {
                        matriz[j][k + 4] = palabra4[4];
                    }
                } else if (j == 19 && k == random) {
                    matriz[j][k] = palabra5[0];
                    matriz[j][k + 1] = palabra5[1];
                    matriz[j][k + 2] = palabra5[2];
                    if (palabra1.length > 3) {
                        matriz[j][k + 3] = palabra5[3];
                    }
                    if (palabra1.length > 4) {
                        matriz[j][k + 4] = palabra5[4];
                    }
                }
            }
        }
        for (int j = 0; j < matriz.length; j++) {
            for (int k = 0; k < matriz[j].length; k++) {
                System.out.print(" " + matriz[j][k] + " ");
            }
            System.out.println("");
        }
        
        
    }

}
