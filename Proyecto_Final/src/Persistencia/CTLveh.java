package Persistencia;

import Logica.Vehiculo;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//@author Jose Armando Lopez Cruz, 7690-21-2673

public class CTLveh {

    VehiculoJpaController ctl = new VehiculoJpaController();

    public void crear(Vehiculo vh) {
        try {
            ctl.create(vh);
        } catch (Exception ex) {
            Logger.getLogger(CTLveh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar(Vehiculo ch) {
        try {
            ctl.edit(ch);
        } catch (Exception ex) {
            Logger.getLogger(CTLveh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(Vehiculo vh) {
        try {
            ctl.destroy(vh.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(CTLveh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Vehiculo> lista() {
        List<Vehiculo> a = ctl.findVehiculoEntities();
        return a;
    }
}
