/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.modelo;

import java.util.Date;

/**
 *
 * @author José Andrés Abad
 */
public class Ticket {
    private int numero;
    private Date fI;
    private Date fS;
    private double total;
    private Vehiculo vehiculo;
    
    public Ticket(int numero){
        this.numero = numero;
        this.fI = new Date();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getfI() {
        return fI;
    }

    public void setfI(Date fI) {
        this.fI = fI;
    }

    public Date getfS() {
        return fS;
    }

    public void setfS(Date fS) {
        this.fS = fS;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", fI=" + fI + ", fS=" + fS + ", total=" + total + ", vehiculo=" + vehiculo + '}';
    }
    
    
}
