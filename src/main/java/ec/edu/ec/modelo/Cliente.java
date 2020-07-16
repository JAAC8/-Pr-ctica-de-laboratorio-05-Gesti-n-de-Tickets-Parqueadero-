/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.modelo;

import java.util.List;

/**
 *
 * @author José Andrés Abad
 */
public class Cliente {
    private int cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Vehiculo> vehiculos;
    
    public Cliente(int cedula, String nombre, String direccion, String telefono){
        this.cedula=cedula;
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.cedula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.cedula != other.cedula) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", vehiculos=" + vehiculos + '}';
    }

    
}
