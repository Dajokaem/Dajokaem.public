
package Persistencia;

import colegio_prueba01.Alumno;
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
}
