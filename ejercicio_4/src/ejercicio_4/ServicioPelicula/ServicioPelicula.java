/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4.ServicioPelicula;

import ejercicio_4.Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Pelicula p1 = new Pelicula();

    ArrayList<Pelicula> pelis = new ArrayList<>();

    public Pelicula crearPelicula() {

        System.out.println("Ingrese el Título de la película: ");
        String titulo = leer.next();

        System.out.println("Ingrese el Director de la película: ");
        String director = leer.next();

        System.out.println("Ingrese la Duración de la película: ");
        Double duracion = leer.nextDouble();

        Pelicula p = new Pelicula(titulo, director, duracion);

        return p;
    }

    public void ingresarPeliculas() {

        String opcion;

        do {
            System.out.println("Desea ingresar películas? S/N");
            opcion = leer.next();

            if (opcion.equalsIgnoreCase("s")) {
                Pelicula pe = crearPelicula();
                pelis.add(pe);
            } else {
                System.out.println("Ok papu. Nos vemos!");
                break;
            }
        } while (opcion.equalsIgnoreCase("s"));
    }

    public void mostrar() {

        Iterator it = pelis.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void mayorUnaHora() {
        System.out.println("---------::::Peliculas de más de 1 hora::::----------");
        for (Pelicula peli : pelis) {
            if (peli.getDuracion() > 1) {
                System.out.println(peli.toString());
            }
            System.out.println("");

        }
        /*
public void mostrasMayor1hr(){
        System.out.println("---------::::Peliculas de mÃ¡s de 1 hora::::----------");
        Iterator<Pelicula> it= peliLista.iterator();
        while (it.hasNext()) {
            Pelicula aux = it.next();
             if (aux.getHoras()>1) {
                 System.out.println("Titulo: "+aux.getTitulo()+ "\n"
                         +  "Director: "+ aux.getDirector()+" \n"
                                 + "DuraciÃ³n: "+aux.getHoras());
                 System.out.println("----------------");
             }
        }
    }
         */
    }

    public static Comparator<Pelicula> compararMayorAmenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }

    };

    public static Comparator<Pelicula> compararMenorAMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }

    };

    public static Comparator<Pelicula> compararXTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }

    };

    public static Comparator<Pelicula> compararXDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }

    };

    public void mayorHora() {
        System.out.println("---------::::Peliculas ordenadas de Mayor a Menor::::----------");

        Collections.sort(pelis, compararMayorAmenor);
        for (Pelicula peli : pelis) {
            System.out.println(peli);
        }
        System.out.println("");

    }

    public void menorHora() {
        System.out.println("---------::::Peliculas ordenadas de Menor a Mayor::::----------");
        Collections.sort(pelis, compararMenorAMayor);
        for (Pelicula peli : pelis) {
            System.out.println(peli);
        }
        System.out.println("");

    }

    public void compararTitulo() {
        System.out.println("---------::::Peliculas por Título::::----------");

        Collections.sort(pelis, compararXTitulo);
        for (Pelicula peli : pelis) {
            System.out.println(peli);
        }
        System.out.println("");

    }

    public void compararDirector() {
        System.out.println("---------::::Peliculas por Director::::----------");

        Collections.sort(pelis, compararXDirector);
        for (Pelicula peli : pelis) {
            System.out.println(peli);
        }
        System.out.println("");

    }

}
