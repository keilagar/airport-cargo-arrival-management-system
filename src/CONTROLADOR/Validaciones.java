/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

/**
 *
 * @author keilagarcia
 */
public class Validaciones {
    
    public boolean campoVacio(String dato){
        String datoTemp = dato.trim();
        if(datoTemp.equals("")){
            return false;
        }
        
        return true;
    }

    public boolean sinEspacios(String dato){
        return !(dato.equals("") || dato.contains(" "));
    }
}
