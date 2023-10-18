
package com.mycompany.parqueo;

public class Vehiculos {
    private String placa;
    private String marca;
    private String linea;
    private String mod;
    private String col;
    private String nit;
    private String est;
    public Vehiculos(String placa, String marca, String linea, String mod, String col, String nit, String est){
        this.placa=placa;
        this.marca= marca;
        this.linea= linea;
        this.mod=mod;
        this.col = col;
        this.nit=nit;
        this.est= est;
    }    
    public void setplaca(String placa){
        this.placa= placa;
    }
    public void setmarca(String marca){
        this.marca=marca;
    }
    public void setlinea(String linea){
        this.linea=linea;
    }
    public void setmod(String mod){
        this.mod =mod;
    }
    public void setcol(String col){
        this.col = col;
    }
    public void setnit(String nit){
        this.nit = nit;
    }
    public void setest(String est){
        this.est= est;
    }
    public String getplaca(){
        return placa;
    }
    public String getmarca(){
        return marca;
    }
    public String getlinea(){
        return linea;
    }
    public String getmod(){
        return mod;
    }
    public String getcol(){
        return col;
    }
    public String getnit(){
        return nit;
    }
    public String getest(){
        return est;
    }
    public String toString(){
        String mensaje = "";
        mensaje = "No. Placa: "+this.placa+" Marca: "+this.marca+" linea: "+this.linea+" Modelo: "+this.mod+" Color: "+this.col+" NIT: "+this.nit;
        return mensaje;
    }
}
