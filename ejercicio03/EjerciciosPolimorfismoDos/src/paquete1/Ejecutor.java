/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete3.ArriendoLocalComercial;
import paquete3.ArriendoLocalComida;
import paquete3.ArriendoLocalSesiones;
import java.util.ArrayList;
import paquete2.Arriendo;
import paquete2.Propietario;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        ArrayList<Arriendo> listaArriendos = new ArrayList<>();
        
        Propietario p1 = new Propietario("Christian", "Shepherd", 51);
        ArriendoLocalComida arriendoComida = new ArriendoLocalComida(
                p1, 300);
        arriendoComida.establecerIva(10); // en porcentaje
        arriendoComida.establecerValorAgua(20.2); // en $
        arriendoComida.establecerValorLuz(40.2); // en $
        
        Propietario p2 = new Propietario("Christian", "Cruz", 19);
        ArriendoLocalComida arriendoComida2 = new ArriendoLocalComida(
                p2, 300, 10, 20.2, 40.2);
        
        
        Propietario p3 = new Propietario("Andrew", "Schroeder", 17);
        ArriendoLocalComercial arriendoComercial = new ArriendoLocalComercial(
                p3, 400);
        arriendoComercial.establecerValorAdicionalFijo(100); // en $
        
        Propietario p4 = new Propietario("Angelan", "Watson", 22);
        ArriendoLocalSesiones arriendoSesiones = new ArriendoLocalSesiones(
                p4, 350);
        arriendoSesiones.establecerValorSillas(10); // en $
        arriendoSesiones.establecerValorAmplificacion(20); // en $
        
        listaArriendos.add(arriendoComida);
        listaArriendos.add(arriendoComida2);
        listaArriendos.add(arriendoComercial);
        listaArriendos.add(arriendoSesiones);
        
        for (int i = 0; i < listaArriendos.size(); i++) {
            listaArriendos.get(i).establecerArriendoMensual(); // se llama al 
                                                            // m??todos abstracto
            System.out.println(listaArriendos.get(i));
            System.out.println();
        }
        
        
    }
}
