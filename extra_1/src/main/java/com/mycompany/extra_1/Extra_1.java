/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.extra_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra_1 {

    public static void main(String[] args) {

//Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
//los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
//introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
//programa mostrará por pantalla el número de valores que se han leído, su suma y su
//media (promedio).
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Integer> lista = new ArrayList<>();
        int num;
        int suma = 0;
        System.out.println("INGRESA NUMEROS PAPU!");

        do {

            num = leer.nextInt();

            if (num != -99) {
                lista.add(num);
                suma += num;
            } else {
                break;
            }

        } while (num != -99);
        
        System.out.println("-----LISTA-----");
        for (Integer n : lista) {
            System.out.print(n + " ");
        }
        System.out.println("");
        System.out.println("-----SUMA-----");
        System.out.println("La suma total es-> " + suma);
        
        System.out.println("");
        System.out.println("-----PROMEDIO-----");
        int promedio = suma / lista.size();
        System.out.println("El promedio es-> " + promedio);
    }
}
