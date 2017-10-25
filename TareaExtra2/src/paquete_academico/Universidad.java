/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;
import  paquete_general.Pais;

/**
 *
 * @author Juan Ramón
 */
public class Universidad {
    private String nombre;
    private String siglas;
    private Pais pais;
    
    //NOMBRE DE LA UNIVERSIDAD
    public void Establecer_nombre(String nb){
        nombre = nb;
    }
    public String Obtener_nombre(){
        return nombre;
    }
    //NOMBRE DE LA UNIVERSIDAD
    public void Establecer_siglas(String nb){
        siglas = nb;
    }
    public String Obtener_siglas(){
        return siglas;
    }
    //PAIS
    public void Establecer_pais(Pais nb){
        pais = nb;
    }
    public Pais Obtener_pais(){
        return pais;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s (%s) - %s",
                Obtener_nombre(),Obtener_siglas(),Obtener_pais() );
        
        return cadena;
    }
    
    
    
}
