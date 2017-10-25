/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

/**
 *
 * @author Juan Ramón
 */
public class Carrera {
    private String nombre;
    private String modalidad;
    //NOMBRE DE LA CARRERA
    public void Establecer_nombre (String nomb){
        nombre=nomb;
    }
    public String Obtener_nombre (){
        return nombre;
    }
    //MODALIDAD DE LA CARRERA
    public void Establecer_modalidad (String mod){
        modalidad=mod;
    }
    public String Obtener_modalidad (){
        return modalidad;
    }

    @Override
    public String toString() {
        String cadena = String.format("de la carrera %s modalidad (%s)"
                ,Obtener_nombre(),Obtener_modalidad() );
        return cadena;

    }
    
    
}
