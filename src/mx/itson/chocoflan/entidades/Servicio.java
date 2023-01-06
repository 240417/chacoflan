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
public class Servicio extends Concepto {
    
    @Override
    public List<Impuesto>calcularImpuestos(){
        List<Impuesto> impuestos = new ArrayList<>();
    
        Impuesto iva = new Impuesto();
        iva.setNombre("IVA");
        iva.setMonto(getPrecio()*0.16);
        
        Impuesto isr = new Impuesto();
        isr.setNombre("ISR");
        isr.setMonto(getPrecio()*0.30);
        
        impuestos.add(iva);
        
        return impuestos;
    }
    
    public double calcularTotal(List<Impuesto>impuestos){
        double precio = getPrecio();
        
        for(Impuesto i : impuestos){
            precio += i.getMonto();       
        }
        
        return precio;
    }
    
}
