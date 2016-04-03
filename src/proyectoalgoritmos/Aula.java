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
public class Aula {
    private int num;
    private ArrayList<String> horasutilizada = new ArrayList();

    public Aula(int num) {
        this.num = num;
    }

    public Aula() {
    }

    @Override
    public String toString() {
        return num+"";
    }
    
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ArrayList<String> getHorasutilizada() {
        return horasutilizada;
    }

    public void setHorasutilizada(ArrayList<String> horasutilizada) {
        this.horasutilizada = horasutilizada;
    }
}
