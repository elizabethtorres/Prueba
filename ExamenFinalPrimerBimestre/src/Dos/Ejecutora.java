
package Dos;

import java.util.Scanner;

public class Ejecutora {
    
     public static void main(String[] args) {
          

        Garante g1 = new Garante("Gabriela", "Rodriquez", 900);
        Garante g2 = new Garante("Paul", "Ordoñez", 750);
        Garante g3 = new Garante("Kevin", "Torres", 1050);

        PrestamoAutomovil pg1 = new PrestamoAutomovil("Camion", "Toyota","Ramiro", 2000, 400 , 0.5, 3, g1, g2);
        System.out.println("\t\tPRESTAMO AUTOMOVIL");
        System.out.println("\t\t\t1");
        System.out.println(pg1);
        
        PrestamoAutomovil pg2 = new PrestamoAutomovil("Auto","Toyota", "Ivan",4000, 300, 15.5, 2,  g1, g3);
        System.out.println("\t\tPRESTAMO AUTOMOVIL");
        System.out.println("\t\t\t2");
        System.out.println(pg2);

        PrestamoEducativo peduca1 = new PrestamoEducativo("Luisa", 700.00, 15000, 15.5, 1, g1,"Unificado", "Tecnico", g2, g3);
        System.out.println("\t\tPRESTAMO EDUCATIVO");
        System.out.println("\t\t\t1");
        System.out.println(peduca1);
        
        PrestamoEducativo peduca2 = new PrestamoEducativo("Pedro", 900.00, 35000, 15.5, 5, g1, "Bachiller", "Dolorosa", g2, g3);
        System.out.println("\t\tPRESTAMO EDUCATIVO");
        System.out.println("\t\t\t2");
        System.out.println(peduca2);
        
        PrestamoEducativo peduca3 = new PrestamoEducativo("Steve", 450.00, 10000, 15.5, 3, g1, "Universitario", "Utpl", g2, g3);
        System.out.println("\t\tPRESTAMO EDUCATIVO");
        System.out.println("\t\t\t3");
        System.out.println(peduca3);
    }

}
    