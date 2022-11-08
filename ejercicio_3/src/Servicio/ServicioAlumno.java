/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;
import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class ServicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> alumnos = new ArrayList<>();

    Alumno a = new Alumno();

    public void ingresarAlumnos() {

        String respuesta;

        do {
            crearAlumno();

            System.out.println("¿Desea ingresar otro alumno? S/N");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("s"));

    }

    private Alumno crearAlumno() {
        System.out.println("Ingrese el nombre del Alumno: ");
        String nombre = leer.next();

        System.out.println("Ingrese la nota del primer trimestre: ");
        int nota1 = leer.nextInt();

        System.out.println("Ingrese la nota del segundo trimestre: ");
        int nota2 = leer.nextInt();

        System.out.println("Ingrese la nota del tercer trimestre: ");
        int nota3 = leer.nextInt();
        ArrayList<Integer> not = new ArrayList<>();

        not.add(nota1);
        not.add(nota2);
        not.add(nota3);

        Alumno a1 = new Alumno();

        a1.setNombre(nombre);
        a1.setNotas(not);

        alumnos.add(a1);

        return a1;
    }

    public void notaFinal(Alumno alum) {

        int promedio;
        int suma = 0;

        for (int nota : alum.getNotas()) {
            suma += nota;
        }
        alum.setNotaFinal(suma / alum.getNotas().size());
        
        System.out.println("La nota final de " + alum.getNombre() + " es: " + alum.getNotaFinal());
    }

    public Alumno buscarAlumno() {
        System.out.println("Ingrese el nombre del alumno: ");
        String nom = leer.next();
        
        Alumno alum = null;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nom)) {
                alum = alumno;
                break;
            }
        }
        return alum;
        
    }

    public void mostrarAlumnos() {
        Iterator it = alumnos.iterator();
        System.out.println("Elementos de la lista: ");
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }
}
