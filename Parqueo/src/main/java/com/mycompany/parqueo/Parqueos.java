
package com.mycompany.parqueo;


public class Parqueos {
    private String nm;
    private String placa;
    private String nit;
    private String fecha;
    public void setnm(String nm){
        this.nm= nm;
    }
    public void setplaca(String placa){
        this.placa=placa;
    }
    public void setnit(String nit){
        this.nit=nit;
    }
    public void setfecha(String fecha){
        this.fecha=fecha;
    }
    public String getnm(){
        return nm;
    }
    public String getplaca(){
        return placa;
    }
    public String getnit(){
        return nit;
    }
    public String getfecha(){
        return fecha;
    }
    public String toString(){
       String mensaje = "";
       mensaje = this.nm+" Numero de Placa: "+this.placa+" NIT propietario: "+this.nit+" Fecha de Ingreso: "+this.fecha;
       return mensaje;
    }
}
