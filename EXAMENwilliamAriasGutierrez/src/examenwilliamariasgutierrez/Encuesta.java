/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenwilliamariasgutierrez;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Encuesta {
  /**
     * @param args the command line arguments
     */
   
        private static ArrayList<String> Nombre = new ArrayList<String>();
        private static ArrayList<String> Fechan = new ArrayList<String>();
        private static ArrayList<String> Edad = new ArrayList<String>();
        private static ArrayList<String> Correo = new ArrayList<String>();
        private static ArrayList<String> Carro = new ArrayList<String>();
    public Encuesta() {
    Nombre.clear();
    Fechan.clear(); 
    Edad.clear();
    Correo.clear();   
    Carro.clear();        
    }
    public static ArrayList<String> getNombre() {
        return Nombre;
    }

    public static ArrayList<String> getFechan() {
        return Fechan;
    }

    public static ArrayList<String> getEdad() {
        return Edad;
    }

    public static ArrayList<String> getCorreo() {
        return Correo;
    }

    public static ArrayList<String> getCarro() {
        return Carro;
    }

    public static void setNombre(String nombre) {
        Nombre.add(nombre);
    }

    public static void setFechan(String fechan) {
        Fechan.add(fechan);
    }

    public static void setEdad(String edad) {
        Edad.add(edad);
    }

    public static void setCorreo(String correo) {
        Correo.add(correo);
    }

    public static void setCarro(String carro) {
        Carro.add(carro);
    }   
}
