/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalgoritmos;

/**
 *
 * @author Jose Alberto Pejuan
 */
public class Clase {
    private int capacidad = 20;
    private String nombre;
    private String codigoClase;
    private String facultad;
    private String hora;
    private String numAula;
    private Maestro profesor;
    private boolean abierta = false;
    private boolean tieneprof = false;
    private int location;
    private Aula aula;

    public Clase(String nombre, String codigoClase, String facultad) {
        this.nombre = nombre;
        this.codigoClase = codigoClase;
        this.facultad = facultad;
    }
    

    @Override
    public String toString() {
        return nombre;
    }
    
    public String toString2(){
        return "Clase: "+nombre + codigoClase + getFacultad() + hora + numAula + profesor.toString();
    }
    
    public Clase(String nombre, String hora) {
        this.nombre = nombre;
        this.hora = hora;
    }

    public Clase(String nombre) {
        this.nombre = nombre;
    }
    

    public Clase() {
    }
    
    
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void reducirCapacidad(){
        this.capacidad--;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNumAula() {
        return numAula;
    }

    public void setNumAula(String numAula) {
        this.numAula = numAula;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public String getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(String codigoClase) {
        this.codigoClase = codigoClase;
    }

    public Maestro getProfesor() {
        return profesor;
    }

    public void setProfesor(Maestro profesor) {
        this.profesor = profesor;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
        numAula = Integer.toString(aula.getNum());
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public boolean isTieneprof() {
        return tieneprof;
    }

    public void setTieneprof(boolean tieneprof) {
        this.tieneprof = tieneprof;
    }
    
}
