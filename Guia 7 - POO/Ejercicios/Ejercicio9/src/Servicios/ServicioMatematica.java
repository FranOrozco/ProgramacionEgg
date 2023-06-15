/**
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales con
 * los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
 * constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
 * Math.random para generar los dos números y se guardaran en el objeto con su
 * respectivos set. Deberá además implementar los siguientes métodos:
 * a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
 * b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
 * al menor número. Previamente se deben redondear ambos valores.
 * c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
 * Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicios;

import Entidades.Matematica;

public class ServicioMatematica {

    public Matematica cargarNumeros() {
        Matematica m = new Matematica();

        m.setNumero1((Math.random() * 10 + 1));
        m.setNumero2((Math.random() * 10 + 1));

        return m;
    }

    public double devolverMayor(Matematica objeto) {
        return Math.max(objeto.getNumero1(), objeto.getNumero2());
    }

    public double devolverMenor(Matematica objeto) {
        return Math.min(objeto.getNumero1(), objeto.getNumero2());
    }

    public double calcularPotencia(Matematica objeto) {
        return Math.pow(Math.round(devolverMayor(objeto)), Math.round(devolverMenor(objeto)));
    }
    
    public double calcularRaiz(Matematica objeto) {
        return Math.sqrt(Math.abs(devolverMenor(objeto)));
    }

}
