/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.controlador;

import ec.edu.ec.dao.DAOClienteI;
import ec.edu.ec.dao.DAOCliente;
import ec.edu.ec.modelo.Cliente;

/**
 *
 * @author José Andrés Abad
 */
public class ControladorCliente {

    private DAOClienteI dao;
    private ControladorTicket cT;
    private ControladorVehiculo cV;

    public ControladorCliente(ControladorTicket cT, ControladorVehiculo cV) {
        this.dao = new DAOCliente();
        this.cT = cT;
        this.cV = cV;
    }

    public void crear(String cedula, String nombre, String direccion, String telefono) {
        Cliente c = new Cliente(cedula, nombre, direccion, telefono);
        dao.create(c);
    }

    public void leer() {

    }

    public void actualizar() {

    }

    public void eliminar() {

    }
}
