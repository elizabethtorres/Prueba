
package Cuatro;

//clase Persona
public class Persona {

    //declaracion de los atributos
    private String nombre;
    private String apellido;
    private String[] calificaciones;

    //constructor de los atributos
    public Persona(String n, String a, String[] cali) {
        set_nombre(n);
        set_apellido(a);
        set_calificaciones(cali);
    }
    
    //El set y get de  cada atributo de la clase
    
    public void set_nombre(String n) {
        nombre = n.toUpperCase();
    }

    public void set_apellido(String a) {
        apellido = a.toUpperCase();
    }

    public void set_calificaciones(String[] cali) {
        calificaciones = cali;
    }

    public String get_nombre() {
        return nombre;
    }

    public String get_apellido() {
        return apellido;
    }

    public String[] get_calificaciones() {
        return calificaciones;
    }

    //metodo para sacar el promedio
    public double get_promedio() {
        //declaro dos atributos mas 
        double suma = 0;
        double promedio = 0;
        
        //ciclo repetitivo para 
        for (String v : get_calificaciones()) {
            suma = suma + Double.parseDouble(v); //para sacar el valor de suma
        }
        promedio = suma / get_calificaciones().length; // sacar el valor de promedio
        return promedio;
    }

    @Override
    
    //toString
    public String toString() {
        //retorna nombre,apellido,promedio de notas
        return String.format("Nombre   es:   %s   -  Apellido   es   %s   -   Promedio   de   notas:   %f",
                get_nombre(), get_apellido(), get_promedio());

    }

}
