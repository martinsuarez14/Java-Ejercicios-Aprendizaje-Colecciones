/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Razas {
    
    private String razas;

    public Razas() {
    }

    public Razas(String razas) {
        this.razas = razas;
    }

    public String getRazas() {
        return razas;
    }

    public void setRazas(String razas) {
        this.razas = razas;
    }

    @Override
    public String toString() {
        return "Razas{" + "razas=" + razas + '}';
    }
    
    
}
