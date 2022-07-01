/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Arriendo;
import paquete2.Propietario;
/**
 *
 * @author reroes
 */
public class ArriendoLocalComida extends Arriendo {
    private double valorLuz;
    private double valorAgua;
    private double iva;
    
    public ArriendoLocalComida(Propietario arre, double cuotaB){
        super(arre, cuotaB);
    }
    
    public ArriendoLocalComida(Propietario arre, double cuotaB, double vl, 
            double va, double iv){
        super(arre, cuotaB);
        valorAgua = va;
        valorLuz = vl;
        iva = iv;
    }
    
    public void establecerValorLuz(double x){
        valorLuz = x;
    }
    
    public void establecerValorAgua(double x){
        valorAgua = x;
    }
    
    public void establecerIva(double x){
        iva = x;
    }
    
    @Override
    public void establecerArriendoMensual(){
        double subtotal = obtenerValorAgua() + obtenerValorLuz() + 
                obtenerCuotaBase();
        arriendoMensual = subtotal + (subtotal * (obtenerIva()/100));
    }
    
    public double obtenerValorLuz(){
        return valorLuz;
    }
    
    public double obtenerValorAgua(){
        return valorAgua;
    }
    
    public double obtenerIva(){
        return iva;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Ariendo de Local Comida\n"
                + "Nombre Arrendatario: %s\n"
                + "Apellido Arrendatario: %s\n"
                + "Edad Arrendatario: %d\n"
                + "Cuota base: %.2f\n"
                + "Valor luz: %.2f\n"
                + "Valor agua: %.2f\n"
                + "Porcentaje iva: %.2f\n"
                + "Arriendo Total: %.2f\n", 
                obtenerArrendatario().obtenerNombrePropietario().toLowerCase(),
                obtenerArrendatario().obtenerApelldoPropietario(),
                obtenerArrendatario().obtenerEdadPropietario(),
                obtenerCuotaBase(),
                obtenerValorLuz(),
                obtenerValorAgua(),
                obtenerIva(),
                obtenerArriendoMensual());
        
        return cadena;
    }
    
        
}
