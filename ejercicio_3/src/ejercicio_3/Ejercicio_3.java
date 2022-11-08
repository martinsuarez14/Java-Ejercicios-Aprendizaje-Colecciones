/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import Servicio.ServicioAlumno;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioAlumno serAlum = new ServicioAlumno();
        
        serAlum.ingresarAlumnos();
        
        serAlum.mostrarAlumnos();
        
        
        System.out.println("Ingrese un nombre a buscar");
        String nombre = leer.next();
        
        System.out.println("La nota final de " + nombre + " es: " + serAlum.notaFinal(serAlum.buscarAlumno(nombre)));
        
        serAlum.mostrarAlumnos();
    }
    
}
