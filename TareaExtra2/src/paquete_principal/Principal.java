/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;
import paquete_academico.*;
import paquete_estudiante.Estudiante;
import paquete_general.*;

/**
 *
 * @author Juan Ramón
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("CASO 1");
        Estudiante e1 = new Estudiante(); 
        e1.Establecer_nombre("Luis V.");
        e1.Establecer_apellido("Perez J.");
        
        Universidad uni = new Universidad();
        
        Pais pai = new Pais ();
        pai.Establecer_pais("Ecuador");
        uni.Establecer_pais(pai);
       
        uni.Establecer_nombre("Universidad Tecnica Particular de Loja");
        uni.Establecer_siglas("UTPL");
        
        e1.Establecer_universidad(uni);
        
        Asignatura asi = new Asignatura();
        Carrera car = new Carrera();
        car.Establecer_nombre("Sistemas");
        car.Establecer_modalidad("presencial");
        asi.Establecer_nombre("Matematicas");
        asi.Establecer_credito(10);
        asi.Establecer_carrera(car);
        
        
        System.out.println(e1);
        System.out.println(asi);
        
        
        
        
        
        System.out.println("CASO 2");
    }
    
}
