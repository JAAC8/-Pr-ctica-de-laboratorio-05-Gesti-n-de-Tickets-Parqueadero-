/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.dao;

import ec.edu.ec.modelo.Cliente;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/**
 *
 * @author José Andrés Abad
 */
public class DAOCliente implements DAOClienteI {

    Set<Cliente> clientes;

    public DAOCliente() {
        clientes = new HashSet<>();
    }

    @Override
    public void create(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente read(String cedula) {
        Iterator it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = (Cliente) it.next();
            if(c.getCedula().equals(cedula)){
                return c;
            }
            
        }
        return null;
    }

    @Override
    public void update(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
