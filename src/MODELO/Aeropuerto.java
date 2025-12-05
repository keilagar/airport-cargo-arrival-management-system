/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author keilagarcia
 */
public class Aeropuerto {
    
    private LinkedList<Carga> cargas;
    private LinkedList<Empleado> empleados;

    public Aeropuerto(LinkedList<Carga> cargas, LinkedList<Empleado> empleados) {
        this.cargas = cargas;
        this.empleados = empleados;
    }

    public LinkedList<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(LinkedList<Carga> cargas) {
        this.cargas = cargas;
    }

    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public LinkedList<Empleado> empleadosManjeanCargaPeli(){
        
        LinkedList<Empleado> empTemp = new LinkedList<>();
        
        for (Empleado empleado : empleados) {
            LinkedList<Carga> carTemp = empleado.getCargasManeja();
            for (Carga carga : carTemp) {
                if(carga.getIndiceRiesgo() > 0.66){
                    empTemp.add(empleado);
                }
            }
        }
        
        return empTemp;
    }
    
    public HashMap<Empleado, String> empleadoClasificado(){
        
        HashMap<Empleado, String> hmTemp = new HashMap<>();
        for (Empleado empleado : empleados) {
            if(empleado.getHorasExtra() >= 40 && empleado.getHorasExtra() <= 50){
                hmTemp.put(empleado, "Excelente");
            } else if (empleado.getHorasExtra() > 50 && empleado.getHorasExtra() <= 100){
                hmTemp.put(empleado, "Super");
            } else if(empleado.getHorasExtra() > 100) {
                hmTemp.put(empleado, "Empleado del mes");
            }
        }
        
        return hmTemp;
    }
    
}
