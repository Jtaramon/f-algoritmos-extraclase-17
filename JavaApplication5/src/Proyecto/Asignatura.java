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
    private String nombre2;
    private int creditos2;
    


//TITULO
    public void agregar_asignatura (String asignatura){
        nombre = asignatura;
    }
    public String obtener_asignatura (){
        return nombre;
    }
    public void agregar_asignatura2 (String asignatura){
        nombre2 = asignatura;
    }
    public String obtener_asignatura2 (){
        return nombre2;
    }
    
    
    
    //CREDITOS
    public void agregar_creditos (int creditos){
        this.creditos = creditos; 
    }
    public int obtener_creditos(){
        return creditos;
    }
    public void agregar_creditos2 (int creditos){
        creditos2 = creditos;
    }
    public int obtener_creditos2(){
        return creditos2;
    }
}
