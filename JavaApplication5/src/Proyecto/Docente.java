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
public class Docente {
    private String nombres;
    private String apellidos;
    private Asignatura asignatura_1;
    private Asignatura asignatura_2;
    
    private Titulo titulo_tercer_nivel;
    private Titulo titulo_cuarto_nivel;
    
    public void establecer_nombre (String n){
        nombres= n;
    }
    public String obtener_nombre (){
        return nombres;
    }

//NOmbres
    
    public void establecer_apellidos (String ap){
        apellidos = ap;
    }
    public String obtener_apellidos(){
        return apellidos;
    }
    
    
    
    public void establecer_asignatura (Asignatura a1){
        asignatura_1 = a1;
    }
    public Asignatura obtener_asignatura(){
        return asignatura_1;
    }
    
    
    public void establecer_asignatura2 (Asignatura a1){
        asignatura_2 = a1;
    }
    public Asignatura obtener_asignatura2(){
        return asignatura_2;
    }
    
    //TITULOS 
    public void establecer_titulo_tercer(Titulo n){
        titulo_tercer_nivel = n;
    }
    public Titulo obtener_titulo_tercer(){
        return titulo_tercer_nivel;
    }
    
    public void establecer_titulo_cuarto(Titulo n){
        titulo_cuarto_nivel = n;
    }
    public Titulo obtener_titulo_cuarto(){
        return titulo_cuarto_nivel;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del Docente:\nNombres: %s\nApellidos: %s"
                + "\nTiene a su cargo las asignaturas:\n\tAsignatura 1: %s\n"
                + "\tAsignatura 2: %s\nEl docente tiene los siguientes títulos académicos"
                + "\n\tTitulo 3er. Nivel: %s\n\tTitulo 4to Nivel: %s"
                ,obtener_nombre(),obtener_apellidos(),obtener_asignatura(),
                obtener_asignatura2(),obtener_titulo_tercer(),obtener_titulo_cuarto());
        return cadena;
    }
    
     
    
}
