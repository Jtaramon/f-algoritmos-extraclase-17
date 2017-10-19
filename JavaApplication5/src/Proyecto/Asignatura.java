/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Juan Ramón
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    
    public void establecer_nombre(String v){
        nombre = v;
    }
    public String obtener_nombre(){
        
        return nombre;
    }
    public void establecer_creditos(int c){
        creditos = c;
    }
    public int obtener_creditos(){
        
        return creditos;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s con Numero de Creditos %d"
                ,obtener_nombre(),obtener_creditos() );
        
        return cadena;
    }
    
    
    
    
    
}