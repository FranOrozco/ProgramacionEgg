package Ejercicios;
import java.util.Scanner;
public class Ejercicio12 {
    /* 
    Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
    dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
    fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
    X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
    especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
    de FDE, que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
    incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
    siguientes funciones de Java Substring(), Length(), equals().
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Para que el programa devuelva CORRECTO, la frase tiene que tener un límite como máximo de 5 carácteres, empezar con X y terminar con una O");
        String frase;
        int correctas = 0;
        int incorrectas = 0;
        do {
            System.out.println("Ingrese una secuencia. Si quiere salir tiene que ingresar la secuencia &&&&& (5 &)");
            frase = leer.nextLine();
            if ((frase.length() == 5) && (frase.substring(0,1).equalsIgnoreCase("X")) && (frase.substring(4,5).equalsIgnoreCase("O"))){
            System.out.println("Correcto");
            correctas += 1;
            } else if("&&&&&".equals(frase)) {
                
            } else {
                System.out.println("Incorrecto.");
                incorrectas += 1;
            }
        } while (!"&&&&&".equals(frase));
        System.out.println("La cantidad de secuencias correctas fueron: " + correctas);
        System.out.println("La cantidad de secuencias incorrectas son: " + incorrectas);
    }
    
}
