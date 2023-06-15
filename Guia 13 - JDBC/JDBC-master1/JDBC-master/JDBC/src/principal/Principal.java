package principal;

import com.redsocial.dominio.mascota.MascotaService;
import com.redsocial.dominio.usuario.Usuario;
import com.redsocial.dominio.usuario.UsuarioService;

public class Principal {

    public static void main(String[] args) {

        UsuarioService usuarioService = new UsuarioService();
        MascotaService mascotaService = new MascotaService();

        
        try {
            //Creamos  usuarios
            usuarioService.crearUsuario("francoorozco6543@gmail.com", "eggmylife");
            // usuarioService.crearUsuario("tincho@hotmail.com", "eggprogramacion"); 
            usuarioService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        
        try {
            //Modificamos un usuario
            usuarioService.modificarClaveUsuario("francoorozco6543@gmail.com", "eggmylife", "meliteamo");
            usuarioService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        
//        try {
//            //Eliminamos un usuario
//            usuarioService.eliminarUsuario("fiorde@hotmail.com");
//            usuarioService.imprimirUsuarios();
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Error del sistema por \n" + e.getMessage());
//        }
        
        
        try {
            //Buscamos el Usuario por correo
            Usuario usuario = usuarioService.buscarUsuarioPorCorreoElectronico("francoorozco6543@gmail.com");
            //Creamos Mascota con el Usuario anterior
            mascotaService.crearMascota("Junior", "Pichichu", usuario);

            //Mostramos Mascota con su Usuario
            mascotaService.imprimirMascotas();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        
    }
}
