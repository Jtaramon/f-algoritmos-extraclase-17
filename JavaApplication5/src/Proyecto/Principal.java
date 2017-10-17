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
        Scanner teclado = new Scanner(System.in);

        //Variables
        String nombre;
        String apellido;

        //Asignatura
        String asignatura;
        String asignatura2;

        //Creditos:
        int credito1;
        int credito2;

        //Titulo 3er Nivel
        String titulo;
        String universidad;

        //Titulo 4to Nivel
        String titulo2;
        String universidad2;

        //Ingresar NOMBRES del DOCENTE:
        System.out.print("Ingrese Nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese Apellido: ");
        apellido = teclado.nextLine();

        //Asignaturas
        System.out.print("Ingrese Asignatura Nro. 1 = ");
        asignatura = teclado.nextLine();
        System.out.print("Creditos: ");
        credito1 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingrese Asignatura Nro. 2 = ");
        asignatura2 = teclado.nextLine();
        System.out.print("Creditos: ");
        credito2 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Titulo de 3er. Nivel: ");
        titulo = teclado.nextLine();
        System.out.print("Ingrese la Universidad: ");
        universidad = teclado.nextLine();
        System.out.print("Titulo de 4to. Nivel: ");
        titulo2 = teclado.nextLine();
        System.out.print("Ingrese la Universidad: ");
        universidad2 = teclado.nextLine();

        //..............
        Docente profesor = new Docente();
        //Agregar Nombre
        profesor.agregar_nombres(nombre);
        //Agregar Apellido
        profesor.agregar_apellidos(apellido);
        
        
        Asignatura materia = new Asignatura();
        materia.agregar_asignatura(asignatura);
        materia.agregar_asignatura2(asignatura2);
        
        
        Titulo titulos = new Titulo();
        titulos.agregar_titulo(titulo);
        titulos.agregar_titulo2(titulo2);
        titulos.agregar_universidad(universidad);
        titulos.agregar_universidad(universidad2);
        
        profesor.imprimir_docente();
    }

}
