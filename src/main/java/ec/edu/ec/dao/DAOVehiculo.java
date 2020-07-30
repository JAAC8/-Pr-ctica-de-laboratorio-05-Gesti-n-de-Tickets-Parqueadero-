/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.dao;

import ec.edu.ec.modelo.Cliente;
import ec.edu.ec.modelo.Vehiculo;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author José Andrés Abad
 */
public class DAOVehiculo implements DAOVehiculoI {

    private Set<Vehiculo> vehiculos;
    private int cont;
    public DAOVehiculo(){
        this.vehiculos = new HashSet<Vehiculo>();
        this.cont = 0;
    }
    
    @Override
    public void create(Vehiculo v) {
        this.vehiculos.add(v);
        this.cont++;
    }

    @Override
    public Vehiculo read(String placa) {
        Iterator it = vehiculos.iterator();
        while (it.hasNext()) {
            Vehiculo v = (Vehiculo) it.next();
            if(v.getPlaca().equals(placa)){
                return v;
            }
            
        }
        return null;
    }

    @Override
    public void update(Vehiculo v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String placa) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.cont--;
    }

    @Override
    public void findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean buscar(String placa){
        Iterator it = vehiculos.iterator();
        while (it.hasNext()) {
            Vehiculo v = (Vehiculo) it.next();
            if(v.getPlaca().equals(placa)){
                return true;
            }
            
        }        
        return false;
    }
    
    public int getNumeroVehiculos(){
        return this.cont;
    }

}
