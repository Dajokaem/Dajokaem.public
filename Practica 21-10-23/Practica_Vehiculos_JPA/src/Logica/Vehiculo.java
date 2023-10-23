
package Logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Vehiculo implements Serializable {
    @Id
    private int id;
    @Basic
    private String pl;
    private String mode;
    private String cl;
    public Vehiculo(){
        
    }
    public Vehiculo(int id, String pl, String mod, String cl){
        this.id=id;
        this.mode=mod;
        this.pl=pl;
        this.cl = cl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mod) {
        this.mode = mod;
    }

    public String getCl() {
        return cl;
    }

    public void setCl(String cl) {
        this.cl = cl;
    }
    
}
