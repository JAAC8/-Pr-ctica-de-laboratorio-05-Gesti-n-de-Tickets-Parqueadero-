/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.dao;

import ec.edu.ec.modelo.Cliente;

/**
 *
 * @author José Andrés Abad
 */
public interface DAOClienteI {

    public void create(Cliente c);

    public Cliente read(int cedula);

    public void update(Cliente c);

    public void delete(int cedula);

    public void findAll();
}
