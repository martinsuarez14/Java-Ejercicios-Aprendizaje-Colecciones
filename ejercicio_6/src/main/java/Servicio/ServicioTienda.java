/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Tienda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author Usuario
 */
public class ServicioTienda {

    HashMap<String, Double> carliMoni = new HashMap<>();

    Tienda t1 = new Tienda();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void ingresarProductos() {

        String respuesta;
        do {
            System.out.println("Ingrese el nombre del producto");
            t1.setProducto(leer.next());
            System.out.println("Ingrese el precio del producto");
            t1.setPrecio(leer.nextDouble());

            carliMoni.put(t1.getProducto(), t1.getPrecio());

            System.out.println("Desea seguir agregando productos? S/N");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("s"));
        System.out.println("");

    }

    public void modificarPrecio() {
        String opcion;
        System.out.println("Ingrese el nombre del producto");
        opcion = leer.next();

        if (carliMoni.containsKey(opcion)) {
            System.out.println("Ingrese el nuevo precio");
            t1.setPrecio(leer.nextDouble());
            carliMoni.replace(opcion, t1.getPrecio());
        }
        System.out.println("");

    }

    public void eliminarProductos() {
        String opcion;
        System.out.println("¿Qué producto desea eliminar?");
        opcion = leer.next();
        carliMoni.remove(opcion);
        System.out.println("");
    }

    public void mostrarProductos() {
        System.out.println("-------PRODUCTOS-------");

        for (Map.Entry<String, Double> entry : carliMoni.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + " $" + value);

        }
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("---BIENVENIDO---\n"
                    + "1. Ingresar Productos\n"
                    + "2. Modificar Precio\n"
                    + "3. Eliminar Productos\n"
                    + "4. Mostrar Productos\n"
                    + "5. Salir");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    ingresarProductos();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProductos();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Gracias! Vuelva Prontos");
                    break;
                case 6:
                    System.out.println("Ordenados Alfabéticamente");
                    ordenadosAlf();
                    break;
                case 7:
                    System.out.println("Ordenados de mayor a menor precio");
                    break;
                default:
                    System.out.println("La opción ingresada no es correcta.");
            }
        } while (opcion != 5);

    }
    
    public void ordenadosAlf(){
        Set setDeClaves = carliMoni.keySet();
        
        List miLista = new ArrayList(setDeClaves);
        
        Collections.sort(miLista);
    }
          
   
    /*
    HashMap<Integer, Alumno> alumnos = new HashMap();
//Se usa una función de los mapas para traer todos valores.
ArrayList<Alumno> nombres = new ArrayList(map.values());
nombres.sort(Alumno.compararDni);
*/
}
