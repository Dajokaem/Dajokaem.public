
package com.mycompany.futbol;

public class Masajista extends SeleccionFutbol implements Integrante{
    private String titulo;
    private int anio;
    Masajista(int id, String nm, String ape, int edad, String titulo, int anio){
        super(id, nm, ape, edad);
        this.titulo=titulo;
        this.anio=anio;
    }

    @Override
    public void viajar() {
        String msg = "El masajista acompaña al equipo en su viaje";
        System.out.println(msg);
    }

    @Override
    public void concentrarse() {
        String msg = "El masajista se concentra antes de encargarse del equipo";
        System.out.println(msg);
    }
    
}
