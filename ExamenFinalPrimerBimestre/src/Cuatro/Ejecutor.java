package Cuatro;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String args[]) {

        //Scanner para poder ingresar valores por teclado
        Scanner scan = new Scanner(System.in);

        //en el try vamos a poner todo lo que va a hacer el proyecto
        try {

            System.out.println("Ingrese su nombre");
            String nombre = scan.nextLine();
            System.out.println("Ingrese su apellido");
            String apellido = scan.nextLine();
            String[] calificaciones = {"10", "15", "l"};
            Persona p = new Persona(nombre, apellido, calificaciones);
            System.out.println(p);

            //catch para imprimir lo que es la excepcion
        } catch (Exception e) { // inicio de catch
            System.err.printf("\nExcepcion: %s\n", e); //err para que salga en rojo el error
            scan.nextLine();
            System.out.println("\nError, Debe introducir  de nuevo.");

        }

    }
}
