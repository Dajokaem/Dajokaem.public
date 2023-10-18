
package com.mycompany.repasoparcial2;

import java.io.*;


public class Departamentos {
    private String ccc ;
    public Departamentos(String ccc){
        this.ccc = ccc;
    }
    public String getccc(){
        return ccc;
    }
    public void setccc(String ccc){
        this.ccc =ccc;
    }
    public void Buscar(String ccc) throws IOException{
        File f = new File ("departamentos.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        boolean x = false;
        while((linea =br.readLine())!= null){
            if(linea.equalsIgnoreCase(ccc)){
                x = true;
            }
        }
        if (x){
            System.out.println("Cui valido");
        }else{
            System.out.println("cui invalido");
        }
    }
}
