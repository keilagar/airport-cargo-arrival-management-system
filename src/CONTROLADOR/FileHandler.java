/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Carga;
import MODELO.Empleado;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

/**
 *
 * @author keilagarcia
 */
public class FileHandler {
    
    public void guardarCarga(Carga cargas) throws FileNotFoundException, IOException{
        String nombreTemp = cargas.getIdentificador() + ".dat";
        
        ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(nombreTemp));
        Carga cargaTemp = cargas;
        archivo.writeObject(cargaTemp);
        archivo.close();
    }
    
    public void guardar(LinkedList<Carga> cargas) throws FileNotFoundException, IOException{
        ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("cargas.dat"));
        LinkedList<Carga> cargaT = cargas;
        archivo.writeObject(cargaT);
        archivo.close();
    }
    
    public void guardarEmpleados(LinkedList<Empleado> empleados) throws FileNotFoundException, IOException{
        ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("empleados.dat"));
        LinkedList<Empleado> datos = empleados;
        archivo.writeObject(datos);
        archivo.close();
    }
    
    public LinkedList<Carga> mostrarCargas() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream("cargas.dat"));
        LinkedList<Carga> cargas = (LinkedList<Carga>) archivo.readObject();
        archivo.close();
        return cargas;
    }
    
    public LinkedList<Empleado> mostrarEmpleados() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream("empleados.dat"));
        LinkedList<Empleado> datos = (LinkedList<Empleado>) archivo.readObject();
        archivo.close();
        return datos;
    }
}
