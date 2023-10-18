
package com.mycompany.parqueo;
import java.io.*;
public class ManejoClientes {
    private boolean xm = true;
    public void escribir(Clientes cl)throws IllegalArgumentException, NumberFormatException, IOException{
  
            File f = new File("Clientes.txt");
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            if(f.exists()&&f.length()!= 0){
                String linea;
                Boolean x = false;
                while((linea= br.readLine())!=null){
                    String[] ar = linea.split("%");
                    if(ar[0].equalsIgnoreCase(cl.getcui())&&ar[11]=="1"){
                        System.out.println("El registro ya existe");
                        xm = false;
                    }else{
                        if(ar[0].equalsIgnoreCase(cl.getcui())&&ar[11]=="2"){
                            System.out.println("El registro se encuentra inactivo, pasara a activarse");
                            bw.write(cl.getcui()+"%"+cl.getnit()+"%"+cl.getDire()+"%"+cl.getEmp()+"%"+cl.getDiremp()+"%"+cl.getnac()+"%"+cl.getname1()+"%"+cl.getname2()+"%"+cl.getape1()+"%"+cl.getape2()+"%"+cl.getnum()+"%"+"1");               

                        }else{
                            if(!(ar[0].equalsIgnoreCase(cl.getcui()))){
                                bw.newLine();
                                bw.write(cl.getcui()+"%"+cl.getnit()+"%"+cl.getDire()+"%"+cl.getEmp()+"%"+cl.getDiremp()+"%"+cl.getnac()+"%"+cl.getname1()+"%"+cl.getname2()+"%"+cl.getape1()+"%"+cl.getape2()+"%"+cl.getnum()+"%"+"1");                                   
                            }
                        }
                    }
                } 
                fr.close();
                br.close();
                fw.close();
                bw.close();
            }else{
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(cl.getcui()+"%"+cl.getnit()+"%"+cl.getDire()+"%"+cl.getEmp()+"%"+cl.getDiremp()+"%"+cl.getnac()+"%"+cl.getname1()+"%"+cl.getname2()+"%"+cl.getape1()+"%"+cl.getape2()+"%"+cl.getnum()+"%"+"1");               
            }

    }
    public void LeerNit(String nit)throws IllegalArgumentException, NumberFormatException, IOException{
        File f = new File("Clientes.txt");
        if (f.exists()){
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            Boolean x = false;
            while((linea= br.readLine())!=null){
                String[] ar = linea.split("%");
                if(ar[1].equalsIgnoreCase(nit)&&ar[11]=="1"){
                    Clientes cliente = new Clientes(ar[0], ar[1], ar[2], ar[3], ar[4], ar[5], ar[6], ar[7], ar[8], ar[9],ar[10], ar[11]);
                    System.out.println(cliente.toString());
                    x = true;
                }
            }
            br.close();
            fr.close();
            if(!x){
                System.out.println("No se encontro a el cliente");
            }
        }else{
            System.out.println("No existe registro");
        }
    }
    public void LeerCui(String cui) throws IllegalArgumentException, NumberFormatException, IOException{
        File f = new File("Clientes.txt");
        if (f.exists()){
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            Boolean x = false;
            while((linea= br.readLine())!=null){
                String[] ar = linea.split("%");
                if(ar[0].equalsIgnoreCase(cui)&&ar[11]=="1"){
                    Clientes cliente = new Clientes(ar[0], ar[1], ar[2], ar[3], ar[4], ar[5], ar[6], ar[7], ar[8], ar[9],ar[10], ar[11]);
                    System.out.println(cliente.toString());
                    x = true;
                }
            }
            br.close();
            fr.close();
            if(!x){
                System.out.println("No se encontro a el cliente");
            }
        }else{
            System.out.println("No existe registro");
        }       
    }
    public void LeerNombres(String nm, String nmm)throws IllegalArgumentException, NumberFormatException, IOException{
         File f = new File("Clientes.txt");
        if (f.exists()){
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            Boolean x = false;
            while((linea= br.readLine())!=null){
                String[] ar = linea.split("%");
                if((ar[6].equalsIgnoreCase(nm)&&ar[7].equalsIgnoreCase(nmm))&&ar[11]=="1"){
                    Clientes cliente = new Clientes(ar[0], ar[1], ar[2], ar[3], ar[4], ar[5], ar[6], ar[7], ar[8], ar[9],ar[10], ar[11]);
                    System.out.println(cliente.toString());
                    x = true;
                }
            }
            br.close();
            fr.close();
            if(!x){
                System.out.println("No se encontro a el cliente");
            }
        }else{
            System.out.println("No existe registro");
        }       
    }
    public void LeerApes(String ape, String apee) throws IllegalArgumentException, NumberFormatException, IOException{
         File f = new File("Clientes.txt");
        if (f.exists()){
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            Boolean x = false;
            while((linea= br.readLine())!=null){
                String[] ar = linea.split("%");
                if((ar[8].equalsIgnoreCase(ape)&&ar[9].equalsIgnoreCase(apee))&&ar[11]=="1"){
                    Clientes cliente = new Clientes(ar[0], ar[1], ar[2], ar[3], ar[4], ar[5], ar[6], ar[7], ar[8], ar[9],ar[10], ar[11]);
                    System.out.println(cliente.toString());
                    x = true;
                }
            }
            br.close();
            fr.close();
            if(!x){
                System.out.println("No se encontro a el cliente");
            }
        }else{
            System.out.println("No existe registro");
        }       
    }
    public void Eliminar(String nit) throws IllegalArgumentException, NumberFormatException, IOException {
        File f = new File("Clientes.txt");
        if (f.exists()){
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            String linea;
            Boolean x = false;
            while((linea= br.readLine())!=null){
                String[] ar = linea.split("%");
                if(ar[1].equalsIgnoreCase(nit)&&ar[11]=="1"){
                    Clientes cliente = new Clientes(ar[0], ar[1], ar[2], ar[3], ar[4], ar[5], ar[6], ar[7], ar[8], ar[9],ar[10], ar[11]);
                    bw.write(cliente.getcui()+"%"+cliente.getnit()+"%"+cliente.getDire()+"%"+cliente.getEmp()+"%"+cliente.getDiremp()+"%"+cliente.getnac()+"%"+cliente.getname1()+"%"+cliente.getname2()+"%"+cliente.getape1()+"%"+cliente.getape2()+"%"+cliente.getnum()+"%"+"2");               
                    x = true;
                    xm = false;
                }
            }
            fw.close();
            bw.close();
            br.close();
            fr.close();
            if(!x){
                System.out.println("No se encontro a el cliente");
            }
        }else{
            System.out.println("No existe registro");
        }
    }
    public boolean getxm(){
        return xm;
    }
}

