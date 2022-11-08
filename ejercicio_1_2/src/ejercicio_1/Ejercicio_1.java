/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import Entidad.Razas;
import java.util.ArrayList;
import java.util.Collections;
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
        
        /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
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
        System.out.println("");
        
        System.out.println("Ingrese una raza a eliminar: ");
        String razaBorrar = leer.nextLine();
        
        Iterator<String> it = listaRazas.iterator();
        while (it.hasNext()) {
            if (it.next().equals(razaBorrar)){
                it.remove();
            }
        }
        Collections.sort(listaRazas);
        for (String listaRaza : listaRazas) {
            System.out.print(listaRaza + ", ");
        }
        System.out.println("");
    }
}
