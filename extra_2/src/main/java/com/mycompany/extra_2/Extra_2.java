/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.extra_2;

import Entidad.Cantante;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Cantante> listaCantantes = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Cantante c = new Cantante();
            System.out.println("Ingrese el nombre: ");
            c.setNombre(sc.next());
            System.out.println("Ingrese el disco más vendido: ");
            c.setDiscoMasVendido(sc.next());

            listaCantantes.add(c);

        }

        System.out.println("-----------------");
        System.out.println("Los cantantes ingresados son: ");
        for (Cantante cantante : listaCantantes) {
            System.out.println(cantante.toString());
        }

        int op;
        boolean flag = true;
        do {

            System.out.println("------------------\n"
                    + "----MENÚ----\n"
                    + "1. Agregar Cantante\n"
                    + "2. Mostrar lista\n"
                    + "3. Eliminar Cantante\n"
                    + "4. Salir\n"
                    + "Ingrese una opción: \n");
            op = sc.nextInt();

            System.out.println("--------------");
            switch (op) {
                case 1:
                    Cantante c = new Cantante();
                    System.out.println("Ingrese el nombre: ");
                    c.setNombre(sc.next());
                    System.out.println("Ingrese el disco más vendido: ");
                    c.setDiscoMasVendido(sc.next());

                    listaCantantes.add(c);
                    break;
                case 2:
                    System.out.println("-----------------");
                    System.out.println("Los cantantes ingresados son: ");
                    for (Cantante cantante : listaCantantes) {
                        System.out.println(cantante.toString());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre a eliminar: ");
                    String nombre = sc.next();
                    for (int i = 0; i < listaCantantes.size(); i++) {
                        if (listaCantantes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                            listaCantantes.remove(i);
                        }
                    }
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("La opción ingresada no es correcta!");
            }

        } while (flag == true);

    }
}

