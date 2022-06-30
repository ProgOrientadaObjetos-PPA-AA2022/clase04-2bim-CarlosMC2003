/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil{
    protected String nomPro;
    protected String placa;
    protected double valorCan;
    
    public void establecerNombresPropietario(String n) {
        nomPro = n;
    }
    
    public void establecerPlaca(String n) {
        placa = n.toUpperCase();
    }
    
    public abstract void calcularValorAuto();
    
    public String obtenerNombres() {
        return nomPro;
    }
    
    public String obtenerPlaca() {
        return placa;
    }
    
    public double obtenerValorAuto() {
        return valorCan;
    }
}
