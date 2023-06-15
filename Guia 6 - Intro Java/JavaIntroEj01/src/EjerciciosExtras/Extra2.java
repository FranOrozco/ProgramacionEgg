package EjerciciosExtras;

public class Extra2 {

    /*
    Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
    una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
    tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
    iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
    */
    public static void main(String[] args) {
        int A = 1, B = 2, C = 3, D = 4;
        int auxiliar = 0;

        System.out.println("Valores iniciales: ");
        System.out.println("El valor de A: " + A);
        System.out.println("El valor de B: " + B);
        System.out.println("El valor de C: " + C);
        System.out.println("El valor de D: " + D);
        
        System.out.println("");
        
        auxiliar = B;
        B = C;
        C = A;
        A = D; 
        D = auxiliar;
        System.out.println("Luego del cambio, los valores nuevos son: ");
        System.out.println("El valor de A: " + A);
        System.out.println("El valor de B: " + B);
        System.out.println("El valor de C: " + C);
        System.out.println("El valor de D: " + D);
    }
    
}
