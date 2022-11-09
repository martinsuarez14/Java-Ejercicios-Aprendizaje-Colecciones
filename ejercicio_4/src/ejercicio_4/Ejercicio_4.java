/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;


import ejercicio_4.ServicioPelicula.ServicioPelicula;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en la lista de Peliculas.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioPelicula serPelis = new ServicioPelicula();
        
        serPelis.ingresarPeliculas(); //Ingresar películas
        
        serPelis.mostrar(); // mostrar todas las películas
        
        serPelis.mayorUnaHora(); //m mostrar películas con duración mayor a una hora
        
        serPelis.mayorHora(); // mostrar pelís ordenadas por duración
        
        serPelis.menorHora(); // mostrar pelis ordenadas por menor duración
        
        serPelis.compararTitulo(); // mostrar pelis ordenadas alf por titulo
        
        serPelis.compararDirector();// mostrar pelis ordenadas alf por director
        
        
    }
    
}
