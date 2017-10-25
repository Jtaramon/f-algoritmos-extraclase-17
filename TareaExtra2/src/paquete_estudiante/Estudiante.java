/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_estudiante;
import paquete_academico.Universidad;
import paquete_academico.Docente;

/**
 *
 * @author Juan Ramón
 */
public class Estudiante {
    private String nombres;
    private String apellidos;
    private String asignatura_1;
    private String asignatura2;
    private Universidad universidad; //UNIVERSIDAD
    private Docente docen;
    
    
    //Nombre del Estudiante
    public void Establecer_nombre(String nombre){
        nombres = nombre;
    }
    public String Obtener_nombre(){
        return nombres;
    }
    //Apellido del Estudiante
    public void Establecer_apellido(String apell){
        apellidos = apell;
    }
    public String Obtener_apellido(){
        return apellidos;
    }
    //UNIVERSIDAD
    public void Establecer_universidad(Universidad uni){
        universidad = uni;
    }
    public Universidad Obtener_universidad (){
        return universidad;
    }
    //Asignatura
    public void Establecer_asig(String asi){
        asignatura_1 = asi;
    }
    public String Obtener_asig (){
        return asignatura_1;
    }
    //Asignatura 2
    public void Establecer_asig2(String asi){
        asignatura2 = asi;
    }
    public String Obtener_asig2 (){
        return asignatura2;
    }
    //Docente
    public void Establecer_docente(Docente doc){
        docen = doc;
    }
    public Docente Obtener_docente (){
        return docen;
    }
    

    @Override
    public String toString() {
        String cadena = String.format("Datos Del Estudiante:\nNombres: %s\n"
                + "Apellidos: %s\n"
                + "Universidad: %s\n"
                + "Tiene las siguientes asignaturas:\n\t"
                + "Asignatura 1: %s - %s\n\t"
                + "Asignatura 2: %s - %s\n",Obtener_nombre(),Obtener_apellido(),Obtener_universidad(),
                Obtener_asig(),Obtener_docente(),Obtener_asig2(),Obtener_docente());
        return cadena;
    }
    
    
    
}
