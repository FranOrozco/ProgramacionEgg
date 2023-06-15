/**
 *  Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
 * además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
 * otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
 * definir los métodos getters y setters correspondientes.
 */
package extra1;

import Entidades.Cancion;
import Servicios.ServicioCancion;

public class Extra1 {
    
    public static void main(String[] args) {
        ServicioCancion servicio = new ServicioCancion();
        
        Cancion cancion1 = servicio.crearCancion();
        servicio.mostrarCancion(cancion1);
        
    }
    
}
