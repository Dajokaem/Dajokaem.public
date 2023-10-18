
package com.mycompany.futbol;

import java.util.*;

public class Futbol {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
      ArrayList<Futbolista> jugadores = new ArrayList();
      ArrayList<Entrenador> entrenadores = new ArrayList();
      ArrayList<Masajista> masajistas= new ArrayList();
      String nm, ape, idf, tit, dem;
      int id, ed, dr, anio, op;
      do{
      
      op = menu();
      switch(op){
          case 1:
              System.out.println("Ok, Dame entonces la informacion del jugador");
              System.out.println("Dame su nombre");
              nm = leer.next();
              System.out.println("Dame su ID");
              id = leer.nextInt();
              System.out.println("Dame su apellido");
              ape = leer.next();
              System.out.println("Dame su edad");
              ed = leer.nextInt();
              System.out.println("Dame su dorsal");
              dr = leer.nextInt();
              System.out.println("Dame su demarcacion");
              dem = leer.next();
              jugadores.add(new Futbolista(id, nm, ape, ed, dr, dem));
              System.out.println("Ha sido registrado");
              break;
          case 2:
              System.out.println("Ok, Dame entonces la informacion del entrenador");
              System.out.println("Dame su nombre");
              nm = leer.next();
              System.out.println("Dame su ID");
              id = leer.nextInt();
              System.out.println("Dame su apellido");
              ape = leer.next();
              System.out.println("Dame su edad");
              ed = leer.nextInt();
              System.out.println("Dame el Id de su federacion");
              idf = leer.next();
              entrenadores.add(new Entrenador(id, nm, ape, ed, idf)); 
              System.out.println("Ha sido registrado");
              break;
          case 3:
              System.out.println("Ok, Dame entonces la informacion del Masajista");
              System.out.println("Dame su nombre");
              nm = leer.next();
              System.out.println("Dame su ID");
              id = leer.nextInt();
              System.out.println("Dame su apellido");
              ape = leer.next();
              System.out.println("Dame su edad");
              ed = leer.nextInt();
              System.out.println("Cual es su titulo?");
              tit = leer.next();
              System.out.println("En que anio lo obtuvo?");
              anio = leer.nextInt();
              masajistas.add(new Masajista(id, nm, ape, ed, tit, anio));   
              System.out.println("Ha sido registrado");
              break;
          case 0:
              System.out.println("Vuelve pronto");
              break;
          default: 
              System.out.println("No es una opcion valida");
              break;
      }
      }while(op != 0);
      
    }
static public int menu(){
    int op = 0;
    System.out.println("A quien quieres registrar?");
    System.out.println("1. Jugadores");
    System.out.println("2. Entrenadores");
    System.out.println("3. Masajistas");
    System.out.println("0. Salir");
    op = leer.nextInt();
    return op;
}
}



