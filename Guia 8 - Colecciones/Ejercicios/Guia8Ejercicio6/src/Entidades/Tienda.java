/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
 * productos que venderemos y el precio que tendrán. Además, se necesita que la
 * aplicación cuente con las funciones básicas.
 * Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
 * eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
 * Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
 * Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Entidades;

public class Tienda {

    private String nombreObjeto;
    private int precioObjeto;

    public Tienda() {
    }

    public Tienda(String nombreObjeto, int precioObjeto) {
        this.nombreObjeto = nombreObjeto;
        this.precioObjeto = precioObjeto;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public int getPrecioObjeto() {
        return precioObjeto;
    }

    public void setPrecioObjeto(int precioObjeto) {
        this.precioObjeto = precioObjeto;
    }

    @Override
    public String toString() {
        return "Tienda{" + "nombreObjeto=" + nombreObjeto + ", precioObjeto=" + precioObjeto + '}';
    }

}
