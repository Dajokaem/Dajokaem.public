
package com.mycompany.parqueo;

import java.io.*;

public class ManejoVehiculos {
    public void Escribir(Vehiculos vehi)throws IllegalArgumentException, NumberFormatException, IOException {
        File f = new File("Vehiculos.txt");
        FileWriter fw;
        BufferedWriter bw;
        if(f.exists()&& f.length()!=0){
            fw = new FileWriter(f, true);
            bw= new BufferedWriter(fw);
            bw.newLine();
            bw.write(vehi.getplaca()+"%"+vehi.getmarca()+"%"+vehi.getlinea()+"%"+vehi.getmod()+"%"+vehi.getcol()+"%"+vehi.getnit()+"%"+"1");                    
        }else{
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            bw.write(vehi.getplaca()+"%"+vehi.getmarca()+"%"+vehi.getlinea()+"%"+vehi.getmod()+"%"+vehi.getcol()+"%"+vehi.getnit()+"%"+"1");          
        }
        bw.close();
        fw.close();
    }
    public void Leer(String placa)throws IllegalArgumentException, NumberFormatException, IOException{
        File f = new File("Vehiculos.txt");
        if (f.exists()){
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            Boolean x = false;
            while((linea= br.readLine())!=null){
                String[] ar = linea.split("%");
                if(ar[0].equalsIgnoreCase(placa)&&ar[6]=="1"){
                    Vehiculos vehi = new Vehiculos(ar[0],ar[1],ar[2],ar[3],ar[4],ar[5],ar[6]);
                    System.out.println(vehi.toString());
                    x = true;
                }
            }
            br.close();
            fr.close();
            if(!x){
                System.out.println("No se encontro el vehiculo");
            }
        }else{
            System.out.println("No existe registro");
        }         
    }
    public void Eliminar(String nit)throws IllegalArgumentException, NumberFormatException, IOException{
        File f = new File("Vehiculos.txt");
        if (f.exists()){
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            String linea;
            Boolean x = false;
            while((linea= br.readLine())!=null){
                String[] ar = linea.split("%");
                if(ar[5].equalsIgnoreCase(nit)&&ar[11]=="1"){
                    Vehiculos vehi = new Vehiculos(ar[0], ar[1], ar[2], ar[3], ar[4], ar[5], ar[6]);
                    bw.write(vehi.getplaca()+"%"+vehi.getmarca()+"%"+vehi.getlinea()+"%"+vehi.getmod()+"%"+vehi.getcol()+"%"+nit+"%"+"2");
                    x = true;
                }
            }
            fw.close();
            bw.close();
            br.close();
            fr.close();
            if(!x){
                System.out.println("No se encontro el vehiculo");
            }
        }else{
            System.out.println("No existe registro");
        }
    }
    
}
