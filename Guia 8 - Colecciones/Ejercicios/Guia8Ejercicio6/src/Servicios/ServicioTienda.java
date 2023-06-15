/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
 * productos que venderemos y el precio que tendrán. Además, se necesita que la
 * aplicación cuente con las funciones básicas.
 * Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
 * eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
 * Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
 * Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicios;

import Entidades.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioTienda {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> mapaTienda = new HashMap();

    public Tienda crearArticulo() {
        Tienda ob1 = new Tienda();
        System.out.println("Ingrese el nombre del producto: ");
        ob1.setNombreObjeto(leer.next());

        System.out.println("Ingrese el precio del producto: ");
        ob1.setPrecioObjeto(leer.nextInt());

        return ob1;
    }

    public HashMap<String, Integer> crearProducto() {
        String respuesta;

        do {
            Tienda aux = crearArticulo();
            mapaTienda.put(aux.getNombreObjeto(), aux.getPrecioObjeto());

            System.out.println("¿Desea agregar otro producto? si/no ");
            respuesta = leer.next();
            while (!"si".equalsIgnoreCase(respuesta) && !"no".equalsIgnoreCase(respuesta)) {
                System.out.println("No es una opcion valida");
                System.out.println("¿Desea agregar otro producto?");
                respuesta = leer.next();
            }
        } while ("si".equalsIgnoreCase(respuesta));

        return mapaTienda;
    }

    public void agregarProducto(HashMap<String, Integer> productos) {
        System.out.println("Ingrese el nombre del producto a agregar: ");
        String nombreProducto = leer.next();

        System.out.println("Ingrese el precio del producto: ");
        Integer precioProducto = leer.nextInt();

        productos.put(nombreProducto, precioProducto);
    }

    public void mostrarProducto(HashMap<String, Integer> productos) {
        System.out.println("Sus productos son: ");
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + "\nPrecio: $" + entry.getValue() + "\n");
        }
    }

    public void modificarPrecio(HashMap<String, Integer> productos) {
        System.out.println("¿Que producto desea modificar su precio?");
        String resp = leer.next();

        if (productos.containsKey(resp)) {
            System.out.println("Ingrese el nuevo precio: ");
            productos.replace(resp, leer.nextInt());
        } else {
            System.out.println("Su producto no está en la lista.");
        }

        /*
        --------- OTRA FORMA QUE ME PASÓ ELIAS QUE SE LO PASÓ LEO QUE LEO BUSCÓ EN GOOGLE -----------
        public void modificarPrecio(HashMap<String, Integer> productos) {
        System.out.println("Que producto desea modificar su precio");
        String resp = leer.next().toLowerCase();
        Iterator<Entry<String, Integer>> iterator = productos.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getKey().equalsIgnoreCase(resp)) {
                System.out.println("Ingrese el nuevo precio");
                productos.replace(resp, leer.nextInt());
            }
        }
    }
         */
        
    }

    public void eliminarProducto(HashMap<String, Integer> productos) {
        System.out.println("¿Qué producto desea eliminar?");
        String resp = leer.next();

        if (productos.containsKey(resp)) {
            productos.remove(resp);
            System.out.println("El producto ha sido eliminado de la lista.");
        } else {
            System.out.println("Su producto no está en la lista.");
        }
    }

    public void menuTienda(HashMap<String, Integer> productos) {
        System.out.println("Bienvenido a Carrefour. ");
        int resp;

        do {
            System.out.println("Elija una opción: ");
            System.out.println("1 - Agregar Productos");
            System.out.println("2 - Eliminar Productos");
            System.out.println("3 - Modificar Precio Del Producto");
            System.out.println("4 - Mostrar Lista");
            System.out.println("5 - Salir");

            resp = leer.nextInt();
            switch (resp) {
                case 1:
                    agregarProducto(productos);
                    break;
                case 2:
                    eliminarProducto(productos);
                    break;
                case 3:
                    modificarPrecio(productos);
                    break;
                case 4:
                    mostrarProducto(productos);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
            }
        } while (resp != 5);

    }

}
