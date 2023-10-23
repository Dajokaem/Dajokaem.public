package colegio_prueba01;

import Persistencia.ControladoraPersistencia;
import java.util.*;

public class Colegio_Prueba01 {

    static List<Alumno> alumnos;
    static Scanner leer = new Scanner(System.in);
    static ControladoraPersistencia control = new ControladoraPersistencia();

    public static void main(String[] args) {
        System.out.println("Cargando Base de Datos a RAM.....");
        descargar();
        System.out.println("Listo");
        int dur, i, j, op = 0, po;
        long dp;
        String name, ape, not, nada, mm;
        do {
            op = menu();
            switch (op) {
                case 1:
                    System.out.println("Ok, Dame los datos del Alumno");
                    System.out.println("Dame su dpi");
                    dp = leer.nextLong();
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
                    dp = leer.nextLong();
                    System.out.println(alumnos.size());
                    for (i = 0; i < alumnos.size(); i++) {
                        System.out.println("xxxx");
                        if (dp == alumnos.get(i).getdpi()) {
                            po = i;
                        }
                    }
                    if ((po != 0) || (po == 0)) {
                        System.out.println("El alumno ha sido encontrado");
                        alumnos.get(po).mostrar();
                        System.out.println("Dame los datos del examen");
                        System.out.println("Fue oral o escrito");
                        nada = leer.next();
                        if (nada.equalsIgnoreCase("oral")) {
                            System.out.println("Cual fue el resultado");
                            dur = 0;
                            not = leer.next();
                        } else {
                            System.out.println("Dame su duracion");
                            dur = leer.nextInt();
                            System.out.println("Dame la nota del examen");
                            not = leer.next();
                        }
                        System.out.println("Dame el codigo de materia del examen");
                        mm = leer.next();
                        alumnos.get(po).Registro(dur, not.toLowerCase(), mm);
                    } else {
                        System.out.println("Lo lamento, El dpi ingresado es incorrecto o no existe en el sistema");
                    }
                    break;
                case 3:
                    System.out.println("Ok, aqui estan los alumnos registrados");
                    for (i = 0; i < alumnos.size(); i++) {
                        alumnos.get(i).mostrar();
                    }
                    break;
                case 4:
                    System.out.println("Ok, se buscaran a los alumnos aprobados");
                    boolean x = false;
                    for (i = 0; i < alumnos.size(); i++) {
                        x = alumnos.get(i).aprobados();
                        if (x) {
                            alumnos.get(i).mostrar();
                        }
                    }
                    if (!x) {
                        System.out.println("No se encontraron alumnos aprobados");
                    }
                    break;

                case 0:
                    System.out.println("Desea cargar los cambios hechos a la base de datos? Y/N");
                    String pp = leer.next();
                    if (pp.equalsIgnoreCase("y")) {
                        cargar();
                    } else {
                        System.out.println("Esta bien, Vuelve pronto");
                    }
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

    public static void cargar() {
        int i;
        for (i = 0; i < alumnos.size(); i++) {
            control.crearAlumno(alumnos.get(i));
        }
    }

    public static void descargar() {
        alumnos = control.traer();
    }
}
