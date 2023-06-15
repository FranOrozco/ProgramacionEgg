package Persistencia;

import Logica.Alumno;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    // CREO UN OBJETO DE TIPO JPA-CONTROLLER 
    AlumnoJpaController aluJPA = new AlumnoJpaController();

    // CREO EL MÉTODO QUE VA A 'CREAR' A LOS ALUMNOS. Todo esto va dentro de un try-catch. 
    public void crearAlumno (Alumno alumno) {
        try {
            aluJPA.create(alumno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // MÉTODO PARA ELIMINAR A ALGÚN ALUMNO DE LA BASE DE DATOS
    public void eliminarAlumno(String idAlumno) {
        try {
            aluJPA.destroy(idAlumno);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // MÉTODO PARA MODIFICAR A UN ALUMNO 
    public void modificarAlumno(Alumno alumno2) {
        try {
            aluJPA.edit(alumno2);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // MÉTODO PARA MOSTRAR UNA LISTA DE ALUMNOS
    public List<Alumno> traerAlumnos() {
        List <Alumno> listaAlumnos = aluJPA.findAlumnoEntities();
        return listaAlumnos;
    }
    
    // MÉTODO PARA MOSTRAR UN ALUMNO EN PARTICULAR
    public Alumno traerAlumnoEnParticular(String id) {
        Alumno alu = aluJPA.findAlumno(id);
        return alu;
    }
}
