package com.mycompany.colegio;
// Jose Armando Lopez Cruz, 7690-21-2673
import java.util.*;

public class Alumno {

    private int dpi;
    public String nm;
    public String ape;
    public int i = 0;
    public int j = 0;
    ArrayList<Examenes> lista = new ArrayList();//No pude comprender como implementar interfaces en este problema, asi que cree una clase interna para los examanes
    //Especificamente, este Arraylist funge como una base de datos para cada objeto de la clase alumno, es decir, cada alumno tiene su propio registro
    
    Alumno(int dpi, String nm, String ape) {
        this.dpi = dpi;
        this.nm = nm;
        this.ape = ape;
    }

    class Examenes {

        private final int dur;
        private final String nota;

        Examenes(int dur, String nota) {
            this.dur = dur;
            this.nota = nota;
        }

        public String[] apr() {
            String[] msg = new String[2];
            msg[0] = String.valueOf(this.dur);
            msg[1] = this.nota;
            return msg;
        }
    }

    public void Registro(int d, String nt) {
        lista.add(new Examenes(d, nt));
    }

    public void mostrar() {
        String msg = "Nombre: " + this.nm + " Apellido: " + this.ape + " DPI: " + this.dpi;
        System.out.println(msg);
    }

    public int getdpi() {
        return this.dpi;
    }
// Aqui se comprueban mediante un metodo de la clase Alumno, devuelve true si el alumno aprobo y falso por lo contrario.
    public boolean aprobados() {
        
        for (i = 0; i < lista.size(); i++) {
            String[] msg = lista.get(i).apr();//El primer If, verifica si el examen a evaluar sea oral y que lo haya aprobado
            if (((Integer.parseInt(msg[0]) <= 90)) && (!("insuficiente".equalsIgnoreCase(msg[1])))) {
                j= j+1;
            }else{
                if(msg[1].length()<=2){
                    if((Integer.parseInt(msg[0])<=90) && (Integer.parseInt(msg[1])>=6)){
                        j = j+1;
                    }
                }
            }
        }
        if(j == lista.size()){
            return true;
        }else{
            return false;
        }
        
    }
}
