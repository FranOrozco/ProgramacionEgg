package principal;

import tienda.servicios.ProductoService;

public class principal {

    public static void main(String[] args) {
        ProductoService productoService = new ProductoService();
        try {
            productoService.imprimirProductos();
        } catch (Exception e) {
        }
    }

}
