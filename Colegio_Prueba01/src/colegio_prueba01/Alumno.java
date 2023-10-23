package colegio_prueba01;
// Jose Armando Lopez Cruz, 7690-21-2673

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity

public class Alumno implements Serializable {

    @Id
    protected long dpi;
    @Basic
    protected String nm;
    protected String ape;
    @Transient
    ArrayList<Examenes> lista = new ArrayList();
    //No pude comprender como implementar interfaces en este problema, asi que cree una clase interna para los examanes
    //Especificamente, este Arraylist funge como una base de datos para cada objeto de la clase alumno, es decir, cada alumno tiene su propio registro

    public Alumno() {
    }

    public Alumno(long dpi, String nm, String ape) {
        this.dpi = dpi;
        this.nm = nm;
        this.ape = ape;
    }

    class Examenes implements Serializable {

        private final int dur;
        private final String nota;
        private final String mt;

        Examenes(int dur, String nota, String mt) {
            this.dur = dur;
            this.nota = nota;
            this.mt = mt;
        }

        public String[] apr() {
            String[] msg = new String[3];
            msg[0] = String.valueOf(this.dur);
            msg[1] = this.nota;
            msg[2] = this.mt;
            return msg;
        }
    }

    public void Registro(int d, String nt, String mm) {
        lista.add(new Examenes(d, nt, mm));
    }

    public void mostrar() {
        String msg = "Nombre: " + this.nm + " Apellido: " + this.ape + " DPI: " + this.dpi;
        System.out.println(msg);
    }

    public long getdpi() {
        return this.dpi;
    }
// Aqui se comprueban mediante un metodo de la clase Alumno, devuelve true si el alumno aprobo y falso por lo contrario.

    public boolean aprobados() {
        int i = 0;
        int j = 0;
        for (i = 0; i < lista.size(); i++) {
            String[] msg = lista.get(i).apr();//El primer If, verifica si el examen a evaluar sea oral y que lo haya aprobado
            if (((Integer.parseInt(msg[0]) <= 90)) && (!("insuficiente".equalsIgnoreCase(msg[1])))) {
                j = j + 1;
            } else {
                if (msg[1].length() <= 2) {
                    if ((Integer.parseInt(msg[0]) <= 90) && (Integer.parseInt(msg[1]) >= 6)) {
                        j = j + 1;
                    }
                }
            }
        }
        if (j == lista.size()) {
            return true;
        } else {
            return false;
        }

    }

    public void Mostrar() {
        String msg = "";
        System.out.println("este alumno si existe");
    }
}
