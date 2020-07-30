/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.dao;

import ec.edu.ec.modelo.Vehiculo;

/**
 *
 * @author José Andrés Abad
 */
public interface DAOVehiculoI {

    public void create(Vehiculo v);

    public Vehiculo read(String placa);

    public void update(Vehiculo v);

    public void delete(String placa);

    public void findAll();
    
    public boolean buscar(String placa);
    
    public int getNumeroVehiculos();
}
