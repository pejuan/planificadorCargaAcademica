/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalgoritmos;

import java.util.ArrayList;

/**
 *
 * @author Jose Alberto Pejuan
 */
public class Alumno {
    private String nombre;
    private String numCuenta;
    private ArrayList<Clase> clasesMatriculadas = new ArrayList();
    private ArrayList<String> horasOcupado = new ArrayList();
    private ArrayList<Clase> clasesPreferidas = new ArrayList();
    private float satisfecho = 5;
    public Alumno(String nombre, String numCuenta) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
    }
    
    public Alumno() {
        
    }

    @Override
    public String toString() {
        String añadido = "";
        for (int i = 0; i < clasesMatriculadas.size(); i++) {
            añadido += "Clase:"+clasesMatriculadas.get(i).getNombre()+"  Hora:"+clasesMatriculadas.get(i).getHora()+"\n";
        }
        return "Alumno{" + "nombre=" + nombre + ", numCuenta=" + numCuenta+"{"+añadido+"}"+ "Satisfacion(1-5):"+satisfecho;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public ArrayList<Clase> getClasesMatriculadas() {
        return clasesMatriculadas;
    }

    public void setClasesMatriculadas(ArrayList<Clase> clasesMatriculadas) {
        this.clasesMatriculadas = clasesMatriculadas;
    }

    public ArrayList<String> getHorasOcupado() {
        return horasOcupado;
    }

    public void setHorasOcupado(ArrayList<String> horasOcupado) {
        this.horasOcupado = horasOcupado;
    }
    
    public void addHorasOcupado(String hora){
        this.horasOcupado.add(hora);
    }
    public void addClase(Clase objclase){
        this.clasesMatriculadas.add(objclase);
        horasOcupado.add(objclase.getHora());
    }

    public ArrayList<Clase> getClasesPreferidas() {
        return clasesPreferidas;
    }

    public void setClasesPreferidas(ArrayList<Clase> clasesPreferidas) {
        this.clasesPreferidas = clasesPreferidas;
    }
    public void addClasePreferida(Clase objclase){
        this.clasesPreferidas.add(objclase);
    }

    public float getSatisfecho() {
        return satisfecho;
    }

    public void reducirSatisfecho(float satisfecho) {
        this.satisfecho -= satisfecho;
    }
    public void verificarSeguidas(){
        
        ArrayList<Integer> nuevasHoras = new ArrayList();
        for (int i = 0; i < horasOcupado.size(); i++) {
            if (horasOcupado.get(i).equals("7:00")) {
                nuevasHoras.add(0);
            }else if(horasOcupado.get(i).equals("8:30")){
                nuevasHoras.add(1);
            }else if(horasOcupado.get(i).equals("10:10")){
                nuevasHoras.add(2);
            }else if(horasOcupado.get(i).equals("11:30")){
                nuevasHoras.add(3);
            }else if(horasOcupado.get(i).equals("13:00")){
                nuevasHoras.add(4);
            }else if(horasOcupado.get(i).equals("14:20")){
                nuevasHoras.add(5);
            }else if(horasOcupado.get(i).equals("15:40")){
                nuevasHoras.add(6);
            }else if(horasOcupado.get(i).equals("17:10")){
                nuevasHoras.add(7);
            }else if(horasOcupado.get(i).equals("18:30")){
                nuevasHoras.add(8);
            }
        }
        nuevasHoras.sort(null);
        int anterior = -1;
        for (int i = 0; i < nuevasHoras.size(); i++) {
            if ((anterior+1)<nuevasHoras.get(i) && nuevasHoras.size()>1) {
                satisfecho -= 1;
                break;
            }else{
                anterior = nuevasHoras.get(i);
            }
        }
        if (nuevasHoras.size()==0) {
            satisfecho = 0;
        }
    }
    
}
