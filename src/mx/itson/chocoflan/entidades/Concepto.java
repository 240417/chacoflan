/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.chocoflan.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class Concepto {
    
    private String nombre;
    private String descripcion;
    private Double precio;
    
    public List<Impuesto>calcularImpuestos(){
        return new ArrayList<>();
    }
    
    @Override
    public String toString(){
        return nombre +"   "+ descripcion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        
        this.precio = precio;
    }
    
}
