
package Logica;

import java.io.Serializable;
import javax.persistence.*;
@Entity
//@author Jose Armando Lopez Cruz, 7690-21-2673
public class Persona implements Serializable {
    @Id
    private long cui;
    @Basic
    private long nit;
    private String Dom;   
    private String nm;
    private String ape;
    private String num;
    
    private String fac;
    public Persona (){
        
    }



    
    public long getCui() {
        return cui;
    }

    public void setCui(long cui) {
        this.cui = cui;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public String getDom() {
        return Dom;
    }

    public void setDom(String Dom) {
        this.Dom = Dom;
    }

    public Persona(long cui, long nit, String Dom, String nm, String ape, String num, String fac) {
        this.cui = cui;
        this.nit = nit;
        this.Dom = Dom;
        this.nm = nm;
        this.ape = ape;
        this.num = num;
        this.fac = fac;
    }

    public String getFac() {
        return fac;
    }

    public void setFac(String fac) {
        this.fac = fac;
    }



    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    
}
