/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;
import paquete02.Automovil;
/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil{
    double litrosTan;
    double costoLitro;
    int descLitro;
    double valorCan;
    
    public AutomovilDiesel(double litTan, double costLit, int desc) {
        litrosTan = litTan;
        costoLitro = costLit;
        descLitro = desc;
    }
    
    public void establecerLitrosTanque(double n) {
        litrosTan = n;
    }
    
    public void establecerCostoLitro(double n) {
        costoLitro = n;
    }
    
    public void establecerDescuentoLitro(int n) {
        descLitro = (n / 100);
    }
    
    @Override
    public void calcularValorAuto() {
        valorCan = (costoLitro * litrosTan * (descLitro - litrosTan));
    }
    
    public double obtenerLitrosTan() {
        return litrosTan;
    }
    
    public double obtenerCostoLitro() {
        return costoLitro;
    }
    
    public int obtenerDescuentoLitro() {
        return descLitro;
    }
    
    
    public String toString() {
        String cadena = String.format("\nAUTOMOVIL DIESEL\n"
                + "NOMBRE PROPIETARIO: %s\n"
                + "PLACA: %s\n"
                + "------------------------\n"
                + "LITROS TANQUE: %.2f\n"
                + "COSTO LITRO: %.2f\n"
                + "DESCUENTO LITRO: %d\n"
                + "VALOR A CANCELAR: %.2f\n",
                obtenerNombres(),
                obtenerPlaca(),
                obtenerLitrosTan(),
                obtenerCostoLitro(),
                obtenerDescuentoLitro(),
                obtenerValorAuto());
        
        return cadena;
    }
}
