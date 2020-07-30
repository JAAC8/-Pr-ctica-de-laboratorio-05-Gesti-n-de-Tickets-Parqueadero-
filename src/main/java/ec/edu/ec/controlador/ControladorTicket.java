/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.controlador;

import ec.edu.ec.dao.DAOTicketI;
import ec.edu.ec.dao.DAOTicket;
import ec.edu.ec.modelo.Ticket;

/**
 *
 * @author José Andrés Abad
 */
public class ControladorTicket {

    private DAOTicketI dao;
    private ControladorCliente cC;
    private ControladorVehiculo cV;

    public ControladorTicket(ControladorCliente cC, ControladorVehiculo cV) {
        this.dao = new DAOTicket();
        this.cC = cC;
        this.cV = cV;
    }

    public void crear(int numero) {
        Ticket t = new Ticket(numero);
        this.dao.create(t);        
    }

    public void leer() {
        
    }

    public void actualizar() {
        
    }

    public void eliminar() {
        
    }
    
    public int getNumeroDeTickets(){
        return this.dao.getNumeroDeTickets();
    }
}
