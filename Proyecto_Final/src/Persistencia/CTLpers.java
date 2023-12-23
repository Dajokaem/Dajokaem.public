package Persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import Logica.Persona;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class CTLpers {

    PersonaJpaController per = new PersonaJpaController();

    public void Crear(Persona persona) {
        try {
            per.create(persona);
        } catch (Exception ex) {
            Logger.getLogger(CTLpers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Editar(Persona persona) {
        try {
            per.edit(persona);
        } catch (Exception ex) {
            Logger.getLogger(CTLpers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Eliminar(Persona persona) {
        try {
            per.destroy(persona.getCui());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(CTLpers.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Persona> lista() {
        List<Persona> a = per.findPersonaEntities();
        return a;
    }

}
