/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Propietario {
    private String nombrePro;
    private String apellidoPro;
    private int edadPro;
    
    public Propietario(String nombre, String apellido, int edad) {
        nombrePro = nombre;
        apellidoPro = apellido;
        edadPro = edad;
    }
    
    public void establecerNombrePropietario(String n) {
        nombrePro = n;
    }
    
    public void establecerApellidoPropietario(String n) {
        apellidoPro = n;
    }
    
    public void establecerEdadPropietario(int n) {
        edadPro = n;
    }
    
    public String obtenerNombrePropietario() {
        return nombrePro;
    }
    
    public String obtenerApelldoPropietario() {
        return apellidoPro;
    }
    
    public int obtenerEdadPropietario() {
        return edadPro;
    }
}
