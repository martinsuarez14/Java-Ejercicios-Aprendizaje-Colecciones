/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_5;

import Entidad.Pais;
import Servicio.ServicioPais;

/**
 *
 * @author Usuario
 */
public class Ejercicio_5 {

    public static void main(String[] args) {
        Pais p = new Pais();
                
            
        ServicioPais serPais = new ServicioPais();
        
        serPais.ingresarPais();
        
        serPais.mostrarPaises();
        
        serPais.eliminar();
        


        
        
        
    }
}
