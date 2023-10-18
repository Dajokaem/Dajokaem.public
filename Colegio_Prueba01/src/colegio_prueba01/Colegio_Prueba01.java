/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegio_prueba01;

import java.util.*;

public class Colegio_Prueba01 {

    static ArrayList<Alumno> alumnos = new ArrayList();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        conexion.Conectar();
        int dp, dur, i, j, op = 0, po;
        String name, ape, not, nada;
        do {
            op = menu();
            switch (op) {
                case 1:
                    System.out.println("Ok, Dame los datos del Alumno");
                    System.out.println("Dame su dpi");
                    dp = leer.nextInt();
                    System.out.println("Dame su nombre");
                    name = leer.next();
                    System.out.println("Dame su apellido");
                    ape = leer.next();
                    alumnos.add(new Alumno(dp, name, ape));
                    System.out.println("El alumno ha sido registrado");
                    System.out.println("Si quieres registrar sus examenes, selecciona la opcion 2 e ingresa el DPI del alumno");
                    break;
                case 2:
                    System.out.println("Ok, dame el DPI del alumno dueño de este examen");
                    po = 0;
                    dp = leer.nextInt();
                    System.out.println(alumnos.size());
                    for (i = 0; i < alumnos.size(); i++) {
                        System.out.println("xxxx");
                        if (dp == alumnos.get(i).getdpi()) {
                            po = i;
                        }
                    }
                    if ((po != 0)||(po == 0)) {
                        System.out.println("El alumno ha sido encontrado");
                        alumnos.get(po).mostrar();
                        System.out.println("Dame los datos del examen");
                        System.out.println("Fue oral o escrito");
                        nada = leer.next();
                        if (nada.equalsIgnoreCase("oral")) {
                            System.out.println("Cual fue el resultado");
                            dur = 0;
                            not = leer.next();
                        } else{
                            System.out.println("Dame su duracion");
                            dur = leer.nextInt();
                            System.out.println("Dame la nota del examen");
                            not = leer.next();
                        }
                        alumnos.get(po).Registro(dur, not.toLowerCase());
                    }else{
                        System.out.println("Lo lamento, El dpi ingresado es incorrecto o no existe en el sistema");
                    }
                    break;
                case 3:
                    System.out.println("Ok, aqui estan los alumnos registrados");
                    for(i = 0; i<alumnos.size();i++){
                        alumnos.get(i).mostrar();
                    }
                    break;
                case 4:
                    System.out.println("Ok, se buscaran a los alumnos aprobados");
                    boolean x = false;
                    for(i = 0;i<alumnos.size();i++){
                        x = alumnos.get(i).aprobados();
                        if(x){
                            alumnos.get(i).mostrar();
                        }
                    }
                    if(!x){
                        System.out.println("No se encontraron alumnos aprobados");
                    }
                    break;

                case 0:
                    System.out.println("Esta bien, Vuelve pronto");
                    op = 0;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (op != 0);
    }

    public static int menu() {
        String a;
        System.out.println("Que desea hacer?");
        System.out.println("1. Registrar a un Alumno");
        System.out.println("2. Registrar un examen");
        System.out.println("3. Listar a todos los alumnos");
        System.out.println("4. Listar a los estudiantes aprobados");
        System.out.println("0. Salir");
        a = leer.next();
        return Integer.parseInt(a);
    }

}

