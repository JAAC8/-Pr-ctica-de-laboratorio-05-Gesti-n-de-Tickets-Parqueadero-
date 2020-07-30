/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.dao;

import ec.edu.ec.modelo.Ticket;

/**
 *
 * @author José Andrés Abad
 */
public interface DAOTicketI {
    
    public void create(Ticket t);
    public Ticket read(int numero);
    public void update(Ticket t);
    public void delete(int numero);
    public void findAll();
    public void buscar(int numero);
    public int getNumeroDeTickets();

}
