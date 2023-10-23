
package Persistencia;

import Persistencia.exceptions.NonexistentEntityException;
import colegio_prueba01.Alumno;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {

    AlumnoJpaController aloJPA = new AlumnoJpaController();

    public void crearAlumno (Alumno alu){
        try {
            aloJPA.create(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Editar (Alumno alu){
        try {
            aloJPA.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Eliminar(Alumno alu){
        try {
            aloJPA.destroy(alu.getdpi());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Alumno> traer(){
        List<Alumno> a = aloJPA.findAlumnoEntities();
        return a;
    }
}
