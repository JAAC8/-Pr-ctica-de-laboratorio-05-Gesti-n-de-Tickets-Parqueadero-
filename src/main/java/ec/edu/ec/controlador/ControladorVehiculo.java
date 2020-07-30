/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.controlador;

import ec.edu.ec.dao.DAOVehiculoI;
import ec.edu.ec.dao.DAOVehiculo;
import ec.edu.ec.modelo.Vehiculo;

/**
 *
 * @author José Andrés Abad
 */
public class ControladorVehiculo {

    private DAOVehiculoI dao;
    private ControladorCliente cC;
    private ControladorTicket cT;

    public ControladorVehiculo(ControladorCliente cC, ControladorTicket cT) {
        this.dao = new DAOVehiculo();
        this.cC = cC;
        this.cT = cT;
    }

    public void crear(String placa, String modelo, String marca) {
        Vehiculo v = new Vehiculo(placa, marca, modelo);
        this.dao.create(v);
    }

    public void leer() {

    }

    public void actualizar() {

    }

    public void eliminar() {

    }
    
    public boolean buscar(String placa){
        this.dao.buscar(placa);
        return false;
    }
    
    public int getNumeroVehiculos(){
        return this.dao.getNumeroVehiculos();
    }
}
