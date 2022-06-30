/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import paquete02.Automovil;
import paquete04.AutomovilDiesel;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        AutomovilDiesel autoD = new AutomovilDiesel(20, 20, 10);
        
        autoD.establecerNombresPropietario("Carlos Morocho");
        autoD.establecerPlaca("laa3180");
        autoD.calcularValorAuto();
        
        System.out.println(autoD);
    }
}
