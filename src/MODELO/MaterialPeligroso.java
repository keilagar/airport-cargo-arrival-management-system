/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author keilagarcia
 */
public class MaterialPeligroso extends Carga{
    
    private String tipoRiesgo;
    private boolean transportadoAire;

    public MaterialPeligroso(String tipoRiesgo, boolean transportadoAire, String nombre, String fabricante, String identificador, String marca, String paisProcedencia, String fechaCaducidad, double valor, double indiceRiesgo) {
        super(nombre, fabricante, identificador, marca, paisProcedencia, fechaCaducidad, valor, indiceRiesgo);
        this.tipoRiesgo = tipoRiesgo;
        this.transportadoAire = transportadoAire;
    }

    public MaterialPeligroso(String tipoRiesgo, boolean transportadoAire, String nombre, String fabricante, String identificador, String marca, String paisProcedencia, double valor, double indiceRiesgo) {
        super(nombre, fabricante, identificador, marca, paisProcedencia, valor, indiceRiesgo);
        this.tipoRiesgo = tipoRiesgo;
        this.transportadoAire = transportadoAire;
    }

    public String getTipoRiesgo() {
        return tipoRiesgo;
    }

    public void setTipoRiesgo(String tipoRiesgo) {
        this.tipoRiesgo = tipoRiesgo;
    }

    public boolean isTransportadoAire() {
        return transportadoAire;
    }

    public void setTransportadoAire(boolean transportadoAire) {
        this.transportadoAire = transportadoAire;
    }
    
    
}
