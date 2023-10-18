/*
Este es un programa que conforma el proyecto final del curso de Programacion I del primer semestre del Año 2023 seccion A. 
Este programa fue hecho por Jose Armando Lopez Cruz, con carne 7690-21-2673. 
Este programa cumple la funcion de llevar el registro de un estacionamiento publico, llevando cuenta de cada cliente
su vehiculo, el lugar donde se estaciono y cuando lo hizo.
*/

package com.mycompany.parqueo;
import java.util.*;
import java.io.*;
public class Parqueo {

    public static void main(String[] args){
        Scanner lr = new Scanner(System.in);
        String[] dt = new String[20];
        
        ManejoParqueos parqueos = new ManejoParqueos();
        ManejoVehiculos vehiculos = new ManejoVehiculos();
        int op =0, pr;
        do{
            ManejoClientes clientes = new ManejoClientes();
            try{
                op = menu1();
                switch(op){
                    case 1:
                       try{
                        System.out.println("Ok, Dame su cui");
                        dt[1]=lr.next();
                        pr = Integer.parseInt(dt[1]);//verifica si es un numero
                        if(!(prcui(dt[1]))){
                            System.out.println("Cui invalido");
                            break;
                        }
                        System.out.println("Dame su nit");
                        dt[2]= lr.next();
                        System.out.println("Dame la direccion de residencia");
                        dt[3]=lr.next();
                        System.out.println("Dame el nombre de su empresa");
                        dt[4]=lr.next();
                        System.out.println("Dame la direccion de su empresa");
                        dt[5]=lr.next();
                        System.out.println("Dame su fecha de nacimiento");
                        dt[6]=lr.next();
                        if(!prfch(dt[6])){
                            System.out.println("fecha invalida");
                            break;
                        }
                        System.out.println("Dame el primer nombre");
                        dt[7]=lr.next();
                        System.out.println("Dame el segundo nombre");
                        dt[8]= lr.next();
                        System.out.println("Dame su primer apellido");
                        dt[9]=lr.next();
                        System.out.println("Dame su segundo apellido");
                        dt[10]=lr.next();
                        System.out.println("Dame su numero de telefono");
                        dt[11]=lr.next();
                        pr = Integer.parseInt(dt[11]);//verifica si es un numero
                        System.out.println("Dame el numero de la placa del vehiculo");
                        dt[12]=lr.next();
                        if(!(prplaca(dt[12]))){
                            System.out.println("placa invalida");
                            break;
                        }
                        System.out.println("Dame la marca del Vehiculo");
                        dt[13]=lr.next();
                        System.out.println("Dame la linea del vehiculo");
                        dt[14]=lr.next();
                        System.out.println("dame el modelo del vehiculo");
                        dt[15]=lr.next();
                        pr = Integer.parseInt(dt[15]);//valida si es un numero
                        System.out.println("Dame el color del vehiculo");
                        dt[16]=lr.next();
                        System.out.println("Dame la fecha de su ingreso");
                        dt[17]=lr.next();
                        if(!(prfch(dt[17]))){
                            System.out.println("fecha invalida");
                            break;
                        }
                        Clientes cl = new Clientes(dt[1],dt[2], dt[3],dt[4],dt[5],dt[6],dt[7],dt[8],dt[9],dt[10], dt[11],"1");
                        clientes.escribir(cl);
                        boolean xm = clientes.getxm();
                        if(xm){
                            Vehiculos vehi = new Vehiculos(dt[12],dt[13], dt[14], dt[15],dt[16],dt[2],"1");
                            vehiculos.Escribir(vehi);
                            parqueos.Abrir();
                            parqueos.Escribir(dt[12].substring(0,1), vehi, cl, dt[17]);
                            parqueos.Cerrar();
                        }
                       }catch(IOException ex){
                           break;
                       }
                        break;
                    case 2:
                        System.out.println("Ok. En base a que desea buscarlo");
                        int opp = menu2();
                        String[] res = new String[2] ;
                        switch(opp){
                            case 1: 
                                System.out.println("Ok. Dame su nit");
                                res[0] = lr.next();
                                clientes.LeerNit(res[0]);
                                break;
                            case 2:
                                System.out.println("Ok, Dame su cui");
                                try{
                                    res[0] = lr.next();
                                    if(prcui(res[0])){
                                        clientes.LeerCui(res[0]);
                                    }else{
                                        throw new Exception("Cui invalido");
                                    }
                                }catch(Exception ex){
                                    System.out.println("Cui invalido");
                                }
                                break;
                            case 3:
                                System.out.println("Ok, Dame su primer nombre");
                                res[0]=lr.next();
                                System.out.println("Dame su segundo nombre");
                                res[1]=lr.next();
                                clientes.LeerNombres(res[0], res[1]);
                                break;
                            case 4:
                                System.out.println("Ok, Dame su primer apellido");
                                res[0]=lr.next();
                                System.out.println("Dame su segundo apellido");
                                res[1]=lr.next();
                                clientes.LeerApes(res[0], res[1]);                                
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Claro, Dame su nit");
                        String abe = lr.next();
                        clientes.Eliminar(abe);
                        boolean xm = clientes.getxm();
                        if(!xm){
                            vehiculos.Eliminar(abe); 
                            parqueos.Eliminar(abe);
                        }
                        
                        break;
                    case 4:
                        System.out.println("Ok, En base a que quieres buscarlo");
                        System.out.println("1. disponibles");
                        System.out.println("2. Asignados");
                        System.out.println("3. Un espacio especifico");
                        opp = lr.nextInt();
                        parqueos.Abrir();
                        switch(opp){
                            case 1:
                                System.out.println("Ok");
                                parqueos.leerDisponibles();
                                parqueos.Cerrar();
                                break;
                            case 2:
                                System.out.println("Ok");
                                parqueos.LeerAsignados();
                                parqueos.Cerrar();
                                break;
                            case 3:
                                System.out.println("Ok, dame el espacio a consultar");
                                int nm = lr.nextInt();
                                parqueos.leerEspecifico(nm);
                                parqueos.Cerrar();
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                parqueos.Cerrar();
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("Ok. Dame el numero de placa");
                        abe = lr.next();
                        if(prplaca(abe)){
                            vehiculos.Leer(abe);
                            
                        }else{
                            System.out.println("Numero invalido");
                            break;
                        }
                        break;
                    case 0:
                        System.out.println("Ok, Que tenga un buen dia!"); 
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
            }catch(Exception ex){
                System.out.println("Datos invalidos"+ex);
            }
        }while(op!=0);
    }
    public static int menu1()throws IllegalArgumentException, NumberFormatException, IOException{ //menu principal
        int op;
        Scanner lr = new Scanner(System.in);
      
        System.out.println("Bienvenido!");
        System.out.println("¿Que desea hacer?");
        System.out.println("1. Registrar a un nuevo Cliente ");
        System.out.println("2. Buscar a un Cliente");
        System.out.println("3. Eliminar a un Cliente");
        System.out.println("4. Consultar un espacio del parqueo");
        System.out.println("5. Consultar un vehiculo");
        System.out.println("0. Salir");
        op = Integer.parseInt(lr.next());
        return op;

    }
    public static boolean prcui(String ccc)throws IllegalArgumentException, NumberFormatException, IOException{ //validacion cui
        File f = new File ("departamentos.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        String cui = ccc.substring(9, 12);
        
        boolean x = false, y = false;
        while((linea =br.readLine())!= null){
            if(linea.equalsIgnoreCase(cui)){
                x = true;
            }
        }
        if(ccc.length()==13){
            y = true;
        }
        br.close();
        fr.close();
        if (x&&y){
            return x;
        }else{
            return x&&y;
        }
    }
    public static boolean prfch(String fch){ //validacion fechas
        
        boolean x  = false, y = false, z = false;
        if(fch.length()== 10){
            x= true;
        }
        String[] datos = fch.split("/");
        if((Integer.parseInt(datos[3])%4==0)){
            if(datos[1]=="02"){
                if(Integer.parseInt(datos[0])<29){
                    y = true;
                }
            }
        }
        if(Integer.parseInt(datos[1])<12){
            if(datos[1]=="01"||datos[1]=="05"||datos[1]=="08"||datos[1]=="12"||datos[1]=="03"||datos[1]=="07"||datos[1]=="10"){
                if(Integer.parseInt(datos[0])<=31){
                    z = true;
                }
            }else{
                if(Integer.parseInt(datos[0])<=30){
                    z = true;
                }
            }
        }
        return x&&y&&z;
    }
    public static boolean prplaca(String placa){ //validacion placas
        String tipo = placa.substring(0, 1);
        String numero = placa.substring(1,4);
        String tres = placa.substring(4,7);
        boolean x = false, y = false, z = false;
        if (tipo.equalsIgnoreCase("P")||tipo.equalsIgnoreCase("M")||tipo.equalsIgnoreCase("C")){
            x = true;
        }
        try{
            int op = Integer.parseInt(numero);
            y = true;
        }catch(Exception ex){
            y = false;
        }
        int k = 0;
        String av = "AEIOU";
        String[] v = av.split("");
        String[]tr = tres.split("");
        for(int i = 0; i <4; i++){
            for(int j = 0; j< 6;j++){
                if(!(tr[i].equalsIgnoreCase(v[j]))){
                    k = k+1;
                }
            }
        }
        if(k == 3){
            z = true;
        }
        return x&&y&&z;
    }
    public static int menu2()throws IllegalArgumentException, NumberFormatException, IOException{//menu para borrar clientes
        Scanner leer = new Scanner(System.in);
        System.out.println("1. Nit");
        System.out.println("2. Cui");
        System.out.println("3. Nombres");
        System.out.println("4. Apellidos");
        int op = leer.nextInt();
        return op;
    }

}
