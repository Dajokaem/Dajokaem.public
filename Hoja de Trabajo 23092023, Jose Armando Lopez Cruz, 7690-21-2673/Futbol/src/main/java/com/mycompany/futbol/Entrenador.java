
package com.mycompany.futbol;


public class Entrenador extends SeleccionFutbol implements Deportista, Integrante {
    private String idf;
    Entrenador(int id, String nm, String ape, int edad, String idf){
        super(id, nm, ape, edad);
        this.idf=idf;
    }

    @Override
    public void entrenar() {
        String msg = "El entrenador hace al equipo empezar el entrenamiento";
        System.out.println(msg);
    }

    @Override
    public void jugarpartido() {
        String msg = "";
        System.out.println(msg);
    }

    @Override
    public void viajar() {
        String msg = "El entrenador acompaña al equipo durante su viaje";
        System.out.println(msg);
    }

    @Override
    public void concentrarse() {
        String msg = "El entrenador se concentra por el equipo";
        System.out.println(msg);
    }
    
}
