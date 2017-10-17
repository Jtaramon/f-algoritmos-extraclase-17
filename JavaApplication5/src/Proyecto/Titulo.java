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
public class Titulo {
    private String nombre;
    private String nombre_universidad;
    private String nombre2;
    private String nombre_universidad2;
    
    //TITULO
    public void agregar_titulo(String titulo){
        nombre = titulo;
    }
    public String obtener_titulo(){
        return nombre;
    
        
    }   
    public void agregar_titulo2(String titulo){
        nombre2 = titulo;
    }
    public String obtener_titulo2(){
        return nombre2;
        
    }   
    //UNIVERSIDAD
    
    public void agregar_universidad(String uni){
        nombre_universidad = uni;
    }
    public String obtener_universidad(){
        return nombre_universidad;
        
    }
    public void agregar_universidad2(String uni){
        nombre_universidad2 = uni;
    }
    public String obtener_universidad2(){
        return nombre_universidad2;
        
    }
    
}
