/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Tienda {
    
    private String producto;
    private Double precio;

    public Tienda() {
    }

    public Tienda(String producto, Double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    

    @Override
    public String toString() {
        return "Tienda{" + "precio=" + precio + ", producto=" + producto + '}';
    }
    
}
