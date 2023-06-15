package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;

public class testJPA {

    public static void main(String[] args) {
        // CREACIÓN DE OBJETOS TIPO ALUMNO EN JAVA
        Alumno alumno = new Alumno("37640491", "Franco", "Orozco", new Date("11/15/1999"));
        Alumno alumno2 = new Alumno("123", "Maria", "Becerra", new Date("12/19/2000"));

        // CREACIÓN DE CONTROLADOR
        ControladoraPersistencia control = new ControladoraPersistencia();
        
        // CREACIÓN DE ALUMNO EN LA BASE DE DATOS
        control.crearAlumno(alumno2);

        // ELIMINACIÓN DE ALUMNO EN BASE DE DATOS 
        control.eliminarAlumno("123");
        
        // MODIFICACIÓN DE DATOS DE ALGÚN ALUMNO
        alumno2.setApellido("prueba num 2");
        alumno2.setNombre("número 2");
        // CAMBIO DE DATOS DE ALUMNO EN BASE DE DATOS 
        control.modificarAlumno(alumno2);
        
        // CREACIÓN DE LIST DE ALUMNOS PARA MOSTRAR <TODOS> LOS ALUMNOS
        List<Alumno> listaAlumnos = control.traerAlumnos();
        System.out.println("\n A continuación, se citan todos los alumnos: ");
        for (Alumno alu : listaAlumnos) {
            System.out.println(" - " + alu.getDni() + " " + alu.getNombre() + " " + alu.getApellido() + " " + alu.getFechaNac());
        }
        
        // SOUT PARA MOSTRAR UN ALUMNO EN PARTICULAR 
        Alumno alu = control.traerAlumnoEnParticular("37640491");
        System.out.println(" - " + alu.getDni() + " " + alu.getNombre() + " " + alu.getApellido() + " " + alu.getFechaNac());
    }

}
