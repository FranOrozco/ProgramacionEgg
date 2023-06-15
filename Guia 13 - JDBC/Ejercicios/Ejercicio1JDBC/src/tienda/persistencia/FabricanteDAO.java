package tienda.persistencia;

import tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO{
    // Método que me permite guardar fabricantes
    public void guardarFabricante (Fabricante fabricante) throws Exception {
        try {
            if (fabricante != null) {
                throw new Exception ("Debe indicar un fabricante");
            }
            
            String sql = "INSERT INTO Fabricante (codigo, nombre)" + "VALUES ('" + 
                    fabricante.getCodigo() + "' , '" + fabricante.getNombre() + "' );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    // Método para modificar 
    public void modificarFabricante (Fabricante fabricante) throws Exception {
        try {
            if (fabricante != null) {
                throw new Exception ("Debe indicar el fabricante que desea modificar");
            }
            
            String sql = "UPDATE Fabricante SET " 
                    + "codigo = '" + fabricante.getCodigo() 
                    + "' WHERE nombre = '" + fabricante.getNombre() + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    // Método para eliminar un fabricante
    public void eliminarFabricante (String nombre) throws Exception {
        try {
            String sql = "DELETE FROM Fabricante WHERE nombre = '" + nombre + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    // Método para buscar un fabricante 
    public Fabricante buscarFabricantePorNombre(String nombre) throws Exception {
        try {
            
            String sql = "SELECT * FROM Fabricante " // Escribimos específicamente la consulta queremos dar
                    + "WHERE nombre = '" + nombre + "';";
            
            consultarBase(sql); // Utilizamos el otro método para consultar 
            
            Fabricante fabricante = null; // Creamos un objeto vacío donde vamos a alojar los resultados (si es que hay) del ResultSet que nos deja el método anterior
            
            while (resultado.next()) {                
                fabricante = new Fabricante(); // Lo hacemos nacer con su constructor vacío
                fabricante.setCodigo(resultado.getInt(1)); // Le ingresamos el codigo que está en la columna 1
                fabricante.setNombre(resultado.getString(2)); // Le ingresamos el nombre que está en la columna 2
            }
            desconectarBase();
            return fabricante;
        } catch (Exception e) {
            desconectarBase(); // Primero desconectamos la base de datos por si llega a saltar un error. 
            throw e;
        }
    }
}
