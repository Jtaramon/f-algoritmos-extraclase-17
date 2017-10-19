/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.Scanner;

/**
 *
 * @author Juan Ramón
 */
public class Principal {

    public static void main(String[] args) {
        
        System.out.println("Caso 1");
        Asignatura a1 = new Asignatura();
        a1.establecer_nombre("Matematicas");
        a1.establecer_creditos(8);
        Asignatura a2 = new Asignatura();
        a2.establecer_nombre("Fisica");
        a2.establecer_creditos(6);
        
        Titulo tit = new Titulo();
        tit.establecer_nombre("Licenciado en Fisico Matematicas");
        tit.establecer_nombre_universidad("Universidad Politecnica");
        Titulo tit2 = new Titulo();
        tit2.establecer_nombre("Magister en Docencia Matematica");
        tit2.establecer_nombre_universidad("Universidad Valenciana");
        
        Docente docente = new Docente ();
        docente.establecer_nombre("Luis V.");
        docente.establecer_apellidos("Perez J.");
        docente.establecer_asignatura(a1);
        docente.establecer_asignatura2(a2);
        docente.establecer_titulo_tercer(tit);
        docente.establecer_titulo_cuarto(tit2);
        
        System.out.println(docente);
        //Caso 2
        
        System.out.println("Caso 2");
        Asignatura a3 = new Asignatura();
        a3.establecer_nombre("Sociales");
        a3.establecer_creditos(9);
        Asignatura a4 = new Asignatura();
        a4.establecer_nombre("Literatura");
        a4.establecer_creditos(10);
        
        Titulo tit3 = new Titulo();
        tit3.establecer_nombre("Licenciado en ciencias sociales");
        tit3.establecer_nombre_universidad("Universidad Salesiana");
        Titulo tit4 = new Titulo();
        tit4.establecer_nombre("Magister en Docencia Social");
        tit4.establecer_nombre_universidad("Universidad Cataluña");
        
        Docente docente2 = new Docente ();
        docente2.establecer_nombre("Ana M.");
        docente2.establecer_apellidos("Velez P.");
        docente2.establecer_asignatura(a3);
        docente2.establecer_asignatura2(a4);
        docente2.establecer_titulo_tercer(tit3);
        docente2.establecer_titulo_cuarto(tit4);
        
        System.out.println(docente2);
    }

}
