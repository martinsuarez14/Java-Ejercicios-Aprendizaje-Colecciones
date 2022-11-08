/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import Entidad.Alumno;
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
        
        int opcion;

        do {

            System.out.println("¿Qué desea realizar? \n"
                    + "1. Ingresar Alumnos\n"
                    + "2. Eliminar Alumnos\n"
                    + "3. Nota Final de Alumno\n"
                    + "4. Mostrar Alumnos\n"
                    + "0. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    serAlum.ingresarAlumnos();
                    break;
                case 2:
                    break;
                case 3:
                    Alumno a1 = serAlum.buscarAlumno();
                    if (a1 != null) {
                        serAlum.notaFinal(a1);
                    } else {
                        System.out.println("El nombre ingresado no pertenece a ningun alumno.");
                    }
                    break;
                case 4:
                    serAlum.mostrarAlumnos();
                    break;
                case 0:
                    System.out.println("Hasta lueguillo perrito malvado!");
                    break;
                default:
                    System.out.println("El dato ingresado es erróneo. Intente nuevamente.");

            }

        } while (opcion != 0);

    }

}
