/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author keilagarcia
 */
public class Empleado implements Serializable{
    
    private String nombre;
    private LinkedList<Carga> cargasManeja;
    private int horasExtra;
    private boolean esPiloto;

    public Empleado(String nombre, LinkedList<Carga> cargasManeja, int horasExtra, boolean esPiloto) {
        this.nombre = nombre;
        this.cargasManeja = cargasManeja;
        this.horasExtra = horasExtra;
        this.esPiloto = esPiloto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Carga> getCargasManeja() {
        return cargasManeja;
    }

    public void setCargasManeja(LinkedList<Carga> cargasManeja) {
        this.cargasManeja = cargasManeja;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public boolean isEsPiloto() {
        return esPiloto;
    }

    public void setEsPiloto(boolean esPiloto) {
        this.esPiloto = esPiloto;
    }
    
    
    
}
