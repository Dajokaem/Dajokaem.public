
package Logica;

import java.io.Serializable;
import javax.persistence.*;
@Entity
//@author Jose Armando Lopez Cruz, 7690-21-2673
public class Vehiculo implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Basic
    private long cui;
    private String pla;
    private String mar;
    private String lin;
    private String mode;
    private String col;
    public Vehiculo (){
        
    }

    public Vehiculo(long cui, String pla, String mar, String lin, String mode, String col) {
        this.cui = cui;
        this.pla = pla;
        this.mar = mar;
        this.lin = lin;
        this.mode = mode;
        this.col = col;
    }



    public long getCui() {
        return cui;
    }

    public void setCui(long cui) {
        this.cui = cui;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPla() {
        return pla;
    }

    public void setPla(String pla) {
        this.pla = pla;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public String getLin() {
        return lin;
    }

    public void setLin(String lin) {
        this.lin = lin;
    }

    public String getMod() {
        return mode;
    }

    public void setMod(String mod) {
        this.mode = mod;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }
    
}
