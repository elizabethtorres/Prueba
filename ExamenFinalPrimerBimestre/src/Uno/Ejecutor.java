/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class Ejecutor {

    //El public static para poder ingresar por teclado
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //un boolean ara un ciclo repetitivo
        boolean bandera = true;
        
        //declaracion de variables
        int selec;
        int e = 0;

        //tipo String
        String nombre;
        String apellido;
        String titulo;
        String n_docente;
        String ape_docente;

        Alumno alumno;
        Docente docente_pro;
        Docente docente_base;

        //El ciclo repetitivo para los alumnos
        while (bandera) {

            //ingresar los datos de el alumno
            System.out.println("\t\tALUMNO\n");
            System.out.println("Ingresar el nombre:");
            nombre = entrada.next();
            System.out.println("Ingresar el apellido:");
            apellido = entrada.next();
            
            //ingresar los datos del docente de programacion
            System.out.println("\tDOCENTE PROGRAMACION\n");
            System.out.println("Ingresar el nombre:");
            n_docente = entrada.next();
            System.out.println("Ingresar el apellido:");
            ape_docente = entrada.next();
            System.out.println("Ingresar el titulo:");
            titulo = entrada.next();
            docente_pro = new Docente(n_docente, ape_docente, titulo); //aqui se van a guardar los datos del docente

            //ingresar losd atos del docente de base de datos
            System.out.println("\tDOCENTE BASE DE DATOS\n");
            System.out.println("Ingresar el nombre:");
            n_docente = entrada.next();
            System.out.println("Ingresar el apellido:");
            ape_docente = entrada.next();
            System.out.println("Ingresar el titulo:");
            titulo = entrada.next();
            docente_base = new Docente(n_docente, ape_docente, titulo);//aqui se van a guardar los datos del docente
            
            alumno = new Alumno(nombre, apellido, docente_pro,docente_base);//aqui se van a guardar los datos del alumno

            
            //para imprimir 
            System.out.println("-------------------------------------------------------");
            System.out.println(alumno.toString());
            System.out.println("-----DOCENTE PROGRAMACION--------------------");
            System.out.println(docente_pro.toString());
            System.out.println("-----DOCENTE DE BASE DE DATOS--------------------------");
            System.out.println(docente_base.toString());

            
            System.out.println("Desea seguir ingresando mas nombres: [1]SI  o [2]NO");
            selec = entrada.nextInt();

            //el ciclo repetito
            if (selec != 1) {
                bandera = false;
            } else {
                e = e + 1;
            }
        }
    }
}
