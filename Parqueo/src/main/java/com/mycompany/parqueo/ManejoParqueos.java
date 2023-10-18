
package com.mycompany.parqueo;

import java.io.*;

public class ManejoParqueos {
    public int tm = 200;
    public RandomAccessFile archivo;
    public void Abrir()throws IOException{
        archivo = new RandomAccessFile("parqueos.txt", "rw");
    }
    public void Cerrar()throws IOException{
        if(archivo != null){
            archivo.close();
        }
    }
    public void Escribir(String tipo, Vehiculos vehi, Clientes cliente, String fecha) throws IllegalArgumentException, IOException{
        int i = 0, j = 0;
        switch(tipo){
            case "M":
                for(i = 126;i <156;i++){
                    archivo.seek((i)*tm);
                    if(archivo!=null){
                        j =i;
                        i = 156;
                    }
                }
                archivo.writeInt(j);
                escribirCadena(archivo, vehi.getplaca());
                escribirCadena(archivo, cliente.getnit());
                escribirCadena(archivo, fecha);
               break;
            case "P":
                for(i = 1;i <= 125;i++){
                    archivo.seek((i)*tm);
                    if(archivo != null){
                        j = i;
                        i = 125;
                    }
                }
                archivo.writeInt(j);
                escribirCadena(archivo, vehi.getplaca());
                escribirCadena(archivo, cliente.getnit());
                escribirCadena(archivo, fecha);
                break;
        }

    }
    public void LeerAsignados() throws IllegalArgumentException, NumberFormatException, IOException{
        
        int i = 0, j = 0;
        for(i = 1;i <156;i++){
            if(i != 0){
            archivo.seek((i)*tm);
            if(archivo!=null){
                j = j+1;
            }
            }else{
                if(archivo != null){
                    j= j+1;
            }
        }
           System.out.println("Hay "+ j +" espacios ocupados");
        }
    }
    public void leerDisponibles()  throws IllegalArgumentException, NumberFormatException, IOException{
        int i = 0, j = 0;
        for(i = 1;i <156;i++){
            if(i != 0){
                archivo.seek((i)*tm);
                if(archivo==null){
                    j = j+1;
            }
            }else{
                archivo.seek(i);
                if(archivo==null){
                    j = j+1;
                }                
            }
        }
        System.out.println("La cantidad de parqueos disponibles es, "+j);
    }
    public void leerEspecifico(int nm) throws IllegalArgumentException, NumberFormatException, IOException{
        Parqueos park = new Parqueos();
        char[] ntt = new char[7];
        int i = 0, j = 0;
        if (nm <1|| nm> 155){
            throw new IllegalArgumentException("Fuera de rango");
        }
        if(nm !=0){
            archivo.seek((i)*tm);
            if(archivo != null){
            park.setnm(leerCadena(archivo));
            park.setplaca(leerCadena(archivo));
            park.setnit(leerCadena(archivo));
            park.setfecha(leerCadena(archivo));
            park.toString();
            File f = new File("Clientes.txt");
            if (f.exists()){
                FileReader fr = new FileReader("Clientes.txt");
                BufferedReader br = new BufferedReader(fr);
                String linea;
                Boolean x = false;
                while((linea= br.readLine())!=null){
                    String[] ar = linea.split("%");
                    if(ar[1].equalsIgnoreCase(park.getnit())&&ar[11]=="1"){
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
        File fv = new File("Vehiculos.txt");
        if (f.exists()){
            FileReader fr = new FileReader(fv);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            Boolean x = false;
            while((linea= br.readLine())!=null){
                String[] ar = linea.split("%");
                if(ar[0].equalsIgnoreCase(park.getplaca())&&ar[6]=="1"){
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
            }else{
                System.out.println("Espacio vacio");
            }   
        }else{
            
            archivo.seek(i);
            if(archivo != null){
            park.setnm(leerCadena(archivo));
            park.setplaca(leerCadena(archivo));
            park.setnit(leerCadena(archivo));
            park.setfecha(leerCadena(archivo));
            park.toString();
            File f = new File("Clientes.txt");
            if (f.exists()){
                FileReader fr = new FileReader("Clientes.txt");
                BufferedReader br = new BufferedReader(fr);
                String linea;
                Boolean x = false;
                while((linea= br.readLine())!=null){
                    String[] ar = linea.split("%");
                    if(ar[1].equalsIgnoreCase(park.getnit())&&ar[11]=="1"){
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
        File fv = new File("Vehiculos.txt");
        if (f.exists()){
            FileReader fr = new FileReader(fv);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            Boolean x = false;
            while((linea= br.readLine())!=null){
                String[] ar = linea.split("%");
                if(ar[0].equalsIgnoreCase(park.getplaca())&&ar[6]=="1"){
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
        System.out.println("Espacio vacio");
        }
        
        
        
    }
    }
    private void escribirCadena(RandomAccessFile archivo, String cadena) throws IOException {
        StringBuffer bufer = null;
        if (cadena != null) {
            bufer = new StringBuffer(cadena);
        } else {
            bufer = new StringBuffer(50);
        }
        bufer.setLength(50);
        archivo.writeChars(bufer.toString());
    }
    private String leerCadena(RandomAccessFile archivo) throws IOException {
        char nombre[] = new char[50], temp;
        for (int cuenta = 0; cuenta < nombre.length; cuenta++) {
            temp = archivo.readChar();
            nombre[cuenta] = temp;
        }

        return new String(nombre).replace('\0', ' ');
    }
    public void Eliminar(String nit)throws IllegalArgumentException, NumberFormatException, IOException{
        
    }
    
}
