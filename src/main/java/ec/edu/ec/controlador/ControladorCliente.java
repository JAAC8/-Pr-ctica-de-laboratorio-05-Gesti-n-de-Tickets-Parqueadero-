/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.controlador;

import ec.edu.ec.dao.DAOClienteI;
import ec.edu.ec.dao.DAOCliente;

/**
 *
 * @author José Andrés Abad
 */
public class ControladorCliente {

    private DAOClienteI dao;
    private ControladorTicket cT;
    private ControladorVehiculo cV;

    public ControladorCliente(DAOCliente dao, ControladorTicket cT, ControladorVehiculo cV) {
        this.dao = dao;
        this.cT = cT;
        this.cV = cV;
    }

    public void crear() {

    }

    public void leer() {

    }

    public void actualizar() {

    }

    public void eliminar() {

    }
}
