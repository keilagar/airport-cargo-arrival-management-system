/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author keilagarcia
 */
public class MercanciaPerecedera  extends Carga{
    
    private String tipoMercancia;
    private boolean esNacional;

    public MercanciaPerecedera(String tipoMercancia, boolean esNacional, String nombre, String fabricante, String identificador, String marca, String paisProcedencia, String fechaCaducidad, double valor, double indiceRiesgo) {
        super(nombre, fabricante, identificador, marca, paisProcedencia, fechaCaducidad, valor, indiceRiesgo);
        this.tipoMercancia = tipoMercancia;
        this.esNacional = esNacional;
    }

    public MercanciaPerecedera(String tipoMercancia, boolean esNacional, String nombre, String fabricante, String identificador, String marca, String paisProcedencia, double valor, double indiceRiesgo) {
        super(nombre, fabricante, identificador, marca, paisProcedencia, valor, indiceRiesgo);
        this.tipoMercancia = tipoMercancia;
        this.esNacional = esNacional;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }

    public void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }

    public boolean isEsNacional() {
        return esNacional;
    }

    public void setEsNacional(boolean esNacional) {
        this.esNacional = esNacional;
    }
    
    
}
