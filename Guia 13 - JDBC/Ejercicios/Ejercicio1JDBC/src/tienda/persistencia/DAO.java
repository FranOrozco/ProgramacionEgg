package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

    protected Connection conexion;
    protected ResultSet resultado;
    protected Statement sentencia;
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    protected void conectarBase() throws Exception {
        try {
            Class.forName(DRIVER); // Acá especificamos el driver
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false"; // Es la URL que nos conecta a la base de datos. La parte del final es para desactivar unos warning algo molestos. 
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD); // Lo hacemos mediante DriverManager que es una funcionalidad 
        } catch (ClassNotFoundException | SQLException ex) { // Estos errores son más explicativos si llega a saltar un error
            throw ex;
        }
    }

    protected void desconectarBase() throws Exception {
        try {
            if (resultado != null) { 
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            } 
// Cuando termino una consulta, cierro la consulta utilizando este método. 
// Acostumbrarse a cerrar las bases de datos en JDBC y JPA. 
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    protected void insertarModificarEliminar(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (Exception ex) {
            throw ex;
        } finally {
            desconectarBase();
        }
    }
    
    protected void consultarBase(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }
}
