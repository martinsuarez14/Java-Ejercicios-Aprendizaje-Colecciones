/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioPais {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    HashSet<Pais> listaPaises = new HashSet<>();

    Pais p = new Pais();
    
    public void ingresarPais() {

        String respuesta = "";
        
        do {
            Pais p1 = new Pais();

            System.out.println("Ingrese el nombre del País: ");
            String nombre = leer.next();
            p1.setNombre(nombre);

            listaPaises.add(p1);
            
            System.out.println("");
            System.out.println("¿Desea ingresar más países?");
            respuesta = leer.next();
            
        } while (respuesta.equalsIgnoreCase("s"));
    }
    
    public static Comparator<Pais> compararAlfabeticamente = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
    
    public void mostrarPaises(){
        
        System.out.println("Ordenados Alfabéticamente");
        ArrayList<Pais> aux = new ArrayList<>(listaPaises);
        
        Collections.sort(aux, compararAlfabeticamente);
        
        for (Pais pais : aux) {
            System.out.println(pais.getNombre());
        }
        System.out.println("");
        
    }
    
    public void eliminar(){
        
        System.out.println("Ingrese el país a eliminar: ");
        String nombre = leer.next();
        boolean seEncontro = false;
        
        Iterator<Pais> it = listaPaises.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(nombre)){
                it.remove();
                seEncontro = true;
            }
        }
        if (seEncontro == false) {
            System.out.println("Tu país no fue al mundial.");
        } else{
            System.out.println("Argentina te saca la copa.");
        }
        
        System.out.println("");
        
        mostrarPaises();
    }

}
