/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.controlador;

import ec.edu.ec.dao.DAOTicketI;
import ec.edu.ec.dao.DAOTicket;

/**
 *
 * @author José Andrés Abad
 */
public class ControladorTicket {

    private DAOTicketI dao;
    private ControladorCliente cC;
    private ControladorVehiculo cV;

    public ControladorTicket(ControladorCliente cC, ControladorVehiculo cV) {
        this.dao = this.dao;
        this.cC = cC;
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
