/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;
import paquete_general.Pais;

/**
 *
 * @author Juan Ramón
 */
public class Docente {
    private String nombres;
    private String apellidos;
    private Pais pais;
    //NOMBRE DEL DOCENTE
    public void Establecer_nombre(String nom){
        nombres= nom;
    }
    public String Obtener_nombre(){
        return nombres;
    }
    //Apellido del DOCENTE
    public void Establecer_apellido(String apell){
        apellidos= apell;
    }
    public String Obtener_apellido(){
        return apellidos;
    }
    //PAIS
    public void Establecer_pais(Pais ps){
        pais = ps;
    }
    public Pais Obtener_pais(){
        return pais;
    }

    @Override
    public String toString() {
        String cadena = String.format("Docente: %s %s - Pais %s",Obtener_nombre(),Obtener_apellido(),Obtener_pais());
                return cadena;
    }
    
    
    
}
