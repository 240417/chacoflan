/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.chocoflan.entidades;

import java.util.Date;

/**
 *
 * @author Jesus
 */
public class Movimiento {
    private double monto;
    private Date fecha;

    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}
