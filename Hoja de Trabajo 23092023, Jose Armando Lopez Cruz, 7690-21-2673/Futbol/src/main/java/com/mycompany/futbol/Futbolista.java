
package com.mycompany.futbol;

public class Futbolista extends SeleccionFutbol implements Deportista, Integrante{
    private int dorsal;
    private String demarcacion;
    Futbolista(int id, String nm, String ape, int edad, int dorsal, String demarcacion){
        super(id, nm, ape, edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }
    @Override
    public void entrenar() {
        String msg = "El jugador comienza a jugar";
        System.out.println(msg);
    }

    @Override
    public void jugarpartido() {
        String msg = "El jugador entra al campo de juego";
        System.out.println(msg);
    }

    @Override
    public void viajar() {
        String msg = "El jugador se va de viaje con el equipo";
        System.out.println(msg);
    }

    @Override
    public void concentrarse() {
        String msg = "El jugador se concentra para jugar";
        System.out.println(msg);
    }
    
}
