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
public class Asignatura {
    private String nombre;
    private Carrera carrera; //Clase CARRERA
    private int creditos;
    private Docente docente;
    
    //NOMBRE DE LA ASIGNATURA
    public void Establecer_nombre(String nomb){
        nombre = nomb;
    }
    public String Obtener_nombre(){
        return nombre;
    }
    //CARRERA
    public void Establecer_carrera(Carrera carr){
        carrera=carr;
    }
    public Carrera Obtener_carrera(){
        return carrera;
    }
    //CREDITOS
    public void Establecer_credito(int cred){
        creditos = cred;
    }
    public int Obtener_credito(){
        return creditos;
    }
    //DOCENTE
    public void Establecer_docente(Docente doce){
        docente = doce;
    }
    public Docente Obtener_docente(){
        return docente;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s (%d créditos) de la carrera %s "
                + "",Obtener_nombre(),Obtener_credito(),Obtener_carrera() );
        return cadena;
    }
    
    
    
}
