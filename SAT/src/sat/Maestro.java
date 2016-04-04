/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sat;

import java.util.ArrayList;

/**
 *
 * @author Jose Alberto Pejuan
 */
public class Maestro {
    private String nombre;
    private String idMaestro;
    private ArrayList<String> horasDisponible = new ArrayList();
    private ArrayList<Clase> clasesPosibles = new ArrayList();

    public Maestro(String nombre, String idMaestro) {
        this.nombre = nombre;
        this.idMaestro = idMaestro;
    }

    public Maestro() {
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(String idMaestro) {
        this.idMaestro = idMaestro;
    }

    public ArrayList<String> getHorasDisponible() {
        return horasDisponible;
    }

    public void setHorasDisponible(ArrayList<String> horasDisponible) {
        this.horasDisponible = horasDisponible;
    }

    public ArrayList<Clase> getClasesPosibles() {
        return clasesPosibles;
    }

    public void setClasesPosibles(ArrayList<Clase> clasesPosibles) {
        this.clasesPosibles = clasesPosibles;
    }
    public void removeHoraDisponible(String St){
        this.horasDisponible.remove(this.horasDisponible.indexOf(St));
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
