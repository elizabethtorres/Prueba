package Tres;

public class Ejecutor {

    public static void main(String args[]) {

        Coches coche = new Coches(65, "110L", "Negro", "Toyoto", 5);
        Microbuses micro = new Microbuses(23, "122G", "Azul", "Ford", 2);
        Camiones ca = new Camiones(23, "12F", "Verde", "Mitsubishi", 1);
        Furgonetas fur = new Furgonetas("21E", "Rojo", "Chevrolet", 3);

        Vehiculos vehiculo[] = new Vehiculos[4];

        // SE ASIGNAN LOS OBJETOS AL ARREGLO
        vehiculo[0] = coche;
        vehiculo[1] = ca;
        vehiculo[2] = micro;
        vehiculo[3] = fur;

        // SE PRESENTA EL OBJETO + EL METODO ABSTRACTO DE CADA UNO
        System.out.println("-------------------------------------------------");
        for (Vehiculos algun : vehiculo) {

            System.out.printf("%sPrecio alquiler: %.2f\n\n", algun, algun.obtener_precio_alquiler());
            System.out.println("------------------------------------------------");
        }

    }

}
