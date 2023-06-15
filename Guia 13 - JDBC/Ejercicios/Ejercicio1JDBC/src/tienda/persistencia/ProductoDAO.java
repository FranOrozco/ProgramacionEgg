package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {

    // Método que me permite guardar producto
    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto != null) {
                throw new Exception("Debe indicar un producto");
            }

            String sql = "INSERT INTO Producto (codigo, nombre, precio, codigo_fabricante)" + " VALUES ('"
                    + producto.getCodigo() + "' , '" + producto.getNombre() + "' , '"
                    + producto.getPrecio() + "' , '" + producto.getCodigoFabricante() + "');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    // Método para modificar un producto
    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto != null) {
                throw new Exception("Debe indicar el producto a modificar");
            }

            String sql = "UPDATE Producto SET "
                    + "codigo = '" + producto.getCodigo() + "' "
                    + "precio = '" + producto.getPrecio() + "' "
                    + "nombre = '" + producto.getNombre() + "' "
                    + "' WHERE codigo_fabricante = '" + producto.getCodigoFabricante() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    // Método para eliminar un producto
    public void eliminarProducto(String nombre) throws Exception {
        try {
            String sql = "DELETE FROM Producto WHERE nombre = '" + nombre + "';";
        } catch (Exception e) {
            throw e;
        }
    }

    // Método para buscar un producto 
    public Producto buscarProductoPorNombre(String nombre) throws Exception {
        try {
            String sql = "SELECT * FROM Producto "
                    + "WHERE nombre = '" + nombre + "';";

            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    // a) Lista el nombre de todos los productos que hay en la tabla producto. 
    public Collection<Producto> listarProductosPorNombre() throws Exception {
        try {
            String sql = "SELECT nombre FROM Producto;";
            consultarBase(sql);
            
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {                
                producto = new Producto();
                producto.setNombre(resultado.getString(2));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
