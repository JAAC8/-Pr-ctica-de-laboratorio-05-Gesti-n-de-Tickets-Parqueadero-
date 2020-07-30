/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.dao;

import ec.edu.ec.modelo.Ticket;
import ec.edu.ec.modelo.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author José Andrés Abad
 */
public class DAOTicket implements DAOTicketI {

    private Set<Ticket> tickets;
    int cont;

    public DAOTicket() {
        this.tickets = new HashSet<>();
        this.cont = 0;
    }

    @Override
    public void create(Ticket t) {
        this.tickets.add(t);
        this.cont++;
    }

    @Override
    public Ticket read(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Ticket t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int numero) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        this.cont--;
    }

    @Override
    public void findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscar(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getNumeroDeTickets(){
        return this.cont;
    }

}
