
package Dos;

//clase hija de la clase Prestamo
public class PrestamoAutomovil extends Prestamo {

    //declaracion de los atributos de la clase
    private String tipo_vehiculo;
    private String marca_vehiculo;
    private Garante garante2;

    //constructor de los atributos añadiendo los atributos dem la clase madre
    public PrestamoAutomovil(String tipo_v, String marca_v, String nom_bene,
            double sueldo, double monto_pres, double inte, int tiempo_anios, Garante gara1, Garante gara2) {
        super(nom_bene, sueldo, monto_pres, inte, tiempo_anios, gara1); //super para añadir los atributos de ña clase madre
        setTipo_vehiculo(tipo_v);
        setMarca_vehiculo(marca_v);
        setGarante2(gara2);

    }

    //los get y los set de los atributos propios de la clase
    public void setTipo_vehiculo(String tipo_vehi) {
        tipo_vehiculo = tipo_vehi;
    }

    public void setMarca_vehiculo(String marca_vehi) {
        marca_vehiculo = marca_vehi;
    }

    public void setGarante2(Garante g2) {
        garante2 = g2;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public String getMarca_vehiculo() {
        return marca_vehiculo;
    }

    public Garante getGarante2() {
        return garante2;
    }

    @Override
    public String toString() {
        //un toString para q me retorne los get de la clase mas los de la clase madre con el super.toString
        System.out.println("----------------------------------------------------------");
        return String.format("PRESTAMO del AUTOMOVIL\nAutomovil %s\nTipo del Vehiculo %s\nMarca del Vehiculo %s\n\nGarante 2:\nNombre:%s\nApellido:%s\nSueldo:%.2f\n"
                ,super.toString(),getTipo_vehiculo(),getMarca_vehiculo(),getGarante2().getNombre(),getGarante2().getApellido(),getGarante2().getSueldo());
    }

    
}
