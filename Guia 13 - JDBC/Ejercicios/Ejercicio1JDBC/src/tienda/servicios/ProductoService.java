package tienda.servicios;

import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoService {

    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    public void crearProducto(Integer codigo, String nombre, double precio, int codigoFabricante) throws Exception {
        try {
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);

            dao.guardarProducto(producto);
        } catch (Exception e) {
        }
    }
    
    public Collection<Producto> listarProducto() throws Exception {
        try {
            Collection<Producto> productos = dao.listarProductosPorNombre();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirProductos() throws Exception {
        try {
            Collection<Producto> productos = listarProducto();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
