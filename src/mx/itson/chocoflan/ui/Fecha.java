/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.chocoflan.ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import mx.itson.chocoflan.entidades.Movimiento;

/**
 *
 * @author Jesus
 */
public class Fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Movimiento>movimientos= new ArrayList();
        
        Movimiento movimiento1 = new Movimiento();
        movimiento1.setMonto(1500);
        movimiento1.setFecha(new GregorianCalendar(2022,Calendar.AUGUST,18).getTime());
        movimientos.add(movimiento1);
        Movimiento movimiento = new Movimiento();
        movimiento.setMonto(1500);
        movimiento.setFecha(new GregorianCalendar(2023,Calendar.MAY,10).getTime());
        movimientos.add(movimiento);
        Movimiento movimiento2 = new Movimiento();
        movimiento2.setMonto(1500);
        movimiento2.setFecha(new GregorianCalendar(2011,Calendar.APRIL,17).getTime());
        movimientos.add(movimiento2);
        Movimiento movimiento3 = new Movimiento();
        movimiento3.setMonto(1500);
        movimiento3.setFecha(new GregorianCalendar(2021,Calendar.JUNE,15).getTime());
        movimientos.add(movimiento3);
        Movimiento movimiento4 = new Movimiento();
        movimiento4.setMonto(1500);
        movimiento4.setFecha(new GregorianCalendar(2032,Calendar.MARCH,05).getTime());
        movimientos.add(movimiento4);
        
        DateFormat formatFecha = new SimpleDateFormat("dd/MMMM/YYYY");
        
        System.out.println("DESORDENADO");
        for(Movimiento m : movimientos){
            System.out.println(formatFecha.format(m.getFecha())+"   "+ m.getMonto());
        }
        
        movimientos.sort((mov1,mov2)->mov1.getFecha().compareTo(mov2.getFecha()));
        
        System.out.println("ORDENADO");
        for(Movimiento m : movimientos){
            System.out.println(formatFecha.format(m.getFecha())+"   "+ m.getMonto());
        }
        
    }
    
}
