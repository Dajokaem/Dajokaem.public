
package com.mycompany.parqueo;

public class Clientes {
    private String cui;
    private String nit;
    private String Dire;
    private String Emp;
    private String Diremp;
    private String nac;
    private String name1;
    private String name2;
    private String ape1;
    private String ape2;
    private String num ;
    private String est;
    public Clientes(String cui, String nit, String Dire, String Emp, String Diremp, String nac, String name1, String name2, String ape1, String ape2, String num, String est ){
        this.cui = cui;
        this.nit = nit;
        this.Dire = Dire;
        this.Emp= Emp;
        this.Diremp= Diremp;
        this.nac= nac;
        this.name1 =name1;
        this.name2= name2;
        this.ape1= ape1;
        this.ape2=ape2;
        this.num = num;
        this.est=est;
    }



    public void setcui(String cui){
        this.cui= cui;
    }
    public void setnit(String nit){
        this.nit=nit;
    }
    public void setDire(String Dire){
        this.Dire=Dire;
    }
    public void setEmp(String Emp){
        this.Emp=Emp;
    }
    public void setDiremp(String Diremp){
        this.Diremp=Diremp;
    }
    public void setnac(String nac){
        this.nac=nac;
    }
    public void setname1(String name1){
        this.name1=name1;
    }
    public void setname2(String name2){
        this.name2 = name2;
    }
    public void setape1(String ape1){
        this.ape1=ape1;
    }
    public void setape2(String ape2){
        this.ape2=ape2;
    }
    public void setnum(String num){
        this.num=num;
    }
    public void setest(String est){
        this.est = est;
    }
    public String getcui(){
        return cui;
    }
    public String getnit(){
        return nit;
    }
    public String getDire(){
        return Dire;
    }
    public String getEmp(){
        return Emp;
    }
    public String getDiremp(){
        return Diremp;
    }
    public String getnac(){
        return nac;
    }
    public String getname1(){
        return name1;
    }
    public String getname2(){
        return name2;
    }
    public String getape1(){
        return ape1;
    }
    public String getape2(){
        return ape2;
    }
    public String getnum(){
        return num;
    }
    public String getest(){
        return est;
    }
    public String toString(){
        String mensaje ="";
        mensaje = "CUI: "+ this.cui+" Nit: "+this.nit+" Direccion: "+this.Dire+" Empresa: "+this.Emp+" Direccion Empresa: "+this.Diremp+" Fecha de nacimiento "+this.nac+" Nombre: "+this.name1+" "+this.name2+" "+this.ape1+" "+this.ape2+" Numero de telefono: "+this.num;
        return mensaje;
    }
}
