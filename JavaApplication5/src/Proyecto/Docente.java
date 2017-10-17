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
    private String titulo_tercer_nivel;
    private String titulo_cuarto_nivel;
    private String asignatura_1;
    private String asignatura2;
    
    //NOMBRES
    public void agregar_nombres (String nombre){
        nombres=nombre;
    }
    public String obtener_nombres(){
        return nombres;
    }
    
    
    //APELLIDOS
    public void agregar_apellidos (String apellido){
        apellidos = apellido;
    }
    public String obtener_apellidos(){
        return apellidos;
        
    }
    
    
    
    //TITULO DE TERCER NIVEL
    public void agregar_tercernivel (String tercer){
        titulo_tercer_nivel = tercer;
    }
    public String obtener_tercernivel(){
        return titulo_tercer_nivel;
    }
    
    
    
    //TITULO DE CUARTO NIVEL
    public void agregar_cuartonivel (String cuarto){
        titulo_cuarto_nivel = cuarto;
    }
    public String obtener_cuartonivel(){
        return titulo_cuarto_nivel;
    }
    
    
    
    
    //ASIGNATURA 1
    public void agregar_asignatura (String asig){
        asignatura_1 = asig;
    }
    public String obtener_asignatura(){
        return asignatura_1;
    }
    
    
    
    
    //ASIGNATURA 2
    public void agregar_asignaturados (String asig){
        asignatura2 = asig;
        
    }
    public String obtener_asignaturados(){
        return asignatura2;
    }
    
    
    //DOCENTE>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    Asignatura materia = new Asignatura();
    Titulo titulo = new Titulo();
    public void imprimir_docente(){
        System.out.printf("Datos del Docente:\nNombres:"
                + " %s\nApellidos: %s\nTiene a su cargo las asignaturas:"
                + "\n\tAsignatura 1: %s con numero de creditos %d"
                + "\n\tAsignatura 2: %s con numero de creditos %d"
                + "\nEl docente tiene los siguientes títulos académicos"
                + "\n\tTitulo 3er nivel: %s - %s"
                + "\n\tTitulo 4to nivel: %s - %s\n"
                ,obtener_nombres(),obtener_apellidos(),
                materia.obtener_asignatura(),materia.obtener_creditos(),
                materia.obtener_asignatura2(),materia.obtener_creditos2(),
                titulo.obtener_titulo(),titulo.obtener_universidad(),
                titulo.obtener_titulo2(),titulo.obtener_universidad2());
    }
}
