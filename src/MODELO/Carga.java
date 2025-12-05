/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.io.Serializable;

/**
 *
 * @author keilagarcia
 */
public class Carga implements Serializable{
    
    private String nombre, fabricante, identificador, marca, paisProcedencia, fechaCaducidad;
    private double valor, indiceRiesgo;

    public Carga(String nombre, String fabricante, String identificador, String marca, String paisProcedencia, String fechaCaducidad, double valor, double indiceRiesgo) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.identificador = identificador;
        this.marca = marca;
        this.paisProcedencia = paisProcedencia;
        this.fechaCaducidad = fechaCaducidad;
        this.valor = valor;
        this.indiceRiesgo = indiceRiesgo;
    }

    public Carga(String nombre, String fabricante, String identificador, String marca, String paisProcedencia, double valor, double indiceRiesgo) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.identificador = identificador;
        this.marca = marca;
        this.paisProcedencia = paisProcedencia;
        this.valor = valor;
        this.indiceRiesgo = indiceRiesgo;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getIndiceRiesgo() {
        return indiceRiesgo;
    }

    public void setIndiceRiesgo(double indiceRiesgo) {
        this.indiceRiesgo = indiceRiesgo;
    }

    
}
