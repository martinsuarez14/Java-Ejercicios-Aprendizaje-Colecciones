/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import Entidad.Razas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
        */
        Scanner leer = new Scanner(System.in);
        Razas r = new Razas();
        
        ArrayList<String> listaRazas = new ArrayList<>();
        
        String respuesta;
        
        do {
            System.out.println("Ingrese la raza de CHIQUITO: ");
            
            listaRazas.add(leer.nextLine());
            
            System.out.println("¿Desea seguir agregando razas? S/N");
            respuesta = leer.nextLine();
            
        } while (respuesta.equalsIgnoreCase("s"));
        
        for (String listaRaza : listaRazas) {
            System.out.print(listaRaza + ", ");
        }
        
    }
}
