/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author keilagarcia
 */
public class CargaRegular extends Carga{
    
    private int horarioEntrega;

    public CargaRegular(int horarioEntrega, String nombre, String fabricante, String identificador, String marca, String paisProcedencia, String fechaCaducidad, double valor, double indiceRiesgo) {
        super(nombre, fabricante, identificador, marca, paisProcedencia, fechaCaducidad, valor, indiceRiesgo);
        this.horarioEntrega = horarioEntrega;
    }

    public CargaRegular(int horarioEntrega, String nombre, String fabricante, String identificador, String marca, String paisProcedencia, double valor, double indiceRiesgo) {
        super(nombre, fabricante, identificador, marca, paisProcedencia, valor, indiceRiesgo);
        this.horarioEntrega = horarioEntrega;
    }

    public int getHorarioEntrega() {
        return horarioEntrega;
    }

    public void setHorarioEntrega(int horarioEntrega) {
        this.horarioEntrega = horarioEntrega;
    }
    
    
}
