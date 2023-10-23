
package Persistencia;

import Logica.Vehiculo;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraVehiculos {
    VehiculoJpaController vhc = new VehiculoJpaController();
    public void crearVehiculo (Vehiculo vh){
        try {
            vhc.create(vh);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Pense que tenia que llevar logica completa, asi que decidi hacer el resto, mas como para experimentar xd, 
    //No los uso, pero no quita nada probarloss 
    public void editar (Vehiculo vh){
        try {
            vhc.edit(vh);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void EliminarVehiculo(int a){
        try {
            vhc.destroy(a);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Modificar (Vehiculo vh){
        try {
            vhc.edit(vh);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Vehiculo> TraerLista(){
        List<Vehiculo> a = vhc.findVehiculoEntities();
        return a;
    }
}
